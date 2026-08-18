        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            
            // Check for overflow before multiplying by 10 and adding lastDigit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Underflow for negative numbers
            }
            
            rev = rev * 10 + lastDigit;
        }
        
        return rev;
    }
}
