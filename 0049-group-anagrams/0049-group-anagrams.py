class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # TC: O(n)  SC: O(n)
        track = {}
        for item in strs:
            sortStr = "".join(sorted(item))
            if sortStr in track:
                track[sortStr].append(item)
            else:
                track[sortStr] = [item]
        
        return track.values()
        