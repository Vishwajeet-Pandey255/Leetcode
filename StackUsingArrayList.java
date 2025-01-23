// import java.util.ArrayList;

// public class StackUsingArrayList {

//     static class stack {
//         ArrayList<Integer> s = new ArrayList<>();

//         public void push(int x) {
//             s.add(x); // Corrected this line
//         }

//         public int pop() {
//             if (s.size() == 0) return -1;
//             return s.remove(s.size() - 1);
//         }

//         public int peek() {
//             if (s.size() == 0) return -1;
//             return s.get(s.size() - 1);
//         }

//         public boolean isEmpty() {
//             return s.size() == 0;
//         }
//     }

//     public static void main(String[] args) {
//         stack st = new stack();
//         st.push(10);
//         st.push(20);
//         // System.out.println(st.pop()); // Should print 20
//         // System.out.println(st.peek()); // Should print 10
//         // System.out.println(st.isEmpty()); // Should print false

//         while(!st.isEmpty()) {
//             System.out.println(st.pop());
//         }
//     }
// }