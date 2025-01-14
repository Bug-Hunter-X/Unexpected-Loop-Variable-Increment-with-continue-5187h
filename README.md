# Unexpected Loop Variable Increment with Java's continue Statement

This example demonstrates a subtle, uncommon bug in Java related to the `continue` statement within loops.  While seemingly straightforward, `continue`'s behavior in incrementing the loop variable *before* the next iteration can be counterintuitive, especially for developers accustomed to other languages.

The `UncommonBug.java` file contains code that showcases this behavior.  Observe how the output is missing 5, but also that the loop terminates as expected, even though only 9 is printed and x would have to be 10 to terminate.