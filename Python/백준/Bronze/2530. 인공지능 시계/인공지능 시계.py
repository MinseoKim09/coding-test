a, b, c = map(int, input().split())
d = int(input())
total_seconds = a * 3600 + b * 60 + c + d
total_seconds %= 86400
a = total_seconds // 3600
b = (total_seconds % 3600) // 60
c = total_seconds % 60
print(a, b, c)