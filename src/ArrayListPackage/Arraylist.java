package ArrayListPackage;

import java.util.*;

public class Arraylist {
    public static class ArrayListApp<E> implements List<E>{
        private static final int DEFAULT_CAPACITY = 8;
        private Object[]  elements;
        public  int size;
        public ArrayListApp(){
            this.elements = new Object[DEFAULT_CAPACITY];
        }

        public  boolean add(E element){
            if(this.size == this.elements.length){
//                this.elements = grow();
                return false;
            }
                this.elements[this.size++] = element;
            return true;
        }


        public void ShowList(){
            System.out.println("\n danh sách phần tử " + size);
            for ( int i = 0 ; i <size; i++){
                System.out.println(elements[i]);
            }
        }


        private  Object[] grow(){
            return Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        private  Object[] shrinks(){
            return Arrays.copyOf(this.elements, this.elements.length / 2);
        }


        private boolean checkIndex(int index) {
            if( index >= 0 && index <= size){
                return true;
            }else{
                return false;
            }
        }
        private E getElement(int index){
            checkIndex(index);
            return (E) this.elements[index];
        }

//        public String getMaxFreqElement(String[] arr, int n){
//            int maxcount = 0;
//            String element_having_max_freq = String.valueOf(0);
//            for (int i = 0; i < n; i++) {
//                int count = 0;
//                for (int j = 0; j < n; j++) {
//                    if (arr[i] == arr[j]) {
//                        count++;
//                    }
//                }
//
//                if (count > maxcount) {
//                    maxcount = count;
//                    element_having_max_freq = arr[i];
//                }
//            }
//
//            return element_having_max_freq;
//        }

        public  int getMaxFreqElement(E element,int maxX){

            E xvlue = null;
            int Xcount = 0;
            int i,j;
                for(i = 0 ; i <this.size; i ++){
                    int presentcount = 0;
                    for(j=i; j<this.size; j++){
                        if(this.elements[i] == this.elements[j]){
                            presentcount ++;
                        }
                    }if(presentcount > Xcount){
                        xvlue = (E) this.elements[i];
                        Xcount = presentcount;
                    }
                }
                maxX = (int) xvlue;
                return Xcount;
        }

        @Override
        public E set(int index, E element) {
            checkIndex(index);
            E oldElement = this.getElement(index);
            this.elements[index] = element;
            return oldElement;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public E remove(int index) {
            if(checkIndex(index)){
                E oldElement = (E) this.elements[index];
                this.elements[index] = null;
                shift(index);
                this.size--;
                return oldElement;
            }else {
                return null;
            }

        }
        private void shift(int index){
            for(int i = index; i<this.size-1; i++){
                this.elements[i] = this.elements[i+1];
            }
        }

        @Override
        public int indexOf(Object o) {
            int vtri = 1;
            int i = 0;
            while(i< this.size){

            }
            return 0;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }


        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public E get(int index) {
            checkIndex(index);
            return null;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return null;
        }


        public int numberOf(E element){

            int a = 0;
            int i = 0;

            while(i<this.size ){

                if(this.elements[i] == element){
                    a++;
                }
                i++;
            }
            return a;

        }
    }


}
