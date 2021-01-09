/*角色*/
insert into hero (name, level, rare, ap, dp)
values ('钟离', 80, 'SSR', 233, 686);

insert into hero (name, level, rare, ap, dp)
values ('温迪', 70, 'SSR', 214, 543);

insert into hero (name, level, rare, ap, dp)
values ('七七', 70, 'SSR', 285, 573);

/*用户*/
insert into account (birth, level, name, description)
values ('94-01-04', 23, '知乎', 'hello world');

insert into account (birth, level, name, description)
values ('93-01-04', 34, '微信', 'hello world');

insert into account (birth, level, name, description)
values ('92-01-04', 58, '百度', 'hello world');

insert into account (birth, level, name, description)
values ('91-01-04', 67, '陌陌', 'hello world');

insert into account (birth, level, name, description)
values ('90-01-04', 47, '人傻了', 'hello world');

insert into account (birth, level, name, description)
values ('44-01-04', 42, '我服了', 'hello world');

/*武器*/
insert into weapon (ap, level, name, rare, talent)
values (127.0, 80, '狼的末路', 'SSR', '如狼般狩猎者：攻击力提高40%；
攻击命中生命值低于30%的敌人时，队伍中所有成员的攻击力提高80%，持续12秒。该效果30秒只能触发一次。');

insert into weapon (ap, level, name, rare, talent)
values (46.0, 80, '四风原典', 'SSR', '无边际的眷顾：移动速度提高10%；在场上每4秒获得16%元素伤害加成。该效果最多叠加4层，角色倒下或离场后清空。');

insert into weapon (ap, level, name, rare, talent)
values (283.0, 80, '天空之刃', 'SSR', '穿刺高天的利齿：暴击率提升8%；
施放元素爆发时，获得破空之势：移动速度提升10%，攻击速度提升10%，普通攻击与重击命中时，额外造成40%攻击力的伤害，持续12秒');

insert into weapon (ap, level, name, rare, talent)
values (178.0, 80, '天空之脊', 'SSR', '斫断黑翼的利齿：暴击率提8%/10%/12%/14%/16%， 普通攻击速度提升12%,
此外，普通攻击与重击命中敌人时，有50%概率触发真空刃，在小范围内造成额外100%攻击力的伤害。该效果每2秒至多触发一次');

insert into weapon (ap, level, name, rare, talent)
values (87.0, 80, '阿莫斯之弓', 'SSR', '矢志不忘：·普通攻击和瞄准射击伤害提升24%;箭矢发射后每经过0.1秒，伤害还会提升16%。至多提升5次。');
