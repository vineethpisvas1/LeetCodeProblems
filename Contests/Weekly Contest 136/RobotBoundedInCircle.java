class Solution {
    public boolean isRobotBounded(String instructions) {
        int angleChange = 0, movement = 0;
        boolean result;
        for(int i=0; i<instructions.length(); i++) {
            if(instructions.charAt(i)=='R') {
                angleChange += 90;
            } else if(instructions.charAt(i)=='L') {
                angleChange -= 90;
            } else {
                movement++;
            }
        }
        if(movement==0) {
            result = true;
        } else if(movement!=0 && angleChange==0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}

/*class Solution {
    public boolean isRobotBounded(String instructions) {
        int angleChange = 0, movement = 0;
        for(int i=0; i<instructions.length(); i++) {
            if(instructions.charAt(i)=='R') {
                angleChange += 90;
            } else if(instructions.charAt(i)=='L') {
                angleChange -= 90;
            } else {
                movement++;
            }
        }
        if(movement==0) {
            return true;
        } else if(movement!=0 && angleChange==0) {
            return false;
        } else {
            int repetitions = (Math.abs(angleChange)%180)/90==0?2:4;
            String repeatedString="";
            for(int i=0; i<repetitions; i++) {
                repeatedString += instructions;
            }
            int x=0, y=0;
            char direction='U';
            for(int i=0; i<repeatedString.length(); i++) {
                switch(repeatedString.charAt(i)) {
                    case 'G':
                        if(direction=='U') {
                            y++;
                        } else if(direction=='R') {
                            x++;
                        } else if(direction=='D') {
                            y--;
                        } else if(direction=='L') {
                            x--;
                        }
                        break;
                    case 'R':
                        if(direction=='U') {
                            direction='R';
                        } else if(direction=='R') {
                            direction='D';
                        } else if(direction=='D') {
                            direction='L';
                        } else if(direction=='L') {
                            direction='U';
                        }
                        break;
                    case 'L':
                        if(direction=='U') {
                            direction='L';
                        } else if(direction=='R') {
                            direction='U';
                        } else if(direction=='D') {
                            direction='R';
                        } else if(direction=='L') {
                            direction='D';
                        }
                        break;
                    default:
                        break;
                }
            }
            return x==0 && y==0;
        }
    }
}*/