Intuition
To efficiently count strings that start and end with vowels for multiple ranges of queries, we can preprocess the data using a prefix sum array. This avoids recomputing the count of valid strings for overlapping ranges in multiple queries, optimizing the solution.

Approach
Identify Valid Strings:

Check if a string starts and ends with a vowel using the helper method isVowel().
Vowels are defined as 'a', 'e', 'i', 'o', 'u'.
Precompute Prefix Sum Array:

Create an array prefixArr where prefixArr[i] stores the cumulative count of valid strings from the beginning of the words
array up to index i.
Answer Queries:

For each query [li, ri], compute the count of valid strings in the range using the formula:
If li == 0: prefixArr[ri].
Otherwise: prefixArr[ri] - prefixArr[li - 1].
Return Results:

Store the results for all queries in an array ans and return it.
Complexity
Time complexity: O(n+q) n=length of word & q=length of queries
Space complexity:O(n+q) n=length of ans & q=length of prefixArr
