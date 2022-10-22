var target2 = getHostname()
var tes1 = getServerMaxMoney(target2) * 0.77;
var tes2 = getServerMinSecurityLevel(target2) + 5;
var timetohack = getHackTime(target2)
while (true) {
	print(target2)
	nuke
	brutessh
	sleep(2000)
	tprint("hack to gain root done.")
	sleep(3000)
		tprint("your time to hack")
		tprint(timetohack)
		nuke
		if (getServerSecurityLevel(target2) > tes2) {
			print("done.")
			weaken(target2);
		} else if (getServerMoneyAvailable(target2) < tes1) {
			print("done.")
			grow(target2);
		} else {
            print("done.")
			hack(target2);
		}
	
}
sleep(3000)
