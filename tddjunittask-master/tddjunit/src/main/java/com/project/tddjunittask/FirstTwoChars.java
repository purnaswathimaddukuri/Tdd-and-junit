package com.project.tddjunittask;

public class FirstTwoChars {

public String delete(String string) {
String res = "";
int len = string.length();
if(string == " " || (len == 2 && string.charAt(0) == 'A' && string.charAt(1) == 'A') || (len ==1 && string.charAt(0) == 'A'))
res = " ";
else if(len >=  2 && string.charAt(0) == 'A' && string.charAt(1) == 'A') {
res = res + string.substring(2,len);
}  
else if(len >= 1 && string.charAt(0) == 'A') {
        res = res + string.substring(1,len);
        }
else if(len >= 2 && string.charAt(1) == 'A') {
res = res + string.charAt(0) + string.substring(2,len);
} else {
res  = string;
}
return res;
}
}
