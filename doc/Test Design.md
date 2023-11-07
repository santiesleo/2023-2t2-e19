# Test Design

___

## Functions

We are going to use the following function in these tests:

- `checkSum(bitBlocks: List[String]) : String`

___

## Test Plan

- `Data1`:
    - `helloBitsList`: ["01001000", "01100101", "01101100", "01101100", "01101111"]
    - `worldBitsList`: ["01010111", "01101111", "01110010", "01101100", "01100100"]
    - `scalaBitsList`: ["01010011", "01100011", "01100001", "01101100", "01100001"]
    - `pythonBitsList`: ["01010000", "01111001", "01110100", "01101000", "01101111", "01101110"]
    - `javaBitsList`: ["01001010", "01100001", "01110110", "01100001"]

___

## Test Cases

*Function: `checkSum` of class `SingleSum`*

| Class     | Method   | Input Data       | Description Input | Expected Result    | Type Test |
|-----------|----------|------------------|-------------------|--------------------|-----------|
| SingleSum | checksum | `helloBitsList`  | "Hello"           | "0010001111010010" | Positive  |
| SingleSum | checksum | `worldBitsList`  | "World"           | "0010110111011100" | Positive  |
| SingleSum | checksum | `scalaBitsList`  | "Scala"           | "0001010111010000" | Positive  |
| SingleSum | checksum | `pythonBitsList` | "Python"          | "0011010001010000" | Positive  |
| SingleSum | checksum | `javaBitsList`   | "Java"            | "1100000011000010" | Positive  |

*Function: `checkSum` of class `DualSum`*

| Class   | Method   | Input Data       | Description Input | Expected Result    | Type Test |
|---------|----------|------------------|-------------------|--------------------|-----------|
| DualSum | checksum | `helloBitsList`  | "Hello"           | "1111010100101010" | Positive  |
| DualSum | checksum | `worldBitsList`  | "World"           | "0000101001110110" | Positive  |
| DualSum | checksum | `scalaBitsList`  | "Scala"           | "1110010100100001" | Positive  |
| DualSum | checksum | `pythonBitsList` | "Python"          | "1000010011110100" | Positive  |
| DualSum | checksum | `javaBitsList`   | "Java"            | "1000001100101111" | Positive  |

## Expected results

We expected all assertions to pass successfully, indicating that the checksum algorithms work correctly at different
stages. These tests are positive because the data is consistent, and there was no loss of information.

___

*Function: `checkSum` of class `SingleSum`*

| Class     | Method   | Input Data                                                   | Description Input                                                                                                        | Expected Result                                                                                                            | Type Test |
|-----------|----------|--------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------|
| SingleSum | checksum | ["01001000", "01100101", "01101100", "01101100", "01100101"] | The original message sent was "Hello", however, a single bit alteration transformed the received information to "Helle". | With the word "Hello" we expected this result "0010001111010010", but with the alteration the result is "0001100111010010" | Negative  |
| SingleSum | checksum | ["01010111", "01100101", "01110010", "01101100", "01100100"] | The original message sent was "World", however, a single bit alteration transformed the received information to "Werld". | With the word "World" we expected this result "0010110111011100", but with the alteration the result is "0010110111010010" | Negative  |

*Function: `checkSum` of class `DualSum`*

| Class   | Method   | Input Data                                                   | Description Input                                                                                                        | Expected Result                                                                                                            | Type Test |
|---------|----------|--------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------|
| DualSum | checksum | ["01001000", "01100101", "01101100", "01101100", "01100101"] | The original message sent was "Hello", however, a single bit alteration transformed the received information to "Helle". | With the word "Hello" we expected this result "1111010100101010", but with the alteration the result is "1110101100100000" | Negative  |
| DualSum | checksum | ["01010111", "01100101", "01110010", "01101100", "01100100"] | The original message sent was "World", however, a single bit alteration transformed the received information to "Werld". | With the word "World" we expected this result "0000101001110110", but with the alteration the result is "0000000001011000" | Negative  |

## Expected results

In the positive tests, we have confirmed that the checksum works correctly, providing the expected results. In the case
of negative tests, our goal is to demonstrate that any modification, even as minor as changing a single bit in the
data input, will cause an alteration of the checksum. The result is a distortion of the information, which demonstrates
the sensitivity and accuracy of the checksum.