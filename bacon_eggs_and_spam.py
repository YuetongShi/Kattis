n = int(input())
while n != 0:
    hash_map = {}
    for i in range(n):
        bill = input().split()

        for j in range(1, len(bill)):
            if bill[j] in hash_map:
                hash_map[bill[j]].append(bill[0])
            else:
                hash_map[bill[j]] = [bill[0]]

    hash_map_keys = sorted(hash_map)

    for k in hash_map_keys:
        output = k
        for v in sorted(hash_map[k]):
            output += " " + v

        print(output)
    print("")

    n = int(input())
