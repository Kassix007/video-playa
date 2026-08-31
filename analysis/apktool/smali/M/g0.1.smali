.class public abstract LM/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LM/g0;->a:F

    .line 5
    .line 6
    const/16 v0, 0x18

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, LM/g0;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Lj0/B;->g(FF)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sput-wide v0, LM/g0;->c:J

    .line 19
    .line 20
    return-void
.end method

.method public static final a(LB5/a;Lc0/m;LM/I0;FLj0/E;JJFJLB5/e;LB5/e;LM/h0;LX/e;LP/o;II)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v0, p16

    move/from16 v2, p18

    const v4, 0x7f1eb8b9

    .line 1
    invoke-virtual {v0, v4}, LP/o;->U(I)LP/o;

    invoke-virtual {v0, v1}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p17, v4

    or-int/lit8 v4, v4, 0x30

    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x100

    goto :goto_1

    :cond_1
    const/16 v7, 0x80

    :goto_1
    or-int/2addr v4, v7

    or-int/lit16 v4, v4, 0x2c00

    and-int/lit8 v7, v2, 0x20

    move-wide/from16 v9, p5

    if-nez v7, :cond_2

    invoke-virtual {v0, v9, v10}, LP/o;->f(J)Z

    move-result v7

    if-eqz v7, :cond_2

    const/high16 v7, 0x20000

    goto :goto_2

    :cond_2
    const/high16 v7, 0x10000

    :goto_2
    or-int/2addr v4, v7

    const/high16 v7, 0xc80000

    or-int/2addr v4, v7

    const/high16 v7, 0x6000000

    and-int v7, p17, v7

    if-nez v7, :cond_4

    and-int/lit16 v7, v2, 0x100

    move-wide/from16 v11, p10

    if-nez v7, :cond_3

    invoke-virtual {v0, v11, v12}, LP/o;->f(J)Z

    move-result v7

    if-eqz v7, :cond_3

    const/high16 v7, 0x4000000

    goto :goto_3

    :cond_3
    const/high16 v7, 0x2000000

    :goto_3
    or-int/2addr v4, v7

    goto :goto_4

    :cond_4
    move-wide/from16 v11, p10

    :goto_4
    const/high16 v7, 0x30000000

    or-int/2addr v4, v7

    const v7, 0x12492493

    and-int/2addr v7, v4

    const v13, 0x12492492

    if-ne v7, v13, :cond_6

    invoke-virtual {v0}, LP/o;->x()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_5

    .line 2
    :cond_5
    invoke-virtual {v0}, LP/o;->N()V

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-wide v6, v9

    move-wide/from16 v8, p7

    move/from16 v10, p9

    goto/16 :goto_19

    .line 3
    :cond_6
    :goto_5
    invoke-virtual {v0}, LP/o;->P()V

    and-int/lit8 v7, p17, 0x1

    const v13, -0xe380001

    const v14, -0x380001

    const v15, -0x7e001

    const v16, -0xe001

    const/4 v6, 0x0

    if-eqz v7, :cond_a

    invoke-virtual {v0}, LP/o;->w()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_6

    .line 4
    :cond_7
    invoke-virtual {v0}, LP/o;->N()V

    and-int v5, v4, v16

    and-int/lit8 v7, v2, 0x20

    if-eqz v7, :cond_8

    and-int v5, v4, v15

    :cond_8
    and-int v4, v5, v14

    and-int/lit16 v7, v2, 0x100

    if-eqz v7, :cond_9

    and-int v4, v5, v13

    :cond_9
    move-object/from16 v20, p1

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move-object/from16 v16, p12

    move-object/from16 v7, p13

    move-object/from16 v19, p14

    move v8, v4

    move-wide v4, v11

    move-wide v11, v9

    move/from16 v9, p3

    move-object/from16 v10, p4

    goto :goto_7

    .line 5
    :cond_a
    :goto_6
    sget v7, LM/c;->b:F

    .line 6
    sget-object v18, LM/c;->a:LM/c;

    .line 7
    sget v18, LO/k;->a:F

    invoke-static {v5, v0}, LM/D0;->a(ILP/o;)Lj0/E;

    move-result-object v5

    and-int v16, v4, v16

    and-int/lit8 v18, v2, 0x20

    if-eqz v18, :cond_b

    const/16 v9, 0x28

    .line 8
    invoke-static {v9, v0}, LM/k;->e(ILP/o;)J

    move-result-wide v9

    and-int v16, v4, v15

    .line 9
    :cond_b
    invoke-static {v9, v10, v0}, LM/k;->b(JLP/o;)J

    move-result-wide v18

    and-int v4, v16, v14

    int-to-float v14, v6

    and-int/lit16 v15, v2, 0x100

    if-eqz v15, :cond_c

    const/16 v4, 0x1e

    .line 10
    invoke-static {v4, v0}, LM/k;->e(ILP/o;)J

    move-result-wide v11

    const v4, 0x3ea3d70a    # 0.32f

    invoke-static {v11, v12, v4}, Lj0/o;->b(JF)J

    move-result-wide v11

    and-int v4, v16, v13

    .line 11
    :cond_c
    sget-object v13, LM/n;->a:LX/e;

    .line 12
    sget-object v15, LM/m;->y:LM/m;

    .line 13
    sget-object v16, LM/C;->a:LM/h0;

    .line 14
    sget-object v20, Lc0/j;->q:Lc0/j;

    move v8, v4

    move-wide/from16 v28, v9

    move-object v10, v5

    move v9, v7

    move-wide v4, v11

    move-object v7, v15

    move-wide/from16 v11, v28

    move v15, v14

    move-object/from16 v28, v16

    move-object/from16 v16, v13

    move-wide/from16 v13, v18

    move-object/from16 v19, v28

    :goto_7
    invoke-virtual {v0}, LP/o;->q()V

    .line 15
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v6

    .line 16
    sget-object v2, LP/k;->a:LP/S;

    if-ne v6, v2, :cond_d

    .line 17
    invoke-static {v0}, LP/b;->k(LP/o;)LM5/w;

    move-result-object v6

    move-wide/from16 p9, v4

    .line 18
    new-instance v4, LP/x;

    invoke-direct {v4, v6}, LP/x;-><init>(LM5/w;)V

    .line 19
    invoke-virtual {v0, v4}, LP/o;->d0(Ljava/lang/Object;)V

    move-object v6, v4

    goto :goto_8

    :cond_d
    move-wide/from16 p9, v4

    .line 20
    :goto_8
    check-cast v6, LP/x;

    .line 21
    iget-object v6, v6, LP/x;->q:LM5/w;

    and-int/lit16 v4, v8, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v5, 0x100

    if-le v4, v5, :cond_f

    .line 22
    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_e

    goto :goto_9

    :cond_e
    move-object/from16 p11, v7

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 p11, v7

    and-int/lit16 v7, v8, 0x180

    if-ne v7, v5, :cond_10

    :goto_a
    const/4 v5, 0x1

    goto :goto_b

    :cond_10
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v0, v6}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    and-int/lit8 v7, v8, 0xe

    move/from16 p3, v5

    const/4 v5, 0x4

    if-ne v7, v5, :cond_11

    const/16 v17, 0x1

    goto :goto_c

    :cond_11
    const/16 v17, 0x0

    :goto_c
    or-int v17, p3, v17

    .line 23
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v17, :cond_13

    if-ne v5, v2, :cond_12

    goto :goto_d

    :cond_12
    move/from16 p12, v9

    goto :goto_e

    .line 24
    :cond_13
    :goto_d
    new-instance v5, LC/k;

    move/from16 p12, v9

    const/4 v9, 0x4

    invoke-direct {v5, v3, v6, v1, v9}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 26
    :goto_e
    check-cast v5, LB5/a;

    .line 27
    invoke-virtual {v0, v6}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v9

    move-object/from16 p13, v5

    const/16 v5, 0x100

    if-le v4, v5, :cond_15

    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_14

    goto :goto_f

    :cond_14
    move/from16 p3, v9

    goto :goto_10

    :cond_15
    :goto_f
    move/from16 p3, v9

    and-int/lit16 v9, v8, 0x180

    if-ne v9, v5, :cond_16

    :goto_10
    const/4 v5, 0x1

    goto :goto_11

    :cond_16
    const/4 v5, 0x0

    :goto_11
    or-int v5, p3, v5

    const/4 v9, 0x4

    if-ne v7, v9, :cond_17

    const/4 v9, 0x1

    goto :goto_12

    :cond_17
    const/4 v9, 0x0

    :goto_12
    or-int/2addr v5, v9

    .line 28
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_19

    if-ne v9, v2, :cond_18

    goto :goto_13

    :cond_18
    const/4 v5, 0x1

    goto :goto_14

    .line 29
    :cond_19
    :goto_13
    new-instance v9, LA/J;

    const/4 v5, 0x1

    invoke-direct {v9, v6, v3, v1, v5}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 31
    :goto_14
    check-cast v9, LB5/c;

    .line 32
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_1a

    .line 33
    new-instance v5, Lu/c;

    const/16 v22, 0x0

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object/from16 p14, v9

    sget-object v9, Lu/A0;->a:LZ/m;

    const v22, 0x3c23d70a    # 0.01f

    move-object/from16 v23, v10

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    .line 34
    invoke-direct {v5, v1, v9, v10}, Lu/c;-><init>(Ljava/lang/Object;LZ/m;Ljava/lang/Object;)V

    .line 35
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    goto :goto_15

    :cond_1a
    move-object/from16 p14, v9

    move-object/from16 v23, v10

    .line 36
    :goto_15
    check-cast v5, Lu/c;

    const/16 v1, 0x100

    if-le v4, v1, :cond_1b

    .line 37
    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    and-int/lit16 v9, v8, 0x180

    if-ne v9, v1, :cond_1d

    :cond_1c
    const/4 v9, 0x1

    goto :goto_16

    :cond_1d
    const/4 v9, 0x0

    :goto_16
    invoke-virtual {v0, v6}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v5}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    const/4 v10, 0x4

    if-ne v7, v10, :cond_1e

    const/4 v7, 0x1

    goto :goto_17

    :cond_1e
    const/4 v7, 0x0

    :goto_17
    or-int/2addr v7, v9

    .line 38
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_1f

    if-ne v9, v2, :cond_20

    .line 39
    :cond_1f
    new-instance v7, LM/S;

    const/4 v9, 0x0

    move-object/from16 p7, p0

    move-object/from16 p4, v3

    move-object/from16 p6, v5

    move-object/from16 p5, v6

    move-object/from16 p3, v7

    move/from16 p8, v9

    invoke-direct/range {p3 .. p8}, LM/S;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v9, p3

    .line 40
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 41
    :cond_20
    move-object/from16 v22, v9

    check-cast v22, LB5/a;

    .line 42
    new-instance v0, LM/T;

    move-object/from16 v17, p11

    move/from16 v9, p12

    move-object/from16 v3, p13

    move-object/from16 v7, p14

    move-object/from16 v18, p15

    move-object/from16 v26, v2

    move/from16 v25, v4

    move/from16 v24, v8

    move-object/from16 v8, v20

    move-object/from16 v10, v23

    const/16 v20, 0x1

    const/16 v21, 0x0

    move-object/from16 v4, p2

    move-wide/from16 v1, p9

    invoke-direct/range {v0 .. v18}, LM/T;-><init>(JLB5/a;LM/I0;Lu/c;LM5/w;LB5/c;Lc0/m;FLj0/E;JJFLB5/e;LB5/e;LX/e;)V

    move-object v3, v4

    const v4, -0x12c18966

    move-object/from16 v6, p16

    invoke-static {v4, v0, v6}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    move-result-object v0

    const/16 v4, 0xe30

    move-object/from16 p6, v0

    move/from16 p8, v4

    move-object/from16 p5, v5

    move-object/from16 p7, v6

    move-object/from16 p4, v19

    move-object/from16 p3, v22

    .line 43
    invoke-static/range {p3 .. p8}, LM/s0;->d(LB5/a;LM/h0;Lu/c;LX/e;LP/o;I)V

    move-object/from16 v4, p4

    move-object/from16 v0, p7

    .line 44
    iget-object v5, v3, LM/I0;->c:LN/r;

    .line 45
    invoke-virtual {v5}, LN/r;->d()LN/y;

    move-result-object v5

    sget-object v6, LM/J0;->r:LM/J0;

    .line 46
    iget-object v5, v5, LN/y;->a:Ljava/util/Map;

    .line 47
    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    move/from16 v5, v25

    const/16 v6, 0x100

    if-le v5, v6, :cond_21

    .line 48
    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    :cond_21
    move/from16 v5, v24

    and-int/lit16 v5, v5, 0x180

    if-ne v5, v6, :cond_23

    :cond_22
    move/from16 v6, v20

    goto :goto_18

    :cond_23
    move/from16 v6, v21

    .line 49
    :goto_18
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v6, :cond_24

    move-object/from16 v6, v26

    if-ne v5, v6, :cond_25

    .line 50
    :cond_24
    new-instance v5, LM/U;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6}, LM/U;-><init>(LM/I0;Lq5/c;)V

    .line 51
    invoke-virtual {v0, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 52
    :cond_25
    check-cast v5, LB5/e;

    invoke-static {v5, v0, v3}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    :cond_26
    move-wide v6, v11

    move v10, v15

    move-object/from16 v5, v23

    move-wide v11, v1

    move-object v15, v4

    move-object v2, v8

    move v4, v9

    move-wide v8, v13

    move-object/from16 v13, v16

    move-object/from16 v14, v17

    .line 53
    :goto_19
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    move-result-object v0

    if-eqz v0, :cond_27

    move-object v1, v0

    new-instance v0, LM/V;

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v27, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, LM/V;-><init>(LB5/a;Lc0/m;LM/I0;FLj0/E;JJFJLB5/e;LB5/e;LM/h0;LX/e;II)V

    move-object/from16 v1, v27

    .line 54
    iput-object v0, v1, LP/o0;->d:LB5/e;

    :cond_27
    return-void
.end method

.method public static final b(Lu/c;LM5/w;LB5/a;LB5/c;Lc0/m;LM/I0;FLj0/E;JJFLB5/e;LB5/e;LX/e;LP/o;I)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v4, p5

    move/from16 v10, p6

    move-object/from16 v11, p16

    const v0, -0x63f46313

    .line 1
    invoke-virtual {v11, v0}, LP/o;->U(I)LP/o;

    invoke-virtual {v11, v1}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p17, v0

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v13, 0x800

    goto :goto_2

    :cond_2
    const/16 v13, 0x400

    :goto_2
    or-int/2addr v0, v13

    invoke-virtual {v11, v8}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v13

    const/16 v16, 0x2000

    if-eqz v13, :cond_3

    const/16 v13, 0x4000

    goto :goto_3

    :cond_3
    move/from16 v13, v16

    :goto_3
    or-int/2addr v0, v13

    invoke-virtual {v11, v9}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/high16 v13, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v13, 0x10000

    :goto_4
    or-int/2addr v0, v13

    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    const/high16 v13, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v13, 0x80000

    :goto_5
    or-int/2addr v0, v13

    invoke-virtual {v11, v10}, LP/o;->d(F)Z

    move-result v13

    if-eqz v13, :cond_6

    const/high16 v13, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v13, 0x400000

    :goto_6
    or-int/2addr v0, v13

    move-object/from16 v13, p7

    invoke-virtual {v11, v13}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_7

    const/high16 v19, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v19, 0x2000000

    :goto_7
    or-int v0, v0, v19

    move-wide/from16 v12, p8

    invoke-virtual {v11, v12, v13}, LP/o;->f(J)Z

    move-result v20

    if-eqz v20, :cond_8

    const/high16 v20, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v20, 0x10000000

    :goto_8
    or-int v20, v0, v20

    move-wide/from16 v14, p10

    invoke-virtual {v11, v14, v15}, LP/o;->f(J)Z

    move-result v22

    if-eqz v22, :cond_9

    const/16 v22, 0x4

    :goto_9
    move/from16 v3, p12

    goto :goto_a

    :cond_9
    const/16 v22, 0x2

    goto :goto_9

    :goto_a
    invoke-virtual {v11, v3}, LP/o;->d(F)Z

    move-result v24

    if-eqz v24, :cond_a

    const/16 v17, 0x20

    goto :goto_b

    :cond_a
    const/16 v17, 0x10

    :goto_b
    or-int v17, v22, v17

    move-object/from16 v0, p13

    invoke-virtual {v11, v0}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v18, 0x100

    goto :goto_c

    :cond_b
    const/16 v18, 0x80

    :goto_c
    or-int v17, v17, v18

    move-object/from16 v2, p14

    invoke-virtual {v11, v2}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_c

    const/16 v21, 0x800

    goto :goto_d

    :cond_c
    const/16 v21, 0x400

    :goto_d
    or-int v17, v17, v21

    move-object/from16 v7, p15

    invoke-virtual {v11, v7}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v16, 0x4000

    :cond_d
    or-int v12, v17, v16

    const v13, 0x12492493

    and-int v13, v20, v13

    const v0, 0x12492492

    if-ne v13, v0, :cond_f

    and-int/lit16 v0, v12, 0x2493

    const/16 v13, 0x2492

    if-ne v0, v13, :cond_f

    invoke-virtual {v11}, LP/o;->x()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_e

    .line 2
    :cond_e
    invoke-virtual {v11}, LP/o;->N()V

    goto/16 :goto_15

    .line 3
    :cond_f
    :goto_e
    invoke-virtual {v11}, LP/o;->P()V

    and-int/lit8 v0, p17, 0x1

    if-eqz v0, :cond_11

    invoke-virtual {v11}, LP/o;->w()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_f

    .line 4
    :cond_10
    invoke-virtual {v11}, LP/o;->N()V

    :cond_11
    :goto_f
    invoke-virtual {v11}, LP/o;->q()V

    const v0, 0x7f11008f

    .line 5
    invoke-static {v0, v11}, LN/s;->a(ILP/o;)Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v13, Lc0/b;->r:Lc0/e;

    sget-object v2, Landroidx/compose/foundation/layout/a;->a:Landroidx/compose/foundation/layout/a;

    invoke-virtual {v2, v9, v13}, Landroidx/compose/foundation/layout/a;->a(Lc0/m;Lc0/e;)Lc0/m;

    move-result-object v2

    .line 7
    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/c;->f(Lc0/m;F)Lc0/m;

    move-result-object v2

    .line 8
    sget-object v13, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    invoke-interface {v2, v13}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v2

    const/high16 v13, 0x380000

    and-int v13, v20, v13

    const/high16 v16, 0x180000

    xor-int v13, v13, v16

    const/16 v17, 0x1

    const/high16 v3, 0x100000

    if-le v13, v3, :cond_12

    .line 9
    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_13

    :cond_12
    and-int v5, v20, v16

    if-ne v5, v3, :cond_14

    :cond_13
    move/from16 v3, v17

    goto :goto_10

    :cond_14
    const/4 v3, 0x0

    .line 10
    :goto_10
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    move/from16 v23, v3

    .line 11
    sget-object v3, LP/k;->a:LP/S;

    if-nez v23, :cond_15

    if-ne v5, v3, :cond_16

    .line 12
    :cond_15
    sget v5, LM/G0;->a:F

    .line 13
    new-instance v5, LM/E0;

    invoke-direct {v5, v4, v8}, LM/E0;-><init>(LM/I0;LB5/c;)V

    .line 14
    invoke-virtual {v11, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 15
    :cond_16
    check-cast v5, Lu0/a;

    const/4 v6, 0x0

    .line 16
    invoke-static {v2, v5, v6}, Landroidx/compose/ui/input/nestedscroll/a;->a(Lc0/m;Lu0/a;Lu0/d;)Lc0/m;

    move-result-object v2

    .line 17
    iget-object v5, v4, LM/I0;->c:LN/r;

    const/high16 v6, 0x100000

    if-le v13, v6, :cond_17

    .line 18
    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_18

    :cond_17
    and-int v7, v20, v16

    if-ne v7, v6, :cond_19

    :cond_18
    move/from16 v6, v17

    goto :goto_11

    :cond_19
    const/4 v6, 0x0

    .line 19
    :goto_11
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1a

    if-ne v7, v3, :cond_1b

    .line 20
    :cond_1a
    new-instance v7, LA/e0;

    const/4 v6, 0x6

    invoke-direct {v7, v6, v4}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 21
    invoke-virtual {v11, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 22
    :cond_1b
    check-cast v7, LB5/e;

    invoke-static {v2, v5, v7}, Landroidx/compose/material3/internal/a;->c(Lc0/m;LN/r;LB5/e;)Lc0/m;

    move-result-object v2

    .line 23
    iget-object v5, v4, LM/I0;->c:LN/r;

    .line 24
    iget-object v5, v5, LN/r;->f:LB0/o;

    .line 25
    invoke-virtual {v4}, LM/I0;->c()Z

    move-result v26

    .line 26
    iget-object v6, v4, LM/I0;->c:LN/r;

    .line 27
    iget-object v6, v6, LN/r;->l:LP/f0;

    .line 28
    invoke-virtual {v6}, LP/f0;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_1c

    move/from16 v27, v17

    goto :goto_12

    :cond_1c
    const/16 v27, 0x0

    :goto_12
    const v30, 0xe000

    and-int v6, v20, v30

    const/16 v7, 0x4000

    if-ne v6, v7, :cond_1d

    move/from16 v6, v17

    goto :goto_13

    :cond_1d
    const/4 v6, 0x0

    .line 29
    :goto_13
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1e

    if-ne v7, v3, :cond_1f

    .line 30
    :cond_1e
    new-instance v7, LM/a0;

    const/4 v6, 0x0

    invoke-direct {v7, v8, v6}, LM/a0;-><init>(LB5/c;Lq5/c;)V

    .line 31
    invoke-virtual {v11, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 32
    :cond_1f
    move-object/from16 v29, v7

    check-cast v29, LB5/f;

    .line 33
    sget-object v28, Lw/D;->a:Le3/u;

    .line 34
    new-instance v24, Landroidx/compose/foundation/gestures/DraggableElement;

    move-object/from16 v25, v5

    invoke-direct/range {v24 .. v29}, Landroidx/compose/foundation/gestures/DraggableElement;-><init>(LB0/o;ZZLB5/f;LB5/f;)V

    move-object/from16 v5, v24

    .line 35
    invoke-interface {v2, v5}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v2

    .line 36
    invoke-virtual {v11, v0}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    .line 37
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_20

    if-ne v6, v3, :cond_21

    .line 38
    :cond_20
    new-instance v6, LI0/k;

    const/4 v5, 0x2

    invoke-direct {v6, v0, v5}, LI0/k;-><init>(Ljava/lang/String;I)V

    .line 39
    invoke-virtual {v11, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 40
    :cond_21
    check-cast v6, LB5/c;

    const/4 v0, 0x0

    .line 41
    invoke-static {v2, v0, v6}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    move-result-object v2

    const/high16 v6, 0x100000

    if-le v13, v6, :cond_22

    .line 42
    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    :cond_22
    and-int v5, v20, v16

    if-ne v5, v6, :cond_24

    :cond_23
    move/from16 v5, v17

    goto :goto_14

    :cond_24
    move v5, v0

    :goto_14
    and-int/lit8 v6, v20, 0x70

    const/16 v7, 0x20

    if-eq v6, v7, :cond_25

    invoke-virtual {v11, v1}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_26

    :cond_25
    move/from16 v0, v17

    :cond_26
    or-int/2addr v0, v5

    .line 43
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_27

    if-ne v5, v3, :cond_28

    .line 44
    :cond_27
    new-instance v5, LA/Y;

    const/16 v0, 0xb

    invoke-direct {v5, v0, v4, v1}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    invoke-virtual {v11, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 46
    :cond_28
    check-cast v5, LB5/c;

    invoke-static {v2, v5}, Landroidx/compose/ui/graphics/a;->a(Lc0/m;LB5/c;)Lc0/m;

    move-result-object v13

    .line 47
    new-instance v0, LC/o;

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v3, p13

    move-object/from16 v7, p15

    move-object v2, v1

    move-object/from16 v1, p14

    invoke-direct/range {v0 .. v7}, LC/o;-><init>(LB5/e;Lu/c;LB5/e;LM/I0;LB5/a;LM5/w;LX/e;)V

    const v1, -0x294949f8

    invoke-static {v1, v0, v11}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    move-result-object v19

    shr-int/lit8 v0, v20, 0x15

    and-int/lit8 v1, v0, 0x70

    const/high16 v2, 0xc00000

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v12, 0x9

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    and-int v1, v1, v30

    or-int v21, v0, v1

    const/16 v22, 0x60

    const/16 v18, 0x0

    move-object/from16 v12, p7

    move/from16 v17, p12

    move-object/from16 v20, v11

    move-object v11, v13

    move-wide v15, v14

    move-wide/from16 v13, p8

    .line 48
    invoke-static/range {v11 .. v22}, LM/L0;->a(Lc0/m;Lj0/E;JJFFLX/e;LP/o;II)V

    .line 49
    :goto_15
    invoke-virtual/range {p16 .. p16}, LP/o;->r()LP/o0;

    move-result-object v0

    if-eqz v0, :cond_29

    move-object v1, v0

    new-instance v0, LM/d0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-wide/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move-object/from16 v31, v1

    move-object v4, v8

    move-object v5, v9

    move v7, v10

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    move-wide/from16 v9, p8

    invoke-direct/range {v0 .. v17}, LM/d0;-><init>(Lu/c;LM5/w;LB5/a;LB5/c;Lc0/m;LM/I0;FLj0/E;JJFLB5/e;LB5/e;LX/e;I)V

    move-object/from16 v1, v31

    .line 50
    iput-object v0, v1, LP/o0;->d:LB5/e;

    :cond_29
    return-void
.end method

.method public static final c(JLB5/a;ZLP/o;I)V
    .locals 22

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const v6, 0x38bc6405

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v6}, LP/o;->U(I)LP/o;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v6, v5, 0x6

    .line 18
    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, LP/o;->f(J)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    const/4 v6, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v6, 0x2

    .line 30
    :goto_0
    or-int/2addr v6, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v6, v5

    .line 33
    :goto_1
    and-int/lit8 v8, v5, 0x30

    .line 34
    .line 35
    if-nez v8, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_2

    .line 42
    .line 43
    const/16 v8, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v8, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v6, v8

    .line 49
    :cond_3
    and-int/lit16 v8, v5, 0x180

    .line 50
    .line 51
    if-nez v8, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0, v4}, LP/o;->h(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_4

    .line 58
    .line 59
    const/16 v8, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v8, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v6, v8

    .line 65
    :cond_5
    and-int/lit16 v8, v6, 0x93

    .line 66
    .line 67
    const/16 v11, 0x92

    .line 68
    .line 69
    if-ne v8, v11, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0}, LP/o;->x()Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_6
    invoke-virtual {v0}, LP/o;->N()V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_e

    .line 82
    .line 83
    :cond_7
    :goto_4
    const-wide/16 v11, 0x10

    .line 84
    .line 85
    cmp-long v8, v1, v11

    .line 86
    .line 87
    if-eqz v8, :cond_1f

    .line 88
    .line 89
    if-eqz v4, :cond_8

    .line 90
    .line 91
    const/high16 v8, 0x3f800000    # 1.0f

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_8
    const/4 v8, 0x0

    .line 95
    :goto_5
    new-instance v11, Lu/z0;

    .line 96
    .line 97
    const/4 v12, 0x7

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-direct {v11, v13, v14, v12}, Lu/z0;-><init>(ILu/x;I)V

    .line 101
    .line 102
    .line 103
    sget-object v12, Lu/g;->a:Lu/f0;

    .line 104
    .line 105
    sget-object v15, LP/k;->a:LP/S;

    .line 106
    .line 107
    const v7, 0x3c23d70a    # 0.01f

    .line 108
    .line 109
    .line 110
    if-ne v11, v12, :cond_b

    .line 111
    .line 112
    const v11, 0x4316aad7

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v11}, LP/o;->S(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v7}, LP/o;->d(F)Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    if-nez v11, :cond_9

    .line 127
    .line 128
    if-ne v12, v15, :cond_a

    .line 129
    .line 130
    :cond_9
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    const/4 v12, 0x3

    .line 135
    invoke-static {v12, v11}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_a
    move-object v11, v12

    .line 143
    check-cast v11, Lu/f0;

    .line 144
    .line 145
    invoke-virtual {v0, v13}, LP/o;->p(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_b
    const v12, 0x4318583d

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v12}, LP/o;->S(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v13}, LP/o;->p(Z)V

    .line 156
    .line 157
    .line 158
    :goto_6
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    sget-object v12, Lu/A0;->a:LZ/m;

    .line 163
    .line 164
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    if-ne v13, v15, :cond_c

    .line 173
    .line 174
    invoke-static {v14}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v0, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_c
    check-cast v13, LP/W;

    .line 182
    .line 183
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-ne v10, v15, :cond_d

    .line 188
    .line 189
    new-instance v10, Lu/c;

    .line 190
    .line 191
    invoke-direct {v10, v8, v12, v7}, Lu/c;-><init>(Ljava/lang/Object;LZ/m;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v10}, LP/o;->d0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_d
    check-cast v10, Lu/c;

    .line 198
    .line 199
    invoke-static {v14, v0}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    instance-of v9, v11, Lu/f0;

    .line 204
    .line 205
    if-eqz v9, :cond_e

    .line 206
    .line 207
    move-object v9, v11

    .line 208
    check-cast v9, Lu/f0;

    .line 209
    .line 210
    iget-object v14, v9, Lu/f0;->b:Ljava/lang/Object;

    .line 211
    .line 212
    invoke-static {v14, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-nez v14, :cond_e

    .line 217
    .line 218
    iget v9, v9, Lu/f0;->a:F

    .line 219
    .line 220
    new-instance v11, Lu/f0;

    .line 221
    .line 222
    invoke-direct {v11, v9, v7}, Lu/f0;-><init>(FLjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_e
    invoke-static {v11, v0}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    const/4 v11, 0x6

    .line 234
    if-ne v9, v15, :cond_f

    .line 235
    .line 236
    const/4 v9, -0x1

    .line 237
    const/4 v14, 0x0

    .line 238
    invoke-static {v9, v14, v11}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_f
    check-cast v9, LO5/i;

    .line 246
    .line 247
    invoke-virtual {v0, v9}, LP/o;->i(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    invoke-virtual {v0, v8}, LP/o;->i(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v17

    .line 255
    or-int v14, v14, v17

    .line 256
    .line 257
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    if-nez v14, :cond_10

    .line 262
    .line 263
    if-ne v11, v15, :cond_11

    .line 264
    .line 265
    :cond_10
    new-instance v11, LB0/K;

    .line 266
    .line 267
    const/16 v14, 0x10

    .line 268
    .line 269
    invoke-direct {v11, v14, v9, v8}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_11
    check-cast v11, LB5/a;

    .line 276
    .line 277
    invoke-static {v11, v0}, LP/b;->g(LB5/a;LP/o;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v9}, LP/o;->i(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    invoke-virtual {v0, v10}, LP/o;->i(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    or-int/2addr v8, v11

    .line 289
    invoke-virtual {v0, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    or-int/2addr v8, v11

    .line 294
    invoke-virtual {v0, v12}, LP/o;->g(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    or-int/2addr v8, v11

    .line 299
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    if-nez v8, :cond_12

    .line 304
    .line 305
    if-ne v11, v15, :cond_13

    .line 306
    .line 307
    :cond_12
    new-instance v16, Lu/f;

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    move-object/from16 v19, v7

    .line 312
    .line 313
    move-object/from16 v17, v9

    .line 314
    .line 315
    move-object/from16 v18, v10

    .line 316
    .line 317
    move-object/from16 v20, v12

    .line 318
    .line 319
    invoke-direct/range {v16 .. v21}, Lu/f;-><init>(LO5/i;Lu/c;LP/W;LP/W;Lq5/c;)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v11, v16

    .line 323
    .line 324
    invoke-virtual {v0, v11}, LP/o;->d0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_13
    check-cast v11, LB5/e;

    .line 328
    .line 329
    invoke-static {v11, v0, v9}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v13}, LP/S0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    check-cast v7, LP/S0;

    .line 337
    .line 338
    if-nez v7, :cond_14

    .line 339
    .line 340
    iget-object v7, v10, Lu/c;->c:Lu/l;

    .line 341
    .line 342
    :cond_14
    const v8, 0x7f110031

    .line 343
    .line 344
    .line 345
    invoke-static {v8, v0}, LN/s;->a(ILP/o;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    const v9, -0x6a6eea4e

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v9}, LP/o;->S(I)V

    .line 353
    .line 354
    .line 355
    const/4 v9, 0x1

    .line 356
    if-eqz v4, :cond_1b

    .line 357
    .line 358
    and-int/lit8 v10, v6, 0x70

    .line 359
    .line 360
    const/16 v11, 0x20

    .line 361
    .line 362
    if-ne v10, v11, :cond_15

    .line 363
    .line 364
    move v11, v9

    .line 365
    goto :goto_7

    .line 366
    :cond_15
    const/4 v11, 0x0

    .line 367
    :goto_7
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v12

    .line 371
    if-nez v11, :cond_17

    .line 372
    .line 373
    if-ne v12, v15, :cond_16

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_16
    const/4 v14, 0x0

    .line 377
    goto :goto_9

    .line 378
    :cond_17
    :goto_8
    new-instance v12, LM/f0;

    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    invoke-direct {v12, v3, v14}, LM/f0;-><init>(LB5/a;Lq5/c;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :goto_9
    check-cast v12, LB5/e;

    .line 388
    .line 389
    sget-object v11, Lv0/u;->a:Lv0/f;

    .line 390
    .line 391
    new-instance v11, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 392
    .line 393
    new-instance v13, Lv0/t;

    .line 394
    .line 395
    invoke-direct {v13, v12}, Lv0/t;-><init>(LB5/e;)V

    .line 396
    .line 397
    .line 398
    const/4 v12, 0x6

    .line 399
    invoke-direct {v11, v3, v14, v13, v12}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ll6/d;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v8}, LP/o;->g(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    const/16 v13, 0x20

    .line 407
    .line 408
    if-ne v10, v13, :cond_18

    .line 409
    .line 410
    move v10, v9

    .line 411
    goto :goto_a

    .line 412
    :cond_18
    const/4 v10, 0x0

    .line 413
    :goto_a
    or-int/2addr v10, v12

    .line 414
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v12

    .line 418
    if-nez v10, :cond_19

    .line 419
    .line 420
    if-ne v12, v15, :cond_1a

    .line 421
    .line 422
    :cond_19
    new-instance v12, LA/Y;

    .line 423
    .line 424
    const/16 v10, 0xc

    .line 425
    .line 426
    invoke-direct {v12, v10, v8, v3}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :cond_1a
    check-cast v12, LB5/c;

    .line 433
    .line 434
    invoke-static {v11, v9, v12}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    :goto_b
    const/4 v10, 0x0

    .line 439
    goto :goto_c

    .line 440
    :cond_1b
    sget-object v8, Lc0/j;->q:Lc0/j;

    .line 441
    .line 442
    goto :goto_b

    .line 443
    :goto_c
    invoke-virtual {v0, v10}, LP/o;->p(Z)V

    .line 444
    .line 445
    .line 446
    sget-object v10, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 447
    .line 448
    invoke-interface {v10, v8}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    and-int/lit8 v6, v6, 0xe

    .line 453
    .line 454
    const/4 v10, 0x4

    .line 455
    if-ne v6, v10, :cond_1c

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_1c
    const/4 v9, 0x0

    .line 459
    :goto_d
    invoke-virtual {v0, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    or-int/2addr v6, v9

    .line 464
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    if-nez v6, :cond_1d

    .line 469
    .line 470
    if-ne v9, v15, :cond_1e

    .line 471
    .line 472
    :cond_1d
    new-instance v9, Lt/j;

    .line 473
    .line 474
    invoke-direct {v9, v1, v2, v7}, Lt/j;-><init>(JLP/S0;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_1e
    check-cast v9, LB5/c;

    .line 481
    .line 482
    const/4 v10, 0x0

    .line 483
    invoke-static {v8, v9, v0, v10}, Ln5/A;->b(Lc0/m;LB5/c;LP/o;I)V

    .line 484
    .line 485
    .line 486
    :cond_1f
    :goto_e
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    if-eqz v6, :cond_20

    .line 491
    .line 492
    new-instance v0, LM/e0;

    .line 493
    .line 494
    invoke-direct/range {v0 .. v5}, LM/e0;-><init>(JLB5/a;ZI)V

    .line 495
    .line 496
    .line 497
    iput-object v0, v6, LP/o0;->d:LB5/e;

    .line 498
    .line 499
    :cond_20
    return-void
.end method

.method public static final d(Lj0/C;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, Lj0/C;->B:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Li0/e;->d(J)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    cmpg-float v3, v0, v1

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Lj0/C;->C:LW0/c;

    .line 22
    .line 23
    invoke-interface {p0}, LW0/c;->b()F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sget v3, LM/g0;->a:F

    .line 28
    .line 29
    mul-float/2addr p0, v3

    .line 30
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v3, 0x1

    .line 35
    int-to-float v3, v3

    .line 36
    sub-float/2addr v3, p1

    .line 37
    mul-float/2addr v3, v1

    .line 38
    mul-float/2addr p1, p0

    .line 39
    add-float/2addr p1, v3

    .line 40
    div-float/2addr p1, v0

    .line 41
    sub-float/2addr v2, p1

    .line 42
    :cond_1
    :goto_0
    return v2
.end method

.method public static final e(Lj0/C;F)F
    .locals 4

    .line 1
    iget-wide v0, p0, Lj0/C;->B:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Li0/e;->b(J)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    cmpg-float v3, v0, v1

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Lj0/C;->C:LW0/c;

    .line 22
    .line 23
    invoke-interface {p0}, LW0/c;->b()F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sget v3, LM/g0;->b:F

    .line 28
    .line 29
    mul-float/2addr p0, v3

    .line 30
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v3, 0x1

    .line 35
    int-to-float v3, v3

    .line 36
    sub-float/2addr v3, p1

    .line 37
    mul-float/2addr v3, v1

    .line 38
    mul-float/2addr p1, p0

    .line 39
    add-float/2addr p1, v3

    .line 40
    div-float/2addr p1, v0

    .line 41
    sub-float/2addr v2, p1

    .line 42
    :cond_1
    :goto_0
    return v2
.end method
