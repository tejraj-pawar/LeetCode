class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # TC: ????
        track = {}
        for num in nums:
            if num in track:
                track[num] += 1
            else:
                track[num] = 1

        pairs = list(track.items())
        pairs = [(x,y) for (y,x) in pairs]
        pairs.sort(reverse=True)

        return [x for (y,x) in pairs[:k]]
