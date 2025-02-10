package TWO_POINTERS;

public class long_pressed_name {
    public boolean isLongPressedName(String name, String typed) {
        int pointer = 0;
        for (int i = 0; i < name.length(); i++) {
            char current = name.charAt(i);
            boolean matched=false;
            while(pointer<typed.length()){
                if(current==typed.charAt(pointer)){
                    
                }
                matched=true;
                ++pointer;
            }
            if(!matched){return false;}
        }return true;
    }
}
