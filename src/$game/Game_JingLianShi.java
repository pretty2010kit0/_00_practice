package $game;

import java.util.Scanner;

//关于游戏：
//仓库 - 查看拥有银两，装备（暂时只有武器），符隶。
//精炼（消耗1练器符）
//    - 成功装备精练等级+1
//    - 失败装备消失 
//集市 - 购买+0装备和符隶
//    - 出售装备（精炼等级越高出售价格越高）
//任务 - 未开放
//装备分为10等，等级越高价格越高。

//符隶分为：
//练器符（精炼消耗练器符，无论成功与否）
//神运符（提高精炼成功率15%）
//保底符（精炼失败装备不消失，精炼等级-1）
//仙运符（提高精炼成功率25%）
//必成符（+5前精炼必成）
public class Game_JingLianShi {
	/**
	 * 【游戏——精炼师】代码乱 自用
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("【精炼师(文字版)Ver 0.1】");
		String jian[] = new String[11];// 武器名称
		int jianNum[] = new int[11];// 武器数量
		int jinglian[] = new int[110];// 同种武器区分
		String fu[] = new String[6];// 符隶名称
		int fuNum[] = new int[6];// 符隶数量
		Scanner sca = new Scanner(System.in);
		int yun = 0;// 神运符&仙运符 概率
		int di = 0;// 是否使用保底符 1使用 0未用
		int cheng = 0;// 是否使用必成符 1使用 0未用
		int zu = 1;// 符隶是否充足 1充足 0不足
		int sum = 0;// 我也不知道干啥的
		// 武器名称
		jian[1] = "桃木剑";
		jian[2] = "青刚剑";
		jian[3] = "松风剑";
		jian[4] = "两仪剑";
		jian[5] = "灵蛇剑";
		jian[6] = "奔雷剑";
		jian[7] = "游龙剑";
		jian[8] = "玄光剑";
		jian[9] = "归元剑";
		jian[10] = "诛仙剑";
		// 符隶名称
		fu[1] = "练器符";
		fu[2] = "神运符";
		fu[3] = "保底符";
		fu[4] = "仙运符";
		fu[5] = "必成符";
		// 选择操作
		int t[] = new int[10];
		// 物品初始化
		int money = 5000;// 银两
		jianNum[1] = 2;
		jianNum[3] = 0;
		fuNum[1] = 10;
		fuNum[5] = 0;
		jianNum[0] = -1;
		// 仓库显示
		System.out.print("---");
		System.out.print("仓库");
		System.out.println("--------------");
		System.out.println("| 银两：" + money);
		for (int i = 1; i <= 10; i++) {
			if (jianNum[i] != 0) {
				System.out.println("| " + jian[i] + "：" + jianNum[i]);
			}
		}
		for (int i = 1; i <= 5; i++) {
			if (fuNum[i] != 0) {
				System.out.println("| " + fu[i] + "：" + fuNum[i]);
			}
		}
		System.out.println("---------------------");
		while (true) {
			System.out.println("=====================");
			System.out.println("请选择行动：(1,查看仓库 2,精炼装备 3,逛集市 4,查看任务栏)");
			while (true) {
				t[1] = sca.nextInt();
				if (t[1] < 1 || t[1] > 4) {
					System.out.println("系统：输入出错!");
				} else {
					break;
				}
			}
			switch (t[1]) {
			// 查看仓库============================================================================================================
			case 1:
				System.out.print("---");
				System.out.print("仓库");
				System.out.println("--------------");
				System.out.println("| 银两：" + money);
				for (int i = 1; i <= 10; i++) {
					if (jianNum[i] != 0) {
						System.out.println("| " + jian[i] + "：" + jianNum[i]);
					}
				}
				for (int i = 1; i <= 5; i++) {
					if (fuNum[i] != 0) {
						System.out.println("| " + fu[i] + "：" + fuNum[i]);
					}
				}
				System.out.println("---------------------");
				break;
			// 精炼装备==========================================================================================================
			case 2:
				if (fuNum[1] == 0) {
					System.out.println("系统：练器符不足，自动返回主菜单");
					break;
				}
				System.out.println("请选择你要精炼的装备种类：(输入0返回主菜单)");
				int j = 0;
				for (int i = 1; i <= 10; i++) {// 遍历可以精炼的装备
					if (jianNum[i] != 0) {
						System.out.println(i + "," + jian[i]);
						j = j + 1;
					}
				}
				if (j == 0) {
					System.out.println("你没有要精炼的装备，自动返回主菜单");
					break;
				}
				while (true) {// 输入装备类型循环判定
					t[2] = sca.nextInt();
					if (t[2] < 0 || t[2] > 10 || jianNum[t[2]] == 0) {
						System.out.println("系统：输入出错!");
					} else {
						break;
					}
				}
				if (t[2] != 0) {
					System.out.println("请选择你要精炼的装备：(输入0返回主菜单)");
					for (int i = 1; i <= jianNum[t[2]]; i++) {// 遍历多个同类装备
						System.out.println(i + ",【" + jian[t[2]] + "(+"
								+ jinglian[t[2] * 10 + i] + ")】");
					}
					while (true) {// 输入同类装备循环判定
						t[3] = sca.nextInt();
						if (t[3] < 0 || t[3] > jianNum[t[2]]) {
							System.out.println("系统：输入出错!");
						} else {
							break;
						}
					}
					if (t[3] != 0) {
						while (true) {
							if (fuNum[1] == 0) {
								System.out.println("系统：练器符不足，自动返回主菜单");
								break;
							} else if (jianNum[t[2]] == 0) {
								System.out.println("系统：装备不足，自动返回主菜单");
								break;
							} else {
								yun = 0;
								di = 0;
								cheng = 0;
								zu = 1;
								System.out
										.println("请选择精炼类型：(1,练器 2,练器+神运 3,练器+保底 4,练器+神运+保底 5,练器+必成 6,练器+仙运 7,练器+仙运+保底 0,返回主菜单)");
								System.out.println("Tip:练器符 余" + fuNum[1]
										+ "，神运符 余" + fuNum[2] + "，保底符 余"
										+ fuNum[3] + "，仙运符 余" + fuNum[4]
										+ "，必成符 余" + fuNum[5]);
								t[4] = sca.nextInt();
								switch (t[4]) {
								case 2:
									if (fuNum[2] == 0) {
										System.out.println("系统：神运符不足，请重新选择");
										zu = 0;
									} else {
										yun = 15;
										fuNum[2] = fuNum[2] - 1;
									}
									break;
								case 3:
									if (fuNum[3] == 0) {
										System.out.println("系统：保底符不足，请重新选择");
										zu = 0;
									} else {
										di = 1;
										fuNum[3] = fuNum[3] - 1;
									}
									break;
								case 4:
									if (fuNum[2] == 0 || fuNum[3] == 0) {
										System.out
												.println("系统：神运符或保底符不足，请重新选择");
										zu = 0;
									} else {
										yun = 15;
										di = 1;
										fuNum[2] = fuNum[2] - 1;
										fuNum[3] = fuNum[3] - 1;
									}
									break;
								case 5:
									if (fuNum[5] == 0) {
										System.out.println("系统：必成符不足，请重新选择");
										zu = 0;
									} else {
										cheng = 1;
										fuNum[5] = fuNum[5] - 1;
									}
									break;
								case 6:
									if (fuNum[4] == 0) {
										System.out.println("系统：仙运符不足，请重新选择");
										zu = 0;
									} else {
										yun = 25;
										fuNum[4] = fuNum[4] - 1;
									}
									break;
								case 7:
									if (fuNum[4] == 0 || fuNum[3] == 0) {
										System.out
												.println("系统：仙运符或保底符不足，请重新选择");
										zu = 0;
									} else {
										yun = 25;
										di = 1;
										fuNum[3] = fuNum[3] - 1;
										fuNum[4] = fuNum[4] - 1;
									}
									break;
								}
								if (t[4] == 0) {
									break;
								} else if (zu == 1) {
									Thread.sleep(1000);
									System.out.println("精炼中..");
									Thread.sleep(1000);
									System.out.println("精炼中....");
									Thread.sleep(1000);
									System.out.println();
									if (jinglian[t[2] * 10 + t[3]] <= 6) {
										if ((int) (Math.random() * 100) < (7 - jinglian[t[2]
												* 10 + t[3]]) * 10
												|| (int) (Math.random() * 100) < yun
												|| cheng == 1) {
											System.out.println("精炼成功");
											System.out
													.println("获得【"
															+ jian[t[2]]
															+ "(+"
															+ (jinglian[1 * 10 + t[3]] + 1)
															+ ")】");
											jinglian[t[2] * 10 + t[3]] += 1;
											fuNum[1] = fuNum[1] - 1;
											System.out.println();
										} else {
											if (di == 1) {
												System.out
														.println("精炼失败，装备精炼-1");
												System.out
														.println("获得【"
																+ jian[t[2]]
																+ "(+"
																+ (jinglian[1 * 10 + t[3]] - 1)
																+ ")】");
												jinglian[t[2] * 10 + t[3]] -= 1;
												fuNum[1] = fuNum[1] - 1;
												System.out.println();
												break;
											} else {
												System.out.println("精炼失败，装备消失");
												System.out
														.println("【"
																+ jian[t[2]]
																+ "(+"
																+ (jinglian[1 * 10 + t[3]])
																+ ")】暴掉了！");
												jianNum[t[2]] -= 1;
												for (int i = t[3]; i <= j; i++) {
													jinglian[t[2] * 10 + i] = jinglian[t[2]
															* 10 + i + 1];
												}
												fuNum[1] = fuNum[1] - 1;
												System.out.println();
												break;
											}
										}
									} else {
										if ((int) (Math.random() * 100) < 10
												|| (int) (Math.random() * 100) < yun
												|| cheng == 1) {
											System.out.println("精炼成功");
											System.out
													.println("获得【"
															+ jian[t[2]]
															+ "(+"
															+ (jinglian[1 * 10 + t[3]] + 1)
															+ ")】");
											jinglian[t[2] * 10 + t[3]] += 1;
											fuNum[1] = fuNum[1] - 1;
											System.out.println();
										} else {
											if (di == 1) {
												System.out
														.println("精炼失败，装备精炼-1");
												System.out
														.println("获得【"
																+ jian[t[2]]
																+ "(+"
																+ (jinglian[1 * 10 + t[3]] - 1)
																+ ")】");
												jinglian[t[2] * 10 + t[3]] -= 1;
												fuNum[1] = fuNum[1] - 1;
												System.out.println();
												break;
											} else {
												System.out.println("精炼失败，装备消失");
												System.out
														.println("【"
																+ jian[t[2]]
																+ "(+"
																+ (jinglian[1 * 10 + t[3]])
																+ ")】暴掉了！");
												jianNum[t[2]] -= 1;
												for (int i = t[3]; i <= j; i++) {
													jinglian[t[2] * 10 + i] = jinglian[t[2]
															* 10 + i + 1];
												}
												fuNum[1] = fuNum[1] - 1;
												System.out.println();
												break;
											}
										}
									}
								}
							}
						}
					}
				}
				break;
			// 逛集市==============================================================================================================
			case 3:
				int price = (int) (Math.random() * 100 + 50);
				System.out.println("请输入行动：(1,购买 2,出售装备 0,返回主菜单)");
				System.out.println("Tip:今日物价：" + price + "%");
				while (true) {
					t[5] = sca.nextInt();
					if (t[5] < 0 || t[5] > 2) {
						System.out.println("系统：输入出错!");
					} else {
						break;
					}
				}
				if (t[5] == 1) {// 购买
					System.out.println("请输入购买种类：(1,装备 2,符隶 0,返回主菜单)");
					while (true) {
						t[4] = sca.nextInt();
						if (t[4] < 0 || t[4] > 2) {
							System.out.println("系统：输入出错!");
						} else {
							break;
						}
					}
					if (t[4] == 1) {
						while (true) {
							System.out.println("请输入购买装备和数量：( 输入0返回主菜单)");
							System.out.println("Tip:银两：" + money);
							for (int i = 1; i <= 10; i++) {
								System.out.println(i + "," + jian[i] + " "
										+ (600 * i - 300) * price / 100 + "银两");
							}
							t[5] = sca.nextInt();
							if (t[5] == 0) {
								break;
							} else {
								t[6] = sca.nextInt();
								if (t[6] * (600 * t[5] - 300) * price / 100 > money) {
									System.out.println("系统：银两不够，请重新输入!");
								} else {
									jianNum[t[5]] += t[6];
									money -= t[6] * (600 * t[5] - 300) * price
											/ 100;
									System.out.println("购买成功!获得：【" + jian[t[5]]
											+ "】 数量" + t[6]);
									break;
								}
							}
						}
					} else if (t[4] == 2) {
						while (true) {
							System.out.println("请输入购买符隶和数量：( 输入0返回主菜单)");
							System.out.println("Tip:银两：" + money);
							for (int i = 1; i <= 5; i++) {
								System.out
										.println(i + "," + fu[i] + " "
												+ (1000 * i - 500) * price
												/ 100 + "银两");
							}
							t[5] = sca.nextInt();
							if (t[5] == 0) {
								break;
							} else {
								t[6] = sca.nextInt();
								if (t[6] * (1000 * t[5] - 500) * price / 100 > money) {
									System.out.println("系统：银两不够，请重新输入!");
								} else {
									fuNum[t[5]] += t[6];
									money -= t[6] * (1000 * t[5] - 500) * price
											/ 100;
									System.out.println("购买成功!获得：【" + fu[t[5]]
											+ "】 数量" + t[6]);
									break;
								}
							}
						}
					}
				} else if (t[5] == 2) {// 出售
					System.out.println("请选择你要出售的装备种类：(输入0返回主菜单)");
					j = 0;
					for (int i = 1; i <= 10; i++) {// 遍历可以出售的装备
						if (jianNum[i] != 0) {
							System.out.println(i + "," + jian[i]);
							j = j + 1;
						}
					}
					if (j == 0) {
						System.out.println("你没有要出售的装备，自动返回主菜单");
						break;
					}
					while (true) {// 输入装备类型循环判定
						t[7] = sca.nextInt();
						if (t[7] < 0 || t[7] > 10 || jianNum[t[7]] == 0) {
							System.out.println("系统：输入出错!");
						} else {
							break;
						}
					}
					if (t[7] != 0) {
						System.out.println("请选择你要出售的装备：(输入0返回主菜单)");
						for (int i = 1; i <= jianNum[t[7]]; i++) {// 遍历多个同类装备
							sum = (600 * t[7] - 300) * price / 100;
							for (int s = 1; s <= jinglian[t[7] * 10 + i]; s++) {
								sum = sum * 3 / 2;
							}
							System.out.println(i + ",【" + jian[t[7]] + "(+"
									+ jinglian[t[7] * 10 + i] + ")】 " + sum
									+ "银两");
						}
						while (true) {// 输入同类装备循环判定
							t[8] = sca.nextInt();
							if (t[8] < 0 || t[8] > jianNum[t[7]]) {
								System.out.println("系统：输入出错!");
							} else {
								break;
							}
						}
						if (t[8] != 0) {
							jianNum[t[7]]--;
							for (int i = t[8]; i <= jianNum[t[7]]; i++) {
								jinglian[t[7] * 10 + i] = jinglian[t[7] * 10
										+ i + 1];
							}
							money = money + sum;
							System.out.println("出售成功!获得：" + sum + "银两");
						}
					}
				}
				break;
			// 任务栏==========================================================================================================
			case 4:
				System.out.println("系统：暂未实现此功能，敬请期待!");
				break;
			}
		}
	}
}

