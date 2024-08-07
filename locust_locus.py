def lcm(a, b):
    """
    (int, int) -> int
    In this function, 'a' is always smaller than 'b'
    """

    result = a
    while result % b != 0:
        result += a

    return result


k = int(input())
years = []
for i in range(k):
    data = input().split()
    y, c1, c2 = map(int, data)
    years.append(y + lcm(c1, c2))

print(min(years))
