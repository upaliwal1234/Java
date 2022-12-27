// 2279. Maximum Bags With Full Capacity of Rocks
// You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks.
// The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.
// Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
class Solution(object):
    def maximumBags(self, capacity, rocks, additionalRocks):

        for i in range(len(capacity)):
            capacity[i] -= rocks[i]
        capacity.sort()
        for i, c in enumerate(capacity):
            if c > additionalRocks:
                return i
            additionalRocks -= c
        return len(capacity)
