# TC: O(n), SC: O(n)
nums_set = set(nums)
max_seq = 0
for i in nums_set:
    # IMP Condition, To check that it is a start of the sequence.
    if i-1 not in nums_set:
        curr_i = i
        seq = 1
        while curr_i + 1 in nums_set:
            seq += 1
            curr_i += 1
        max_seq = max(max_seq, seq)
return max_seq
