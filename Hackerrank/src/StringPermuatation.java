import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class StringPermuatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringPermuatation sp= new StringPermuatation();
		List<String> list=sp.permutation(str.toCharArray());
		int count=1;
		for(String s:list){
			System.out.println(s);
			count++;
		}
	}

	public List<String> permutation(char[] input){
	
		Map<Character,Integer> treeMap=new TreeMap<Character,Integer>();
		for(char c:input){
				treeMap.compute(c, (key,value) -> {
					if(value==null){
						return 1;
					}else{
						return value+1;
					}
				});
		}
		char[] str=new char[treeMap.size()];
		int[] count=new int[treeMap.size()];
		int index=0;		
		for(Map.Entry<Character, Integer> e:treeMap.entrySet() ){
			str[index]=e.getKey();
			count[index]=e.getValue();
			index++;
		}
		List<String> resultList=new ArrayList<String>();
		char[] output=new char[input.length];
		permuteUtil(str,count,output,0,resultList);
		
		return resultList;
	}
	
	public void permuteUtil(char[] input,int[] count,char[] result,int level,List<String> resultList){
		
		if(level==result.length){
			resultList.add(new String(result));
			return;
		}
		
		for(int i=0;i<input.length;i++){
			if(count[i]==0){
				continue;
			}
			result[level]=input[i];
			count[i]--;
			permuteUtil(input, count, result, level+1, resultList);
			count[i]++;
		}
		
		
	}
	
}
