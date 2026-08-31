.class public abstract Ly4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Li1/a;

.field public static volatile b:Lk3/d;

.field public static volatile c:Lk3/c;


# direct methods
.method public static A(Landroid/content/Context;I)I
    .locals 1

    .line 1
    const v0, 0x1030001

    .line 2
    .line 3
    .line 4
    filled-new-array {p1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public static B(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final a(Lc0/m;LC/A;LA/L;Lw/I;ZLv/l;Lc0/c;LA/g;LB5/c;LP/o;II)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v0, p4

    move-object/from16 v7, p6

    move-object/from16 v6, p7

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    const v2, 0x37213af3

    .line 1
    invoke-virtual {v11, v2}, LP/o;->U(I)LP/o;

    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v11, v1}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v8, v12, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :cond_3
    and-int/lit16 v8, v12, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v2, v8

    :cond_5
    and-int/lit16 v8, v12, 0xc00

    const/4 v10, 0x0

    const/16 v16, 0x400

    if-nez v8, :cond_7

    invoke-virtual {v11, v10}, LP/o;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    move/from16 v8, v16

    :goto_4
    or-int/2addr v2, v8

    :cond_7
    and-int/lit16 v8, v12, 0x6000

    const/4 v10, 0x1

    if-nez v8, :cond_9

    invoke-virtual {v11, v10}, LP/o;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v2, v8

    :cond_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v12

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-virtual {v11, v8}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    const/high16 v20, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v20, 0x10000

    :goto_6
    or-int v2, v2, v20

    goto :goto_7

    :cond_b
    move-object/from16 v8, p3

    :goto_7
    const/high16 v20, 0x180000

    and-int v21, v12, v20

    if-nez v21, :cond_d

    invoke-virtual {v11, v0}, LP/o;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v21, 0x80000

    :goto_8
    or-int v2, v2, v21

    :cond_d
    const/high16 v21, 0xc00000

    and-int v22, v12, v21

    move-object/from16 v5, p5

    if-nez v22, :cond_f

    invoke-virtual {v11, v5}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    const/high16 v23, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v23, 0x400000

    :goto_9
    or-int v2, v2, v23

    :cond_f
    const/high16 v23, 0x6000000

    or-int v2, v2, v23

    const/high16 v24, 0x30000000

    and-int v25, v12, v24

    if-nez v25, :cond_11

    invoke-virtual {v11, v7}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000000

    goto :goto_a

    :cond_10
    const/high16 v25, 0x10000000

    :goto_a
    or-int v2, v2, v25

    :cond_11
    move/from16 v25, v2

    and-int/lit8 v2, v13, 0x6

    if-nez v2, :cond_13

    invoke-virtual {v11, v6}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    const/16 v17, 0x4

    goto :goto_b

    :cond_12
    const/16 v17, 0x2

    :goto_b
    or-int v2, v13, v17

    goto :goto_c

    :cond_13
    move v2, v13

    :goto_c
    or-int/lit16 v2, v2, 0x1b0

    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_15

    move-object/from16 v9, p8

    invoke-virtual {v11, v9}, LP/o;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_14

    const/16 v16, 0x800

    :cond_14
    or-int v2, v2, v16

    goto :goto_d

    :cond_15
    move-object/from16 v9, p8

    :goto_d
    const v16, 0x12492493

    and-int v10, v25, v16

    const v15, 0x12492492

    if-ne v10, v15, :cond_17

    and-int/lit16 v10, v2, 0x493

    const/16 v15, 0x492

    if-eq v10, v15, :cond_16

    goto :goto_e

    :cond_16
    const/4 v10, 0x0

    goto :goto_f

    :cond_17
    :goto_e
    const/4 v10, 0x1

    :goto_f
    and-int/lit8 v15, v25, 0x1

    invoke-virtual {v11, v15, v10}, LP/o;->K(IZ)Z

    move-result v10

    if-eqz v10, :cond_47

    shr-int/lit8 v10, v25, 0x3

    and-int/lit8 v15, v10, 0xe

    shr-int/lit8 v10, v2, 0x6

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v10, v15

    .line 2
    invoke-static/range {p8 .. p9}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    move-result-object v14

    and-int/lit8 v27, v10, 0xe

    move/from16 v28, v2

    xor-int/lit8 v2, v27, 0x6

    const/4 v5, 0x4

    if-le v2, v5, :cond_18

    .line 3
    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    and-int/lit8 v2, v10, 0x6

    if-ne v2, v5, :cond_1a

    :cond_19
    const/4 v2, 0x1

    goto :goto_10

    :cond_1a
    const/4 v2, 0x0

    .line 4
    :goto_10
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    .line 5
    sget-object v10, LP/k;->a:LP/S;

    if-nez v2, :cond_1b

    if-ne v5, v10, :cond_1c

    .line 6
    :cond_1b
    new-instance v2, LC/c;

    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v5, LP/c0;

    const v8, 0x7fffffff

    invoke-direct {v5, v8}, LP/c0;-><init>(I)V

    .line 9
    iput-object v5, v2, LC/c;->a:LP/c0;

    .line 10
    new-instance v5, LP/c0;

    invoke-direct {v5, v8}, LP/c0;-><init>(I)V

    .line 11
    iput-object v5, v2, LC/c;->b:LP/c0;

    .line 12
    sget-object v5, LP/S;->t:LP/S;

    new-instance v8, LC/j;

    const/4 v9, 0x0

    invoke-direct {v8, v14, v9}, LC/j;-><init>(LP/W;I)V

    invoke-static {v8, v5}, LP/b;->n(LB5/a;LP/I0;)LP/C;

    move-result-object v8

    .line 13
    new-instance v9, LC/k;

    const/4 v14, 0x0

    invoke-direct {v9, v8, v3, v2, v14}, LC/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v9, v5}, LP/b;->n(LB5/a;LP/I0;)LP/C;

    move-result-object v33

    .line 14
    new-instance v29, LC/i;

    const/16 v30, 0x0

    const/16 v31, 0x0

    .line 15
    const-class v32, LP/S0;

    const-string v34, "value"

    const-string v35, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v29 .. v35}, LC/i;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v5, v29

    .line 16
    invoke-virtual {v11, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 17
    :cond_1c
    check-cast v5, LH5/h;

    shr-int/lit8 v2, v25, 0x9

    and-int/lit8 v8, v2, 0x70

    or-int/2addr v8, v15

    and-int/lit8 v9, v8, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v14, 0x4

    if-le v9, v14, :cond_1d

    .line 18
    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    :cond_1d
    and-int/lit8 v9, v8, 0x6

    if-ne v9, v14, :cond_1f

    :cond_1e
    const/4 v9, 0x1

    goto :goto_11

    :cond_1f
    const/4 v9, 0x0

    :goto_11
    and-int/lit8 v14, v8, 0x70

    xor-int/lit8 v14, v14, 0x30

    move/from16 v27, v2

    const/16 v2, 0x20

    if-le v14, v2, :cond_20

    const/4 v14, 0x1

    invoke-virtual {v11, v14}, LP/o;->h(Z)Z

    move-result v16

    if-nez v16, :cond_21

    :cond_20
    and-int/lit8 v8, v8, 0x30

    if-ne v8, v2, :cond_22

    :cond_21
    const/4 v14, 0x1

    goto :goto_12

    :cond_22
    const/4 v14, 0x0

    :goto_12
    or-int v2, v9, v14

    .line 19
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_23

    if-ne v8, v10, :cond_24

    .line 20
    :cond_23
    new-instance v8, LC/d;

    invoke-direct {v8, v3}, LC/d;-><init>(LC/A;)V

    .line 21
    invoke-virtual {v11, v8}, LP/o;->d0(Ljava/lang/Object;)V

    .line 22
    :cond_24
    move-object v14, v8

    check-cast v14, LE/P;

    .line 23
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_25

    .line 24
    invoke-static {v11}, LP/b;->k(LP/o;)LM5/w;

    move-result-object v2

    .line 25
    invoke-virtual {v11, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 26
    :cond_25
    check-cast v2, LM5/w;

    .line 27
    sget-object v8, LC0/t0;->g:LP/T0;

    .line 28
    invoke-virtual {v11, v8}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    move-result-object v8

    .line 29
    check-cast v8, Lj0/t;

    .line 30
    sget-object v9, LC0/t0;->v:LP/z;

    .line 31
    invoke-virtual {v11, v9}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    move-result-object v9

    .line 32
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move-object/from16 v29, v2

    if-nez v9, :cond_26

    .line 33
    sget-object v9, LE/f0;->a:LE/E;

    goto :goto_13

    :cond_26
    const/4 v9, 0x0

    :goto_13
    const v30, 0xfff0

    and-int v30, v25, v30

    const/high16 v31, 0x70000

    and-int v31, v27, v31

    or-int v30, v30, v31

    const/high16 v31, 0x380000

    and-int v27, v27, v31

    or-int v27, v30, v27

    shl-int/lit8 v30, v28, 0x12

    const/high16 v32, 0x1c00000

    and-int v33, v30, v32

    or-int v27, v27, v33

    const/high16 v33, 0xe000000

    and-int v30, v30, v33

    or-int v27, v27, v30

    shl-int/lit8 v28, v28, 0x1b

    const/high16 v30, 0x70000000

    and-int v28, v28, v30

    or-int v2, v27, v28

    and-int/lit8 v27, v2, 0x70

    move-object/from16 v28, v5

    xor-int/lit8 v5, v27, 0x30

    const/16 v12, 0x20

    if-le v5, v12, :cond_27

    .line 34
    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_28

    :cond_27
    and-int/lit8 v5, v2, 0x30

    if-ne v5, v12, :cond_29

    :cond_28
    const/4 v5, 0x1

    goto :goto_14

    :cond_29
    const/4 v5, 0x0

    :goto_14
    and-int/lit16 v12, v2, 0x380

    xor-int/lit16 v12, v12, 0x180

    const/16 v3, 0x100

    if-le v12, v3, :cond_2a

    .line 35
    invoke-virtual {v11, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2b

    :cond_2a
    and-int/lit16 v12, v2, 0x180

    if-ne v12, v3, :cond_2c

    :cond_2b
    const/4 v3, 0x1

    goto :goto_15

    :cond_2c
    const/4 v3, 0x0

    :goto_15
    or-int/2addr v3, v5

    and-int/lit16 v5, v2, 0x1c00

    xor-int/lit16 v5, v5, 0xc00

    const/16 v12, 0x800

    if-le v5, v12, :cond_2d

    const/4 v5, 0x0

    .line 36
    invoke-virtual {v11, v5}, LP/o;->h(Z)Z

    move-result v18

    if-nez v18, :cond_2e

    goto :goto_16

    :cond_2d
    const/4 v5, 0x0

    :goto_16
    and-int/lit16 v5, v2, 0xc00

    if-ne v5, v12, :cond_2f

    :cond_2e
    const/4 v5, 0x1

    goto :goto_17

    :cond_2f
    const/4 v5, 0x0

    :goto_17
    or-int/2addr v3, v5

    const v5, 0xe000

    and-int/2addr v5, v2

    xor-int/lit16 v5, v5, 0x6000

    const/16 v12, 0x4000

    if-le v5, v12, :cond_30

    const/4 v5, 0x1

    .line 37
    invoke-virtual {v11, v5}, LP/o;->h(Z)Z

    move-result v19

    if-nez v19, :cond_31

    goto :goto_18

    :cond_30
    const/4 v5, 0x1

    :goto_18
    and-int/lit16 v5, v2, 0x6000

    if-ne v5, v12, :cond_32

    :cond_31
    const/4 v5, 0x1

    goto :goto_19

    :cond_32
    const/4 v5, 0x0

    :goto_19
    or-int/2addr v3, v5

    and-int v5, v2, v31

    xor-int v5, v5, v20

    const/high16 v12, 0x100000

    if-le v5, v12, :cond_33

    .line 38
    invoke-virtual {v11, v7}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_34

    :cond_33
    and-int v5, v2, v20

    if-ne v5, v12, :cond_35

    :cond_34
    const/4 v5, 0x1

    goto :goto_1a

    :cond_35
    const/4 v5, 0x0

    :goto_1a
    or-int/2addr v3, v5

    and-int v5, v2, v32

    xor-int v5, v5, v21

    const/high16 v12, 0x800000

    if-le v5, v12, :cond_37

    const/4 v5, 0x0

    .line 39
    invoke-virtual {v11, v5}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_36

    goto :goto_1b

    :cond_36
    const/4 v12, 0x1

    goto :goto_1c

    :cond_37
    const/4 v5, 0x0

    :goto_1b
    const/4 v12, 0x0

    :goto_1c
    or-int/2addr v3, v12

    and-int v12, v2, v33

    xor-int v12, v12, v23

    move/from16 v19, v2

    const/high16 v2, 0x4000000

    if-le v12, v2, :cond_39

    .line 40
    invoke-virtual {v11, v5}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    goto :goto_1d

    :cond_38
    const/4 v2, 0x1

    goto :goto_1e

    :cond_39
    :goto_1d
    const/4 v2, 0x0

    :goto_1e
    or-int/2addr v2, v3

    and-int v3, v19, v30

    xor-int v3, v3, v24

    const/high16 v5, 0x20000000

    if-le v3, v5, :cond_3a

    .line 41
    invoke-virtual {v11, v6}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3b

    :cond_3a
    and-int v3, v19, v24

    if-ne v3, v5, :cond_3c

    :cond_3b
    const/4 v3, 0x1

    goto :goto_1f

    :cond_3c
    const/4 v3, 0x0

    :goto_1f
    or-int/2addr v2, v3

    .line 42
    invoke-virtual {v11, v8}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 43
    invoke-virtual {v11, v9}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 44
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3e

    if-ne v3, v10, :cond_3d

    goto :goto_20

    :cond_3d
    move-object v2, v3

    move-object/from16 v36, v10

    move-object/from16 v10, v28

    const/4 v12, 0x0

    const/16 v26, 0x1

    move-object/from16 v3, p1

    goto :goto_21

    .line 45
    :cond_3e
    :goto_20
    new-instance v2, LC/o;

    move-object/from16 v3, p1

    move-object/from16 v36, v10

    move-object/from16 v5, v28

    const/4 v12, 0x0

    const/16 v26, 0x1

    move-object v10, v7

    move-object/from16 v7, v29

    invoke-direct/range {v2 .. v10}, LC/o;-><init>(LC/A;LA/L;LH5/h;LA/g;LM5/w;Lj0/t;LE/E;Lc0/c;)V

    move-object v10, v5

    .line 46
    invoke-virtual {v11, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 47
    :goto_21
    move-object/from16 v17, v2

    check-cast v17, LB5/e;

    .line 48
    sget-object v4, Lw/d0;->q:Lw/d0;

    if-eqz v0, :cond_46

    const v2, -0x5a30cd85

    invoke-virtual {v11, v2}, LP/o;->S(I)V

    shr-int/lit8 v2, v25, 0x15

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v15

    and-int/lit8 v5, v2, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x4

    if-le v5, v6, :cond_3f

    .line 49
    invoke-virtual {v11, v3}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_40

    :cond_3f
    and-int/lit8 v5, v2, 0x6

    if-ne v5, v6, :cond_41

    :cond_40
    move/from16 v5, v26

    goto :goto_22

    :cond_41
    move v5, v12

    :goto_22
    and-int/lit8 v2, v2, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v6, 0x20

    if-le v2, v6, :cond_42

    invoke-virtual {v11, v12}, LP/o;->e(I)Z

    move-result v2

    if-nez v2, :cond_43

    :cond_42
    move/from16 v26, v12

    :cond_43
    or-int v2, v5, v26

    .line 50
    invoke-virtual {v11}, LP/o;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_44

    move-object/from16 v2, v36

    if-ne v5, v2, :cond_45

    .line 51
    :cond_44
    new-instance v5, LC/e;

    invoke-direct {v5, v3}, LC/e;-><init>(LC/A;)V

    .line 52
    invoke-virtual {v11, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 53
    :cond_45
    check-cast v5, LC/e;

    .line 54
    iget-object v2, v3, LC/A;->n:LE/k;

    .line 55
    invoke-static {v5, v2, v4}, Landroidx/compose/foundation/lazy/layout/a;->a(LE/o;LE/k;Lw/d0;)Lc0/m;

    move-result-object v2

    .line 56
    invoke-virtual {v11, v12}, LP/o;->p(Z)V

    goto :goto_23

    :cond_46
    const v2, -0x5a2a49f0

    .line 57
    invoke-virtual {v11, v2}, LP/o;->S(I)V

    .line 58
    invoke-virtual {v11, v12}, LP/o;->p(Z)V

    .line 59
    sget-object v2, Lc0/j;->q:Lc0/j;

    .line 60
    :goto_23
    iget-object v5, v3, LC/A;->k:LC/x;

    .line 61
    invoke-interface {v1, v5}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v5

    .line 62
    iget-object v6, v3, LC/A;->l:LE/e;

    .line 63
    invoke-interface {v5, v6}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v5

    .line 64
    invoke-static {v5, v10, v14, v4, v0}, Landroidx/compose/foundation/lazy/layout/a;->b(Lc0/m;LH5/h;LE/P;Lw/d0;Z)Lc0/m;

    move-result-object v5

    .line 65
    invoke-interface {v5, v2}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v2

    .line 66
    iget-object v5, v3, LC/A;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 67
    iget-object v5, v5, Landroidx/compose/foundation/lazy/layout/b;->i:Lc0/m;

    .line 68
    invoke-interface {v2, v5}, Lc0/m;->d(Lc0/m;)Lc0/m;

    move-result-object v2

    .line 69
    iget-object v7, v3, LC/A;->f:Ly/i;

    const/4 v9, 0x0

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move v5, v0

    .line 70
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/a;->f(Lc0/m;Lw/A0;Lw/d0;ZLw/I;Ly/i;Lv/l;LF/o;)Lc0/m;

    move-result-object v0

    move-object v8, v3

    .line 71
    iget-object v4, v8, LC/A;->o:LE/K;

    const/4 v7, 0x0

    move-object v3, v0

    move-object v2, v10

    move-object v6, v11

    move-object/from16 v5, v17

    .line 72
    invoke-static/range {v2 .. v7}, LE/C;->a(LB5/a;Lc0/m;LE/K;LB5/e;LP/o;I)V

    goto :goto_24

    :cond_47
    move-object v8, v3

    .line 73
    invoke-virtual/range {p9 .. p9}, LP/o;->N()V

    :goto_24
    invoke-virtual/range {p9 .. p9}, LP/o;->r()LP/o0;

    move-result-object v12

    if-eqz v12, :cond_48

    new-instance v0, LC/l;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object v2, v8

    move v11, v13

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v11}, LC/l;-><init>(Lc0/m;LC/A;LA/L;Lw/I;ZLv/l;Lc0/c;LA/g;LB5/c;II)V

    .line 74
    iput-object v0, v12, LP/o0;->d:LB5/e;

    :cond_48
    return-void
.end method

.method public static final b(ZLB5/e;LP/o;I)V
    .locals 3

    .line 1
    const v0, 0x6c6a2a1a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, LP/o;->h(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    and-int/lit8 v1, v0, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    if-ne v1, v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p2}, LP/o;->x()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-virtual {p2}, LP/o;->N()V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    :goto_2
    and-int/lit8 v0, v0, 0x7e

    .line 47
    .line 48
    invoke-static {p0, p1, p2, v0}, Ln5/A;->f(ZLB5/e;LP/o;I)V

    .line 49
    .line 50
    .line 51
    :goto_3
    invoke-virtual {p2}, LP/o;->r()LP/o0;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    new-instance v0, LV1/a;

    .line 58
    .line 59
    invoke-direct {v0, p0, p1, p3}, LV1/a;-><init>(ZLB5/e;I)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p2, LP/o0;->d:LB5/e;

    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method public static final c(Lg6/a;Lg6/c;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lg6/d;->h:LO3/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lg6/d;->j:Ljava/util/logging/Logger;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, Lg6/c;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 p1, 0x20

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "%-22s"

    .line 33
    .line 34
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ": "

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lg6/a;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final d(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_1

    .line 3
    .line 4
    const-string v1, "?"

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    add-int/lit8 v1, p1, -0x1

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const-string v1, ","

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public static e(Ljava/lang/String;II)Ljava/lang/String;
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "%s (%s) must not be negative"

    .line 12
    .line 13
    invoke-static {p1, p0}, LC3/a;->H(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-ltz p2, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "%s (%s) must not be greater than size (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, LC3/a;->H(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p1, "negative size: "

    .line 42
    .line 43
    invoke-static {p2, p1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public static f(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 8
    .line 9
    const-string v1, "index"

    .line 10
    .line 11
    if-ltz p0, :cond_3

    .line 12
    .line 13
    if-ltz p1, :cond_2

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "%s (%s) must be less than size (%s)"

    .line 28
    .line 29
    invoke-static {p1, p0}, LC3/a;->H(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "negative size: "

    .line 37
    .line 38
    invoke-static {p1, v0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "%s (%s) must not be negative"

    .line 55
    .line 56
    invoke-static {p1, p0}, LC3/a;->H(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public static final g(LR4/k1;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "dataObjects"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 9
    .line 10
    iget-object v2, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 11
    .line 12
    const-string v3, "onboarding_prefs"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "appLoadedFirstTime"

    .line 20
    .line 21
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x0

    .line 27
    if-nez v5, :cond_3

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v5, v1, LR4/i;->c:LR4/Y0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v5, v7

    .line 35
    :goto_0
    if-eqz v5, :cond_3

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v5, v1, LR4/i;->c:LR4/Y0;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    iget-object v5, v5, LR4/Y0;->c:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v5, v4

    .line 53
    :goto_1
    if-eqz v5, :cond_3

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v5, v1, LR4/i;->c:LR4/Y0;

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    iget-object v5, v5, LR4/Y0;->a:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v5, v4

    .line 71
    :goto_2
    if-eqz v5, :cond_3

    .line 72
    .line 73
    move v5, v6

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move v5, v4

    .line 76
    :goto_3
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-interface {v8, v3, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v3, v1, LR4/i;->c:LR4/Y0;

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move-object v3, v7

    .line 95
    :goto_4
    const-wide/16 v8, 0x0

    .line 96
    .line 97
    const-string v10, "appStartingDay"

    .line 98
    .line 99
    if-eqz v3, :cond_c

    .line 100
    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    iget-object v3, v1, LR4/i;->c:LR4/Y0;

    .line 104
    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    iget-object v3, v3, LR4/Y0;->b:Ljava/lang/Integer;

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    move-object v3, v7

    .line 111
    :goto_5
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-interface {v2, v10, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v11

    .line 122
    cmp-long v13, v11, v8

    .line 123
    .line 124
    if-nez v13, :cond_7

    .line 125
    .line 126
    :goto_6
    move v3, v6

    .line 127
    goto :goto_7

    .line 128
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v13

    .line 132
    sub-long/2addr v13, v11

    .line 133
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 134
    .line 135
    invoke-virtual {v11, v13, v14}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v11

    .line 139
    int-to-long v13, v3

    .line 140
    sub-long v11, v13, v11

    .line 141
    .line 142
    const-wide/16 v15, 0x1

    .line 143
    .line 144
    cmp-long v3, v11, v15

    .line 145
    .line 146
    if-ltz v3, :cond_8

    .line 147
    .line 148
    cmp-long v3, v11, v13

    .line 149
    .line 150
    if-gtz v3, :cond_8

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_8
    move v3, v4

    .line 154
    :goto_7
    if-eqz v3, :cond_c

    .line 155
    .line 156
    if-eqz v1, :cond_9

    .line 157
    .line 158
    iget-object v3, v1, LR4/i;->c:LR4/Y0;

    .line 159
    .line 160
    if-eqz v3, :cond_9

    .line 161
    .line 162
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 163
    .line 164
    iget-object v3, v3, LR4/Y0;->c:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    goto :goto_8

    .line 171
    :cond_9
    move v3, v4

    .line 172
    :goto_8
    if-eqz v3, :cond_c

    .line 173
    .line 174
    if-eqz v1, :cond_b

    .line 175
    .line 176
    iget-object v3, v1, LR4/i;->c:LR4/Y0;

    .line 177
    .line 178
    if-eqz v3, :cond_b

    .line 179
    .line 180
    iget-object v3, v3, LR4/Y0;->b:Ljava/lang/Integer;

    .line 181
    .line 182
    if-nez v3, :cond_a

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-nez v3, :cond_b

    .line 190
    .line 191
    move v3, v6

    .line 192
    goto :goto_a

    .line 193
    :cond_b
    :goto_9
    move v3, v4

    .line 194
    :goto_a
    if-nez v3, :cond_c

    .line 195
    .line 196
    move v3, v6

    .line 197
    goto :goto_b

    .line 198
    :cond_c
    move v3, v4

    .line 199
    :goto_b
    if-eqz v3, :cond_d

    .line 200
    .line 201
    invoke-interface {v2, v10, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 202
    .line 203
    .line 204
    move-result-wide v11

    .line 205
    cmp-long v8, v11, v8

    .line 206
    .line 207
    if-nez v8, :cond_d

    .line 208
    .line 209
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 210
    .line 211
    .line 212
    move-result-wide v8

    .line 213
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v2, v10, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 222
    .line 223
    .line 224
    :cond_d
    if-eqz v1, :cond_e

    .line 225
    .line 226
    iget-object v2, v1, LR4/i;->c:LR4/Y0;

    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_e
    move-object v2, v7

    .line 230
    :goto_c
    if-eqz v2, :cond_11

    .line 231
    .line 232
    if-eqz v1, :cond_f

    .line 233
    .line 234
    iget-object v2, v1, LR4/i;->c:LR4/Y0;

    .line 235
    .line 236
    if-eqz v2, :cond_f

    .line 237
    .line 238
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 239
    .line 240
    iget-object v2, v2, LR4/Y0;->c:Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    goto :goto_d

    .line 247
    :cond_f
    move v2, v4

    .line 248
    :goto_d
    if-eqz v2, :cond_11

    .line 249
    .line 250
    if-nez v5, :cond_11

    .line 251
    .line 252
    if-nez v3, :cond_11

    .line 253
    .line 254
    iget-object v0, v0, LR4/k1;->N:LO3/D;

    .line 255
    .line 256
    if-eqz v0, :cond_10

    .line 257
    .line 258
    goto :goto_e

    .line 259
    :cond_10
    const-string v0, "inAppPurchaseUtil"

    .line 260
    .line 261
    invoke-static {v0}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v7

    .line 265
    :cond_11
    :goto_e
    if-eqz v1, :cond_12

    .line 266
    .line 267
    iget-object v0, v1, LR4/i;->c:LR4/Y0;

    .line 268
    .line 269
    goto :goto_f

    .line 270
    :cond_12
    move-object v0, v7

    .line 271
    :goto_f
    if-eqz v0, :cond_14

    .line 272
    .line 273
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 274
    .line 275
    if-eqz v1, :cond_13

    .line 276
    .line 277
    iget-object v7, v1, LR4/i;->c:LR4/Y0;

    .line 278
    .line 279
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v7, LR4/Y0;->c:Ljava/lang/Boolean;

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_14

    .line 289
    .line 290
    if-nez v5, :cond_14

    .line 291
    .line 292
    if-nez v3, :cond_14

    .line 293
    .line 294
    return v6

    .line 295
    :cond_14
    return v4
.end method

.method public static h(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-gt p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 7
    .line 8
    const-string v1, "index"

    .line 9
    .line 10
    invoke-static {v1, p0, p1}, Ly4/b;->e(Ljava/lang/String;II)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public static i(III)V
    .locals 1

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p1, p0, :cond_1

    .line 4
    .line 5
    if-le p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 10
    .line 11
    if-ltz p0, :cond_4

    .line 12
    .line 13
    if-gt p0, p2, :cond_4

    .line 14
    .line 15
    if-ltz p1, :cond_3

    .line 16
    .line 17
    if-le p1, p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "end index (%s) must not be less than start index (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, LC3/a;->H(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    const-string p0, "end index"

    .line 40
    .line 41
    invoke-static {p0, p1, p2}, Ly4/b;->e(Ljava/lang/String;II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    const-string p1, "start index"

    .line 47
    .line 48
    invoke-static {p1, p0, p2}, Ly4/b;->e(Ljava/lang/String;II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static final j(JLw/d0;)V
    .locals 2

    .line 1
    sget-object v0, Lw/d0;->q:Lw/d0;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne p2, v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0, p1}, LW0/a;->g(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 16
    .line 17
    invoke-static {p0}, Lz/a;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-static {p0, p1}, LW0/a;->h(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    const-string p0, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 29
    .line 30
    invoke-static {p0}, Lz/a;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final k(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;
    .locals 5

    .line 1
    const-string v0, "regexList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Li5/a;

    .line 25
    .line 26
    iget-object v2, v1, Li5/a;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, v1, Li5/a;->b:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, v1, Li5/a;->a:Ljava/lang/String;

    .line 31
    .line 32
    const/16 v4, 0x42

    .line 33
    .line 34
    invoke-static {v2, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v4, "compile(...)"

    .line 39
    .line 40
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v4, "ALL_PAGES"

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-static {v1}, Ly4/b;->s(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_1
    const-string v4, "MULTIPLE_PAGE"

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-static {v1}, Ly4/b;->s(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_2
    const-string v4, "SINGLE_PAGE"

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    invoke-static {v1}, Ly4/b;->s(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_3
    const-string v4, "CUSTOM"

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_0

    .line 109
    .line 110
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_0

    .line 119
    .line 120
    invoke-static {v1}, Ly4/b;->s(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_4
    return-object v0
.end method

.method public static l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LV2/h;LV2/g;Z)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, Ll6/d;->v(Landroid/graphics/Bitmap$Config;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v5, p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    :goto_1
    if-ne v4, v5, :cond_3

    .line 37
    .line 38
    if-eqz p4, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sget-object v5, LV2/h;->c:LV2/h;

    .line 50
    .line 51
    invoke-static {p4, v4, p2, p3, v5}, LD5/a;->t(IILV2/h;LV2/g;LV2/h;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    shr-long v6, v4, v3

    .line 56
    .line 57
    long-to-int p4, v6

    .line 58
    and-long/2addr v4, v1

    .line 59
    long-to-int v4, v4

    .line 60
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-static {v5, v6, p4, v4, p3}, LD5/a;->u(IIIILV2/g;)D

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 73
    .line 74
    cmpg-double p4, v4, v6

    .line 75
    .line 76
    if-nez p4, :cond_3

    .line 77
    .line 78
    :goto_2
    return-object v0

    .line 79
    :cond_3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, LY2/j;->b(Landroid/graphics/drawable/Drawable;)I

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    const/16 v0, 0x200

    .line 88
    .line 89
    if-lez p4, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    move p4, v0

    .line 93
    :goto_3
    invoke-static {p0}, LY2/j;->a(Landroid/graphics/drawable/Drawable;)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-lez v4, :cond_5

    .line 98
    .line 99
    move v0, v4

    .line 100
    :cond_5
    sget-object v4, LV2/h;->c:LV2/h;

    .line 101
    .line 102
    invoke-static {p4, v0, p2, p3, v4}, LD5/a;->t(IILV2/h;LV2/g;LV2/h;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    shr-long v6, v4, v3

    .line 107
    .line 108
    long-to-int p2, v6

    .line 109
    and-long/2addr v1, v4

    .line 110
    long-to-int v1, v1

    .line 111
    invoke-static {p4, v0, p2, v1, p3}, LD5/a;->u(IIIILV2/g;)D

    .line 112
    .line 113
    .line 114
    move-result-wide p2

    .line 115
    int-to-double v1, p4

    .line 116
    mul-double/2addr v1, p2

    .line 117
    invoke-static {v1, v2}, LD5/a;->F(D)I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    int-to-double v0, v0

    .line 122
    mul-double/2addr p2, v0

    .line 123
    invoke-static {p2, p3}, LD5/a;->F(D)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    invoke-static {p1}, Ll6/d;->v(Landroid/graphics/Bitmap$Config;)Z

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    if-eqz p3, :cond_7

    .line 134
    .line 135
    :cond_6
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 136
    .line 137
    :cond_7
    invoke-static {p4, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    iget v0, p3, Landroid/graphics/Rect;->left:I

    .line 146
    .line 147
    iget v1, p3, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    iget v2, p3, Landroid/graphics/Rect;->right:I

    .line 150
    .line 151
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    invoke-virtual {p0, v3, v3, p4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 155
    .line 156
    .line 157
    new-instance p2, Landroid/graphics/Canvas;

    .line 158
    .line 159
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v0, v1, v2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 166
    .line 167
    .line 168
    return-object p1
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public static n(II)I
    .locals 1

    .line 1
    if-ltz p1, :cond_3

    .line 2
    .line 3
    if-gt p1, p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    shr-int/lit8 v0, p0, 0x1

    .line 7
    .line 8
    add-int/2addr p0, v0

    .line 9
    add-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    if-ge p0, p1, :cond_1

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    shl-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    :cond_1
    if-gez p0, :cond_2

    .line 22
    .line 23
    const p0, 0x7fffffff

    .line 24
    .line 25
    .line 26
    :cond_2
    return p0

    .line 27
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p1, "cannot store more than Integer.MAX_VALUE elements"

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public static final o(ILjava/util/List;)I
    .locals 7

    .line 1
    invoke-static {p1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LL0/n;

    .line 6
    .line 7
    iget v0, v0, LL0/n;->c:I

    .line 8
    .line 9
    invoke-static {p1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LL0/n;

    .line 14
    .line 15
    iget v1, v1, LL0/n;->c:I

    .line 16
    .line 17
    if-gt p0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Index "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " should be less or equal than last line\'s end "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LQ0/a;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x1

    .line 50
    sub-int/2addr v0, v1

    .line 51
    const/4 v2, 0x0

    .line 52
    move v3, v2

    .line 53
    :goto_1
    if-gt v3, v0, :cond_4

    .line 54
    .line 55
    add-int v4, v3, v0

    .line 56
    .line 57
    ushr-int/2addr v4, v1

    .line 58
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, LL0/n;

    .line 63
    .line 64
    iget v6, v5, LL0/n;->b:I

    .line 65
    .line 66
    if-le v6, p0, :cond_1

    .line 67
    .line 68
    move v5, v1

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget v5, v5, LL0/n;->c:I

    .line 71
    .line 72
    if-gt v5, p0, :cond_2

    .line 73
    .line 74
    const/4 v5, -0x1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move v5, v2

    .line 77
    :goto_2
    if-gez v5, :cond_3

    .line 78
    .line 79
    add-int/lit8 v3, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    if-lez v5, :cond_5

    .line 83
    .line 84
    add-int/lit8 v0, v4, -0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    add-int/2addr v3, v1

    .line 88
    neg-int v4, v3

    .line 89
    :cond_5
    if-ltz v4, :cond_6

    .line 90
    .line 91
    move-object v0, p1

    .line 92
    check-cast v0, Ljava/util/Collection;

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-ge v4, v0, :cond_6

    .line 99
    .line 100
    return v4

    .line 101
    :cond_6
    const-string v0, "Found paragraph index "

    .line 102
    .line 103
    const-string v1, " should be in range [0, "

    .line 104
    .line 105
    invoke-static {v0, v1, v4}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ").\nDebug info: index="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, ", paragraphs=["

    .line 125
    .line 126
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const/4 p0, 0x0

    .line 130
    const/16 v1, 0x1f

    .line 131
    .line 132
    invoke-static {v1, p0, p1}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const/16 p0, 0x5d

    .line 140
    .line 141
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, LQ0/a;->a(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return v4
.end method

.method public static final p(ILjava/util/List;)I
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-gt v3, v0, :cond_4

    .line 10
    .line 11
    add-int v4, v3, v0

    .line 12
    .line 13
    ushr-int/2addr v4, v1

    .line 14
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, LL0/n;

    .line 19
    .line 20
    iget v6, v5, LL0/n;->d:I

    .line 21
    .line 22
    if-le v6, p0, :cond_0

    .line 23
    .line 24
    move v5, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v5, v5, LL0/n;->e:I

    .line 27
    .line 28
    if-gt v5, p0, :cond_1

    .line 29
    .line 30
    const/4 v5, -0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    if-gez v5, :cond_2

    .line 34
    .line 35
    add-int/lit8 v3, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-lez v5, :cond_3

    .line 39
    .line 40
    add-int/lit8 v0, v4, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return v4

    .line 44
    :cond_4
    add-int/2addr v3, v1

    .line 45
    neg-int p0, v3

    .line 46
    return p0
.end method

.method public static final q(J)Ljava/lang/String;
    .locals 12

    .line 1
    const-wide/32 v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const-string v1, " s "

    .line 7
    .line 8
    const v2, 0x3b9aca00

    .line 9
    .line 10
    .line 11
    const v3, 0x1dcd6500

    .line 12
    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    sub-long/2addr p0, v3

    .line 23
    int-to-long v2, v2

    .line 24
    div-long/2addr p0, v2

    .line 25
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_0
    const-wide/32 v4, -0xf404c

    .line 38
    .line 39
    .line 40
    cmp-long v0, p0, v4

    .line 41
    .line 42
    const-string v4, " ms"

    .line 43
    .line 44
    const v5, 0xf4240

    .line 45
    .line 46
    .line 47
    const v6, 0x7a120

    .line 48
    .line 49
    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    int-to-long v1, v6

    .line 58
    sub-long/2addr p0, v1

    .line 59
    int-to-long v1, v5

    .line 60
    div-long/2addr p0, v1

    .line 61
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const-wide/16 v7, 0x0

    .line 73
    .line 74
    cmp-long v0, p0, v7

    .line 75
    .line 76
    const-string v7, " \u00b5s"

    .line 77
    .line 78
    const/16 v8, 0x3e8

    .line 79
    .line 80
    const/16 v9, 0x1f4

    .line 81
    .line 82
    if-gtz v0, :cond_2

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    int-to-long v1, v9

    .line 90
    sub-long/2addr p0, v1

    .line 91
    int-to-long v1, v8

    .line 92
    div-long/2addr p0, v1

    .line 93
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const-wide/32 v10, 0xf404c

    .line 105
    .line 106
    .line 107
    cmp-long v0, p0, v10

    .line 108
    .line 109
    if-gez v0, :cond_3

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    int-to-long v1, v9

    .line 117
    add-long/2addr p0, v1

    .line 118
    int-to-long v1, v8

    .line 119
    div-long/2addr p0, v1

    .line 120
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    goto :goto_0

    .line 131
    :cond_3
    const-wide/32 v7, 0x3b9328e0

    .line 132
    .line 133
    .line 134
    cmp-long v0, p0, v7

    .line 135
    .line 136
    if-gez v0, :cond_4

    .line 137
    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    int-to-long v1, v6

    .line 144
    add-long/2addr p0, v1

    .line 145
    int-to-long v1, v5

    .line 146
    div-long/2addr p0, v1

    .line 147
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    goto :goto_0

    .line 158
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    int-to-long v3, v3

    .line 164
    add-long/2addr p0, v3

    .line 165
    int-to-long v2, v2

    .line 166
    div-long/2addr p0, v2

    .line 167
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :goto_0
    const/4 p1, 0x1

    .line 178
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    const-string p1, "%6s"

    .line 187
    .line 188
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
.end method

.method public static final s(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "EXTERNAL"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "CUSTOM"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p0
.end method

.method public static t(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_7

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eq p0, v1, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq p0, v2, :cond_5

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/16 v0, 0x40

    .line 23
    .line 24
    if-eq p0, v0, :cond_3

    .line 25
    .line 26
    const/16 v0, 0x80

    .line 27
    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x100

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x200

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x9

    .line 39
    .line 40
    return p0

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v1, "type needs to be >= FIRST and <= LAST, type="

    .line 44
    .line 45
    invoke-static {p0, v1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    return v1

    .line 54
    :cond_2
    const/4 p0, 0x7

    .line 55
    return p0

    .line 56
    :cond_3
    const/4 p0, 0x6

    .line 57
    return p0

    .line 58
    :cond_4
    const/4 p0, 0x5

    .line 59
    return p0

    .line 60
    :cond_5
    return v0

    .line 61
    :cond_6
    const/4 p0, 0x3

    .line 62
    return p0

    .line 63
    :cond_7
    return v1

    .line 64
    :cond_8
    return v0

    .line 65
    :cond_9
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static final v(Lcom/web2native/MainActivity;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "appConfig.json"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-object p0, v1

    .line 14
    :goto_0
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-array v0, v0, [B

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    const-string p0, "UTF-8"

    .line 30
    .line 31
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v2, "forName(...)"

    .line 36
    .line 37
    invoke-static {p0, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v2, v0, p0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    .line 44
    .line 45
    move-object v1, v2

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    .line 50
    .line 51
    :goto_1
    return-object v1
.end method

.method public static final w(Ljava/lang/String;Landroid/webkit/WebView;Ljava/util/HashMap;LR4/k1;)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "customHeaders"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "dataObject"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    const-string v0, "w2n://"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p0, v0, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {p3, p0}, LC3/a;->C(LR4/k1;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    const-string v0, "copyBackForwardList(...)"

    .line 34
    .line 35
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p3}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p3, v0}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p3}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    new-instance v0, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "Referer"

    .line 62
    .line 63
    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/util/HashMap;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-nez p3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p1, p0, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    invoke-virtual {p2}, Ljava/util/HashMap;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-nez p3, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1, p0, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catch_0
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static final x(Ljava/util/ArrayList;Ljava/lang/String;)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    move v4, v3

    .line 9
    :goto_0
    if-ge v4, v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    add-int/lit8 v4, v4, 0x1

    .line 16
    .line 17
    add-int/lit8 v6, v3, 0x1

    .line 18
    .line 19
    if-ltz v3, :cond_2

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    const-string v7, "pattern"

    .line 24
    .line 25
    invoke-static {v5, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 v7, 0x42

    .line 29
    .line 30
    invoke-static {v5, v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v7, "compile(...)"

    .line 35
    .line 36
    invoke-static {v5, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v5, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Ljava/lang/String;

    .line 59
    .line 60
    const-string v8, "$))"

    .line 61
    .line 62
    invoke-static {v7, v8, v2}, LJ5/t;->A0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, Ljava/lang/String;

    .line 73
    .line 74
    const-string v8, "$)"

    .line 75
    .line 76
    invoke-static {v7, v8, v2}, LJ5/t;->A0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_1

    .line 81
    .line 82
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v5, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    :goto_1
    move v1, v3

    .line 97
    :cond_1
    move v3, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    throw p0

    .line 104
    :cond_3
    return v1
.end method

.method public static y(Ljava/nio/MappedByteBuffer;)LF1/b;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0xffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const-string v2, "Cannot read metadata."

    .line 30
    .line 31
    if-gt v0, v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v3, v1

    .line 44
    :goto_0
    const-wide v4, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide/16 v6, -0x1

    .line 50
    .line 51
    if-ge v3, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    add-int/lit8 v9, v9, 0x4

    .line 62
    .line 63
    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    int-to-long v9, v9

    .line 71
    and-long/2addr v9, v4

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    add-int/lit8 v11, v11, 0x4

    .line 77
    .line 78
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 79
    .line 80
    .line 81
    const v11, 0x6d657461

    .line 82
    .line 83
    .line 84
    if-ne v11, v8, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-wide v9, v6

    .line 91
    :goto_1
    cmp-long v0, v9, v6

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v6, v0

    .line 100
    sub-long v6, v9, v6

    .line 101
    .line 102
    long-to-int v0, v6

    .line 103
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/2addr v3, v0

    .line 108
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, 0xc

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v6, v0

    .line 125
    and-long/2addr v6, v4

    .line 126
    :goto_2
    int-to-long v11, v1

    .line 127
    cmp-long v0, v11, v6

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-long v11, v3

    .line 140
    and-long/2addr v11, v4

    .line 141
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 142
    .line 143
    .line 144
    const v3, 0x456d6a69

    .line 145
    .line 146
    .line 147
    if-eq v3, v0, :cond_3

    .line 148
    .line 149
    const v3, 0x656d6a69

    .line 150
    .line 151
    .line 152
    if-ne v3, v0, :cond_2

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    :goto_3
    add-long/2addr v11, v9

    .line 159
    long-to-int v0, v11

    .line 160
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    new-instance v0, LF1/b;

    .line 164
    .line 165
    invoke-direct {v0}, LF1/c;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    add-int/2addr v2, v1

    .line 186
    iput-object p0, v0, LF1/c;->t:Ljava/lang/Object;

    .line 187
    .line 188
    iput v2, v0, LF1/c;->q:I

    .line 189
    .line 190
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    sub-int/2addr v2, p0

    .line 195
    iput v2, v0, LF1/c;->r:I

    .line 196
    .line 197
    iget-object p0, v0, LF1/c;->t:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    iput p0, v0, LF1/c;->s:I

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 209
    .line 210
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0

    .line 214
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 215
    .line 216
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p0
.end method

.method public static z(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract r(Lo3/b;FF)V
.end method

.method public abstract u(Ljava/lang/Object;)V
.end method
