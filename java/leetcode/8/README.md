# [8. String to Integer (atoi)](https://leetcode.com/problems/partition-equal-subset-sum/description/)

<span style="color:orange">Medium<span>

Implement `myAtoi(string s)` function `myAtoi(string s)` that converts a string into a 32-bit signed integer.  

## Algorithm

1. **Whitespace Handling**: Ignore any leading whitespace (`" "`).  
2. **Signedness Detection**:  
   - Determine the sign by checking if the next character is `'-'` or `'+'`.  
   - Assume the number is positive if neither is present.  
3. **Integer Conversion**:  
   - Skip leading zeros and read digits until a non-digit character is encountered or the end of the string is reached.  
   - If no valid digits are read, return `0`.  
4. **Clamping to 32-bit Range**:  
   - If the integer is outside the 32-bit signed integer range `[-2³¹, 2³¹ - 1]`, clamp it to the range.  
     - Values less than `-2³¹` should be rounded to `-2³¹`.  
     - Values greater than `2³¹ - 1` should be rounded to `2³¹ - 1`.  

Return the parsed and clamped integer.  

---

## Examples

### Example 1:

**Input**:  
`s = "42"`

**Output**:  
`42`

**Explanation**:  

The underlined characters are what is read, and the caret (`^`) shows the current position:  

Step 1: `"42"` (no leading whitespace)  
`         ^`  
Step 2: `"42"` (no `'-'` or `'+'`)  
`         ^`  
Step 3: `"42"` (`"42"` is read)  
`           ^`  

---

### Example 2:

**Input**:  
`s = "   -042"`

**Output**:  
`-42`

**Explanation**:  

Step 1: `"   -042"` (leading whitespace ignored)  
`            ^`  
Step 2: `"   -042"` (`'-'` is read, making the result negative)  
`             ^`  
Step 3: `"   -042"` (`"042"` is read; leading zeros ignored)  
`               ^`  

---

### Example 3:

**Input**:  
`s = "1337c0d3"`

**Output**:  
`1337`

**Explanation**:  

Step 1: `"1337c0d3"` (no leading whitespace)  
`         ^`  
Step 2: `"1337c0d3"` (no `'-'` or `'+'`)  
`         ^`  
Step 3: `"1337c0d3"` (`"1337"` is read; stops at `'c'`)  
`             ^`  

---

### Example 4:

**Input**:  
`s = "0-1"`

**Output**:  
`0`

**Explanation**:  

Step 1: `"0-1"` (no leading whitespace)  
`         ^`  
Step 2: `"0-1"` (no `'-'` or `'+'`)  
`         ^`  
Step 3: `"0-1"` (`"0"` is read; stops at `'-'`)  
`          ^`  

---

### Example 5:

**Input**:  
`s = "words and 987"`

**Output**:  
`0`

**Explanation**:  

Step 1: `"words and 987"` (first character is non-numeric `'w'`)  
`         ^`  
No valid digits are read, so the result is `0`.  

---

## Constraints

- `0 <= s.length <= 200`  
- `s` consists of English letters (lower-case and upper-case), digits (`0-9`), `' '`, `'+'`, `'-'`, and `'.'`.  