package HW7;

import java.util.Arrays;

public class ArrayString implements ArrayStringInterface{
   private String[] elements;
   private int elementsCount;

    public ArrayString() {
        this.elements = new String[1];
    }

    @Override
    public boolean add(int index, String value) {

        try {
            this.elements[index] = value;
        }catch (ArrayIndexOutOfBoundsException exception){
            if (index > this.elementsCount) {
                String[] newArrayString = new String[index + 1];
                for (int i = 0; i < this.elements.length; i++) {
                    newArrayString[i] = this.elements[i];
                }
                this.elements = newArrayString;

                this.elements[index] = value;
            }
        }

        return true;
    }

    @Override
    public boolean add(String value) {
       int tmp = this.elementsCount;
        try {
            this.elements[tmp++] = value;
        }catch (ArrayIndexOutOfBoundsException exception){
           int newLength =  (this.elements.length * 3)/2 + 1;

           String[] newArrayString = new String[newLength];
           for(int i = 0; i < this.elements.length; i++){
               newArrayString[i] = this.elements[i];
           }
            this.elements = newArrayString;

            this.add(value);
        }

        this.elementsCount = tmp;

        return true;
    }

    @Override
    public boolean delete(int index) {
        try {
            this.elements[index] = null;
        }catch (ArrayIndexOutOfBoundsException exception){
            return false;
        }

        return true;
    }

    @Override
    public boolean delete(String value) {
        boolean trigger = false;
        for (int i = 0; i < this.elements.length; i++) {
            if (value.equals(this.elements[i])) {
                this.elements[i] = null;
                trigger = true;
            }
        }
        return trigger;
    }

    @Override
    public String get(int index) {
        try {
            return this.elements[index];
        }catch (ArrayIndexOutOfBoundsException exception){
            return null;
        }
    }

    @Override
    public String toString() {
        return "ArrayString{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
