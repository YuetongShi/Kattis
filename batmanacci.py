data = input()
data = data.split()
N = int(data[0])
K = int(data[1])

bat = [0, 1]
for i in range(2, N + 1):
    fib.append(bat[-1] + bat[-2])   #bat[-1] and bat[-2] are subcases

while N > 2:
    if K > bat[n - 2]:  #remove the first part of bat[n]
        K -= bat[n - 2]  #update the position of K
        N -= 1
    else:
        N -= 2

if N == 2:
    print("A")
else:
    print("N")
