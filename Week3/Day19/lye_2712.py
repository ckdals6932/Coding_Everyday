unitStandard = {'kg':2.2046, 'lb':0.4536, 'l':0.2642, 'g':3.7854}
caseCnt = int(input())

def ChangeUnit(unit):
	if unit == 'kg':
		return 'lb'
	elif unit == 'lb':
		return 'kg'
	elif unit == 'l':
		return 'g'
	else:
		return 'l'

for i in range(0, caseCnt):
	inputData = list(input().split(' '))
	print('%.4f' % (float(inputData[0]) * unitStandard[inputData[1]]), ChangeUnit(inputData[1]))

	: 깔끔.