#Fonte: https://rosettacode.org/wiki/Sorting_algorithms/Shell_sort

import time
ini = time.time()

def shell(seq):
    inc = len(seq) // 2
    while inc:
        for i, el in enumerate(seq):
            while i >= inc and seq[i - inc] > el:
                seq[i] = seq[i - inc]
                i -= inc
            seq[i] = el
        inc = 1 if inc == 2 else int(inc * 5.0 / 11)
 
data = [22, 7, 2, -5, 8, 4]
shell(data)
print("Tempo de Execução: ", fim-ini
print (data)