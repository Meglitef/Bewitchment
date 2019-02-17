package com.bewitchment.client.render.entity.model;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * salamander - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelNewt extends AdvancedModelBase {
	public AdvancedModelRenderer body01;
	public AdvancedModelRenderer body02;
	public AdvancedModelRenderer neck;
	public AdvancedModelRenderer lArm01;
	public AdvancedModelRenderer rArm01;
	public AdvancedModelRenderer tail01;
	public AdvancedModelRenderer lLeg01;
	public AdvancedModelRenderer rLeg01;
	public AdvancedModelRenderer tail02;
	public AdvancedModelRenderer tail03;
	public AdvancedModelRenderer tail04;
	public AdvancedModelRenderer tail05;
	public AdvancedModelRenderer lLeg02;
	public AdvancedModelRenderer lFoot;
	public AdvancedModelRenderer lBToes;
	public AdvancedModelRenderer lBToe01;
	public AdvancedModelRenderer lBToe02;
	public AdvancedModelRenderer lBToe03;
	public AdvancedModelRenderer lBToe04;
	public AdvancedModelRenderer lBToe05;
	public AdvancedModelRenderer rLeg02;
	public AdvancedModelRenderer rFoot;
	public AdvancedModelRenderer rBToes;
	public AdvancedModelRenderer rBToe01;
	public AdvancedModelRenderer rBToe02;
	public AdvancedModelRenderer rBToe03;
	public AdvancedModelRenderer rBToe04;
	public AdvancedModelRenderer rBToe05;
	public AdvancedModelRenderer head;
	public AdvancedModelRenderer snout;
	public AdvancedModelRenderer lowerJaw;
	public AdvancedModelRenderer lEye;
	public AdvancedModelRenderer rEye;
	public AdvancedModelRenderer lArm02;
	public AdvancedModelRenderer lForeFoot;
	public AdvancedModelRenderer lFToes01;
	public AdvancedModelRenderer lFToe01;
	public AdvancedModelRenderer lFToe02;
	public AdvancedModelRenderer lFToe03;
	public AdvancedModelRenderer lFToe04;
	public AdvancedModelRenderer rArm02;
	public AdvancedModelRenderer rForeFoot;
	public AdvancedModelRenderer rFToes01;
	public AdvancedModelRenderer rFToe01;
	public AdvancedModelRenderer rFToe02;
	public AdvancedModelRenderer rFToe03;
	public AdvancedModelRenderer rFToe04;

	public ModelNewt() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.lFToe04 = new AdvancedModelRenderer(this, 0, 59);
		this.lFToe04.setRotationPoint(-0.6F, 0.8F, -0.4F);
		this.lFToe04.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lFToe04, 0.05235987755982988F, 0.593411945678072F, 0.0F);
		this.lArm02 = new AdvancedModelRenderer(this, 0, 33);
		this.lArm02.setRotationPoint(2.7F, 0.0F, 0.0F);
		this.lArm02.addBox(-1.0F, -0.8F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lArm02, -0.17453292519943295F, 0.0F, -0.13962634015954636F);
		this.rBToe01 = new AdvancedModelRenderer(this, 12, 58);
		this.rBToe01.mirror = true;
		this.rBToe01.setRotationPoint(-0.8F, 0.3F, -2.7F);
		this.rBToe01.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rBToe01, 0.08726646259971647F, 0.2792526803190927F, 0.0F);
		this.rForeFoot = new AdvancedModelRenderer(this, 0, 42);
		this.rForeFoot.mirror = true;
		this.rForeFoot.setRotationPoint(-0.1F, 3.7F, 0.0F);
		this.rForeFoot.addBox(-1.0F, 0.0F, -1.9F, 2, 1, 3, 0.0F);
		this.setRotateAngle(rForeFoot, 0.17453292519943295F, 0.0F, -0.13962634015954636F);
		this.rFToe02 = new AdvancedModelRenderer(this, 0, 54);
		this.rFToe02.mirror = true;
		this.rFToe02.setRotationPoint(0.4F, 0.8F, -1.1F);
		this.rFToe02.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rFToe02, 0.05235987755982988F, -0.13962634015954636F, 0.0F);
		this.lEye = new AdvancedModelRenderer(this, 37, 36);
		this.lEye.setRotationPoint(1.8F, -0.7F, 0.1F);
		this.lEye.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lEye, 0.0F, 0.22689280275926282F, 0.2792526803190927F);
		this.tail04 = new AdvancedModelRenderer(this, 50, 30);
		this.tail04.setRotationPoint(0.0F, 0.0F, 4.8F);
		this.tail04.addBox(-0.5F, -1.0F, -0.2F, 1, 2, 5, 0.0F);
		this.setRotateAngle(tail04, 0.08726646259971647F, 0.0F, 0.0F);
		this.rEye = new AdvancedModelRenderer(this, 37, 36);
		this.rEye.mirror = true;
		this.rEye.setRotationPoint(-1.8F, -0.7F, 0.1F);
		this.rEye.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rEye, 0.0F, -0.22689280275926282F, -0.2792526803190927F);
		this.snout = new AdvancedModelRenderer(this, 31, 22);
		this.snout.setRotationPoint(0.0F, -0.4F, -1.4F);
		this.snout.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 2, 0.0F);
		this.setRotateAngle(snout, 0.19198621771937624F, 0.0F, 0.0F);
		this.lBToe05 = new AdvancedModelRenderer(this, 12, 58);
		this.lBToe05.setRotationPoint(-1.0F, 0.3F, -0.6F);
		this.lBToe05.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lBToe05, 0.08726646259971647F, 0.5235987755982988F, 0.0F);
		this.lFToe02 = new AdvancedModelRenderer(this, 0, 54);
		this.lFToe02.setRotationPoint(-0.4F, 0.8F, -1.1F);
		this.lFToe02.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lFToe02, 0.05235987755982988F, 0.13962634015954636F, 0.0F);
		this.head = new AdvancedModelRenderer(this, 25, 13);
		this.head.setRotationPoint(0.0F, 0.0F, -2.9F);
		this.head.addBox(-2.5F, -2.0F, -2.0F, 5, 3, 4, 0.0F);
		this.setRotateAngle(head, 0.13962634015954636F, 0.0F, 0.0F);
		this.lBToe01 = new AdvancedModelRenderer(this, 12, 58);
		this.lBToe01.setRotationPoint(0.8F, 0.3F, -2.7F);
		this.lBToe01.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lBToe01, 0.08726646259971647F, -0.2792526803190927F, 0.0F);
		this.tail02 = new AdvancedModelRenderer(this, 45, 10);
		this.tail02.setRotationPoint(0.0F, 0.0F, 3.8F);
		this.tail02.addBox(-1.5F, -1.5F, -0.2F, 3, 3, 5, 0.0F);
		this.setRotateAngle(tail02, -0.08726646259971647F, 0.0F, 0.0F);
		this.rArm02 = new AdvancedModelRenderer(this, 0, 33);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(-2.7F, 0.0F, 0.0F);
		this.rArm02.addBox(-1.0F, -0.8F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rArm02, -0.17453292519943295F, 0.0F, 0.13962634015954636F);
		this.rLeg02 = new AdvancedModelRenderer(this, 17, 36);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(-3.1F, -0.7F, 0.1F);
		this.rLeg02.addBox(-1.5F, -0.3F, -1.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rLeg02, 0.0F, 0.0F, 0.20943951023931953F);
		this.rFoot = new AdvancedModelRenderer(this, 17, 45);
		this.rFoot.mirror = true;
		this.rFoot.setRotationPoint(-0.1F, 4.5F, 0.5F);
		this.rFoot.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
		this.setRotateAngle(rFoot, 0.0F, 0.0F, -0.20943951023931953F);
		this.lLeg02 = new AdvancedModelRenderer(this, 17, 36);
		this.lLeg02.setRotationPoint(3.1F, -0.7F, 0.1F);
		this.lLeg02.addBox(-1.5F, -0.3F, -1.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(lLeg02, 0.0F, 0.0F, -0.20943951023931953F);
		this.lForeFoot = new AdvancedModelRenderer(this, 0, 42);
		this.lForeFoot.setRotationPoint(0.1F, 3.7F, 0.0F);
		this.lForeFoot.addBox(-1.0F, 0.0F, -1.9F, 2, 1, 3, 0.0F);
		this.setRotateAngle(lForeFoot, 0.17453292519943295F, 0.0F, 0.13962634015954636F);
		this.lFToes01 = new AdvancedModelRenderer(this, 0, 48);
		this.lFToes01.setRotationPoint(0.0F, 0.7F, -0.6F);
		this.lFToes01.addBox(-1.5F, 0.0F, -3.3F, 3, 0, 4, 0.0F);
		this.setRotateAngle(lFToes01, 0.08726646259971647F, 0.0F, 0.0F);
		this.lBToe04 = new AdvancedModelRenderer(this, 12, 58);
		this.lBToe04.setRotationPoint(1.0F, 0.3F, -0.6F);
		this.lBToe04.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lBToe04, 0.08726646259971647F, -0.5235987755982988F, 0.0F);
		this.lFToe01 = new AdvancedModelRenderer(this, 0, 54);
		this.lFToe01.setRotationPoint(0.4F, 0.8F, -1.1F);
		this.lFToe01.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lFToe01, 0.05235987755982988F, -0.13962634015954636F, 0.0F);
		this.rFToe03 = new AdvancedModelRenderer(this, 0, 59);
		this.rFToe03.mirror = true;
		this.rFToe03.setRotationPoint(-0.6F, 0.8F, -0.4F);
		this.rFToe03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rFToe03, 0.05235987755982988F, 0.593411945678072F, 0.0F);
		this.rLeg01 = new AdvancedModelRenderer(this, 17, 29);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-2.0F, -0.8F, 5.7F);
		this.rLeg01.addBox(-4.5F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
		this.setRotateAngle(rLeg01, 0.03490658503988659F, 0.0F, 0.0F);
		this.neck = new AdvancedModelRenderer(this, 29, 0);
		this.neck.setRotationPoint(0.0F, -0.4F, -7.7F);
		this.neck.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 2, 0.0F);
		this.setRotateAngle(neck, -0.05235987755982988F, 0.0F, 0.0F);
		this.rArm01 = new AdvancedModelRenderer(this, 0, 28);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-2.4F, -0.7F, -5.5F);
		this.rArm01.addBox(-3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
		this.setRotateAngle(rArm01, 0.06981317007977318F, 0.08726646259971647F, 0.0F);
		this.lBToe03 = new AdvancedModelRenderer(this, 12, 58);
		this.lBToe03.setRotationPoint(-0.8F, 0.3F, -2.7F);
		this.lBToe03.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lBToe03, 0.08726646259971647F, 0.2792526803190927F, 0.0F);
		this.rFToes01 = new AdvancedModelRenderer(this, 0, 48);
		this.rFToes01.mirror = true;
		this.rFToes01.setRotationPoint(-0.0F, 0.7F, -0.6F);
		this.rFToes01.addBox(-1.5F, 0.0F, -3.3F, 3, 0, 4, 0.0F);
		this.setRotateAngle(rFToes01, 0.08726646259971647F, 0.0F, 0.0F);
		this.lBToes = new AdvancedModelRenderer(this, 12, 52);
		this.lBToes.setRotationPoint(0.0F, 0.4F, -0.6F);
		this.lBToes.addBox(-2.0F, -0.5F, -4.5F, 4, 0, 5, 0.0F);
		this.setRotateAngle(lBToes, 0.08726646259971647F, 0.0F, 0.0F);
		this.lFToe03 = new AdvancedModelRenderer(this, 0, 59);
		this.lFToe03.setRotationPoint(0.6F, 0.8F, -0.4F);
		this.lFToe03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lFToe03, 0.05235987755982988F, -0.593411945678072F, 0.0F);
		this.lFoot = new AdvancedModelRenderer(this, 17, 45);
		this.lFoot.setRotationPoint(0.1F, 4.5F, 0.5F);
		this.lFoot.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F);
		this.setRotateAngle(lFoot, 0.0F, 0.0F, 0.20943951023931953F);
		this.rFToe01 = new AdvancedModelRenderer(this, 0, 54);
		this.rFToe01.mirror = true;
		this.rFToe01.setRotationPoint(-0.4F, 0.8F, -1.1F);
		this.rFToe01.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rFToe01, 0.05235987755982988F, 0.13962634015954636F, 0.0F);
		this.body02 = new AdvancedModelRenderer(this, 0, 15);
		this.body02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body02.addBox(-2.5F, -2.6F, -0.2F, 5, 4, 8, 0.0F);
		this.setRotateAngle(body02, 0.03490658503988659F, 0.0F, 0.0F);
		this.lArm01 = new AdvancedModelRenderer(this, 0, 28);
		this.lArm01.setRotationPoint(2.4F, -0.7F, -5.5F);
		this.lArm01.addBox(-0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
		this.setRotateAngle(lArm01, 0.06981317007977318F, -0.08726646259971647F, 0.0F);
		this.rBToe02 = new AdvancedModelRenderer(this, 12, 58);
		this.rBToe02.mirror = true;
		this.rBToe02.setRotationPoint(0.0F, 0.3F, -2.7F);
		this.rBToe02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rBToe02, 0.08726646259971647F, 0.0F, 0.0F);
		this.rBToe03 = new AdvancedModelRenderer(this, 12, 58);
		this.rBToe03.mirror = true;
		this.rBToe03.setRotationPoint(0.8F, 0.3F, -2.7F);
		this.rBToe03.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rBToe03, 0.08726646259971647F, -0.2792526803190927F, 0.0F);
		this.tail05 = new AdvancedModelRenderer(this, 51, 39);
		this.tail05.setRotationPoint(0.0F, 0.0F, 4.7F);
		this.tail05.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 4, 0.0F);
		this.setRotateAngle(tail05, 0.08726646259971647F, 0.0F, 0.0F);
		this.lowerJaw = new AdvancedModelRenderer(this, 34, 29);
		this.lowerJaw.setRotationPoint(0.0F, 1.2F, 0.8F);
		this.lowerJaw.addBox(-2.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F);
		this.setRotateAngle(lowerJaw, -0.08726646259971647F, 0.0F, 0.0F);
		this.body01 = new AdvancedModelRenderer(this, 0, 0);
		this.body01.setRotationPoint(0.0F, 20.5F, 1.0F);
		this.body01.addBox(-2.5F, -2.8F, -8.0F, 5, 5, 8, 0.0F);
		this.setRotateAngle(body01, -0.06981317007977318F, 0.0F, 0.0F);
		this.rBToes = new AdvancedModelRenderer(this, 12, 52);
		this.rBToes.mirror = true;
		this.rBToes.setRotationPoint(0.0F, 0.4F, -0.6F);
		this.rBToes.addBox(-2.0F, -0.5F, -4.5F, 4, 0, 5, 0.0F);
		this.setRotateAngle(rBToes, 0.08726646259971647F, 0.0F, 0.0F);
		this.rBToe05 = new AdvancedModelRenderer(this, 12, 58);
		this.rBToe05.mirror = true;
		this.rBToe05.setRotationPoint(1.0F, 0.3F, -0.6F);
		this.rBToe05.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rBToe05, 0.08726646259971647F, -0.5235987755982988F, 0.0F);
		this.rFToe04 = new AdvancedModelRenderer(this, 0, 59);
		this.rFToe04.mirror = true;
		this.rFToe04.setRotationPoint(0.6F, 0.8F, -0.4F);
		this.rFToe04.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rFToe04, 0.05235987755982988F, -0.593411945678072F, 0.0F);
		this.tail01 = new AdvancedModelRenderer(this, 43, 0);
		this.tail01.setRotationPoint(0.0F, -0.4F, 7.7F);
		this.tail01.addBox(-2.0F, -2.0F, -0.2F, 4, 4, 4, 0.0F);
		this.setRotateAngle(tail01, -0.08726646259971647F, 0.0F, 0.0F);
		this.lLeg01 = new AdvancedModelRenderer(this, 17, 29);
		this.lLeg01.setRotationPoint(2.0F, -0.8F, 5.7F);
		this.lLeg01.addBox(-0.5F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
		this.setRotateAngle(lLeg01, 0.03490658503988659F, 0.0F, 0.0F);
		this.rBToe04 = new AdvancedModelRenderer(this, 12, 58);
		this.rBToe04.mirror = true;
		this.rBToe04.setRotationPoint(-1.0F, 0.3F, -0.6F);
		this.rBToe04.addBox(-0.5F, -0.5F, -2.1F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rBToe04, 0.08726646259971647F, 0.5235987755982988F, 0.0F);
		this.tail03 = new AdvancedModelRenderer(this, 46, 20);
		this.tail03.setRotationPoint(0.0F, 0.0F, 4.8F);
		this.tail03.addBox(-1.0F, -1.5F, -0.2F, 2, 3, 5, 0.0F);
		this.setRotateAngle(tail03, 0.05235987755982988F, 0.0F, 0.0F);
		this.lBToe02 = new AdvancedModelRenderer(this, 12, 58);
		this.lBToe02.setRotationPoint(0.0F, 0.3F, -2.7F);
		this.lBToe02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lBToe02, 0.08726646259971647F, 0.0F, 0.0F);
		this.lForeFoot.addChild(this.lFToe04);
		this.lArm01.addChild(this.lArm02);
		this.rFoot.addChild(this.rBToe01);
		this.rArm02.addChild(this.rForeFoot);
		this.rForeFoot.addChild(this.rFToe02);
		this.head.addChild(this.lEye);
		this.tail03.addChild(this.tail04);
		this.head.addChild(this.rEye);
		this.head.addChild(this.snout);
		this.lFoot.addChild(this.lBToe05);
		this.lForeFoot.addChild(this.lFToe02);
		this.neck.addChild(this.head);
		this.lFoot.addChild(this.lBToe01);
		this.tail01.addChild(this.tail02);
		this.rArm01.addChild(this.rArm02);
		this.rLeg01.addChild(this.rLeg02);
		this.rLeg02.addChild(this.rFoot);
		this.lLeg01.addChild(this.lLeg02);
		this.lArm02.addChild(this.lForeFoot);
		this.lForeFoot.addChild(this.lFToes01);
		this.lFoot.addChild(this.lBToe04);
		this.lForeFoot.addChild(this.lFToe01);
		this.rForeFoot.addChild(this.rFToe03);
		this.body02.addChild(this.rLeg01);
		this.body01.addChild(this.neck);
		this.body01.addChild(this.rArm01);
		this.lFoot.addChild(this.lBToe03);
		this.rForeFoot.addChild(this.rFToes01);
		this.lFoot.addChild(this.lBToes);
		this.lForeFoot.addChild(this.lFToe03);
		this.lLeg02.addChild(this.lFoot);
		this.rForeFoot.addChild(this.rFToe01);
		this.body01.addChild(this.body02);
		this.body01.addChild(this.lArm01);
		this.rFoot.addChild(this.rBToe02);
		this.rFoot.addChild(this.rBToe03);
		this.tail04.addChild(this.tail05);
		this.head.addChild(this.lowerJaw);
		this.rFoot.addChild(this.rBToes);
		this.rFoot.addChild(this.rBToe05);
		this.rForeFoot.addChild(this.rFToe04);
		this.body02.addChild(this.tail01);
		this.body02.addChild(this.lLeg01);
		this.rFoot.addChild(this.rBToe04);
		this.tail02.addChild(this.tail03);
		this.lFoot.addChild(this.lBToe02);
		this.updateDefaultPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.body01.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
		AdvancedModelRenderer.rotateAngleX = x;
		AdvancedModelRenderer.rotateAngleY = y;
		AdvancedModelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.resetToDefaultPose();
		this.lArm01.rotateAngleY = MathHelper.cos(f * 0.66F) * 1.4F * f1; 
		this.rArm01.rotateAngleY = -this.lArm01.rotateAngleY;
		this.lLeg01.rotateAngleY = -this.lArm01.rotateAngleY;
		this.rLeg01.rotateAngleY = this.lArm01.rotateAngleY;
		this.tail01.rotateAngleY = -this.lArm01.rotateAngleY / 3;
	}
}
