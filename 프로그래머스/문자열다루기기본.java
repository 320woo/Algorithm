package Programmers;
import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //Character.UpperCase()�� �빮�ڷ� ��ȯ�Ͽ� if�� ���̱� ����
        
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                  (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) answer = false;
            }
        }
        
        else answer = false;
        
        return answer;
    }
}
