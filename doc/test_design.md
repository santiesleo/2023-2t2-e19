# Test Design
___

## Functions

We are going to use the following functions in these tests:

- `dualChekSum(bytesBlocks: List[Int]) : BigInt`
- `singleChekSum(bytesBlocks: List[Int]) : BigInt`

___

## Test Plan

- `Data1`:
    - `helloBytesList`: [72, 101, 108, 108, 111]
    - `worldBytesList`: [87, 111, 114, 108, 100]
    - `scalaBytesList`: [83, 99, 97, 108, 97]
    - `pythonBytesList`: [80, 121, 116, 104, 111, 110]
    - `javaBytesList`: [74, 97, 118, 97]
___

## Test Cases

*Function: `singleCheckSum`*

| Class     | Method   | Input Data        | Description Input | Expected Result | Type Test |
|-----------|----------|-------------------|-------------------|-----------------|-----------|
| SingleSum | checksum | `helloBytesList`  | "Hello"           | 500             | True      |
| SingleSum | checksum | `worldBytesList`  | "World"           | 520             | True      |
| SingleSum | checksum | `scalaBytesList`  | "Scala"           | 484             | True      |
| SingleSum | checksum | `pythonBytesList` | "Python"          | 642             | True      |
| SingleSum | checksum | `javaBytesList`   | "Java"            | 386             | True      |

*Function: `dualCheckSum`*

| Class   | Method   | Input Data        | Description Input | Expected Result | Type Test |
|---------|----------|-------------------|-------------------|-----------------|-----------|
| DualSum | checksum | `helloBytesList`  | "Hello"           | 36085           | True      |
| DualSum | checksum | `worldBytesList`  | "World"           | 1802            | True      |
| DualSum | checksum | `scalaBytesList`  | "Scala"           | 36069           | True      |
| DualSum | checksum | `pythonBytesList` | "Python"          | 39300           | True      |
| DualSum | checksum | `javaBytesList`   | "Java"            | 39811           | True      |


## Expected results
We expected all assertions to pass successfully, indicating that the checksum algorithms work correctly at different stages. These tests are positive because the data is consistent, and there was no loss of information.
___

*Function: `singleCheckSum`*

| Class     | Method   | Input Data               | Description Input | Expected Result | Type Test |
|-----------|----------|--------------------------|-------------------|-----------------|-----------|
| SingleSum | checksum | [72, 101, 108, 108, 101] | "Helle"           | 500             | False     |
| SingleSum | checksum | [87, 101, 114, 108, 100] | "Werld"           | 520             | False     |

*Function: `dualCheckSum`*

| Class   | Method   | Input Data               | Description Input | Expected Result | Type Test |
|---------|----------|--------------------------|-------------------|-----------------|-----------|
| DualSum | checksum | [72, 101, 108, 108, 101] | "Helle"           | 36085           | False     |
| DualSum | checksum | [87, 101, 114, 108, 100] | "Werld"           | 1802            | False     |

## Expected results
These tests are negative because the data is inconsistent, resulting in a information distortion.