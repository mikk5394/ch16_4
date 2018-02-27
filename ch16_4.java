package ch16;
/*
4. Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
list of the last occurrence of that value, or  1 if the value is not found in the list. For example, if a variable
list stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
If the call had instead been list.lastIndexOf(3), the method would return –1.
 */
public class ch16_4 {
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(18);
        liste.add(2);
        liste.add(7);
        liste.add(18);
        liste.add(39);
        liste.add(18);
        liste.add(40);
        System.out.println(liste.lastIndexOf(18));

    }
    /*
    Kaldte liste:

    public int lastIndexOf(int value){

        ListNode current = front;
        int index = -1;
        int counter = 0;

        // Looper så længe at nuværende node indeholder data.
        // Starter aldrig loopet hvis fronten er null (dvs. en tom liste), og returnerer -1
        // hvis indtastet value ikke forekommer i listen.
        while (current != null){
            if (current.data == value){
                index = counter;
            }
            counter++;
            current = current.next;
        }
        return index;
    }
     */
}
