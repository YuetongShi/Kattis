data = input().split()
N, H, L = map(int, data)

# output id of highest HI
# num of movies, num on horror list, num of similarities

ids = input().split()
ids = [int(i) for i in ids]  # length is H

sim_pairs = {}
for i in range(N):
    sim_pairs[i] = []

for i in range(L):
    temp = input().split()
    member1, member2 = map(int, temp)
    sim_pairs[member1].append(member2)
    sim_pairs[member2].append(member1)

# print(sim_pairs)

HIs = [float('inf')] * N  #assume that no movie is horrible at all, update when found to be horrible or similar to other horrible movies
queue = []

for element in ids:
    # without condition
    HIs[element] = 0
    queue.append((element, 0))

for element in ids:
    while queue:
        for k in sim_pairs[queue[0][0]]:
            if HIs[k] == float('inf'):
                HIs[k] = queue[0][1] + 1
                queue.append((k, HIs[k]))
        queue.pop(0)

# print(HIs)
print(HIs.index(max(HIs)))
