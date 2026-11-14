class Solution {
    public String reverseVowels(String s) {
        char a[] = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while(i < j) {

            if(a[i]!='A' && a[i]!='E' && a[i]!='I' && a[i]!='O' && a[i]!='U' &&
               a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u') {
                i++;
            }

            else if(a[j]!='A' && a[j]!='E' && a[j]!='I' && a[j]!='O' && a[j]!='U' &&
                    a[j]!='a' && a[j]!='e' && a[j]!='i' && a[j]!='o' && a[j]!='u') {
                j--;
            }

            else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        return new String(a);
    }
}