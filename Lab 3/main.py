import re
file_name = input("Write ethe file name among the below two file name: \n1. testing1.txt \n2. testing2.txt \n")

try:
	file = open(file_name)
except:
	print("Wrong file name input")

print("\n")

RegCount = int(file.readline())
RegIndex = []

for i in range (int(RegCount)):
	RegIndex.append(file.readline().rstrip())

InputCount = int(file.readline())
InputIndex = []

for i in range (int(InputCount))
InputIndex.append(file.readline().rstrip())

c = false
for i in range (InputCount):
	for r in range (Rcount):
		if re.compile(RegIndex[r]).search(InputIndex[i]):
			print("YES,", r+1)
			c = True
			break
		else:
			c = False
		if t == False:
			Print("NO, 0")