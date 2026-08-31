.class public abstract LM/N0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LM/j;->C:LM/j;

    .line 2
    .line 3
    new-instance v1, LP/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LM/N0;->a:LP/z;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(LL0/F;LX/e;LP/o;I)V
    .locals 6

    .line 1
    const v0, -0x1b6f9f5f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, LP/o;->g(Ljava/lang/Object;)Z

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
    goto :goto_4

    .line 46
    :cond_3
    :goto_2
    sget-object v1, LM/N0;->a:LP/z;

    .line 47
    .line 48
    invoke-virtual {p2, v1}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LL0/F;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    if-eqz p0, :cond_5

    .line 58
    .line 59
    sget-object v3, LL0/F;->d:LL0/F;

    .line 60
    .line 61
    invoke-virtual {p0, v3}, LL0/F;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    new-instance v3, LL0/F;

    .line 69
    .line 70
    iget-object v4, v2, LL0/F;->a:LL0/y;

    .line 71
    .line 72
    iget-object v5, p0, LL0/F;->a:LL0/y;

    .line 73
    .line 74
    invoke-virtual {v4, v5}, LL0/y;->c(LL0/y;)LL0/y;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget-object v2, v2, LL0/F;->b:LL0/q;

    .line 79
    .line 80
    iget-object v5, p0, LL0/F;->b:LL0/q;

    .line 81
    .line 82
    invoke-virtual {v2, v5}, LL0/q;->a(LL0/q;)LL0/q;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v3, v4, v2}, LL0/F;-><init>(LL0/y;LL0/q;)V

    .line 87
    .line 88
    .line 89
    move-object v2, v3

    .line 90
    :cond_5
    :goto_3
    invoke-virtual {v1, v2}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    and-int/lit8 v0, v0, 0x70

    .line 95
    .line 96
    const/16 v2, 0x8

    .line 97
    .line 98
    or-int/2addr v0, v2

    .line 99
    invoke-static {v1, p1, p2, v0}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 100
    .line 101
    .line 102
    :goto_4
    invoke-virtual {p2}, LP/o;->r()LP/o0;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    new-instance v0, LB0/j0;

    .line 109
    .line 110
    const/16 v1, 0x8

    .line 111
    .line 112
    invoke-direct {v0, p3, v1, p0, p1}, LB0/j0;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p2, LP/o0;->d:LB5/e;

    .line 116
    .line 117
    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/String;Lc0/m;JJLO0/j;JLV0/k;JIZIILL0/F;LP/o;III)V
    .locals 29

    move-object/from16 v0, p17

    move/from16 v1, p18

    move/from16 v2, p19

    move/from16 v3, p20

    const v4, -0x7a7e7926

    .line 1
    invoke-virtual {v0, v4}, LP/o;->U(I)LP/o;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_2

    move-object/from16 v9, p1

    invoke-virtual {v0, v9}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :goto_3
    and-int/lit8 v10, v3, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v7, v7, 0x180

    :cond_5
    move-wide/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v1, 0x180

    if-nez v11, :cond_5

    move-wide/from16 v11, p2

    invoke-virtual {v0, v11, v12}, LP/o;->f(J)Z

    move-result v13

    if-eqz v13, :cond_7

    const/16 v13, 0x100

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v7, v13

    :goto_5
    and-int/lit8 v13, v3, 0x8

    if-eqz v13, :cond_8

    or-int/lit16 v7, v7, 0xc00

    move v5, v7

    move-wide/from16 v6, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v5, v1, 0xc00

    move/from16 v17, v7

    move-wide/from16 v6, p4

    if-nez v5, :cond_a

    invoke-virtual {v0, v6, v7}, LP/o;->f(J)Z

    move-result v18

    if-eqz v18, :cond_9

    const/16 v18, 0x800

    goto :goto_6

    :cond_9
    const/16 v18, 0x400

    :goto_6
    or-int v17, v17, v18

    :cond_a
    move/from16 v5, v17

    :goto_7
    or-int/lit16 v14, v5, 0x6000

    and-int/lit8 v19, v3, 0x20

    const v20, 0x36000

    const/high16 v21, 0x10000

    if-eqz v19, :cond_c

    or-int v14, v5, v20

    :cond_b
    move-object/from16 v5, p6

    goto :goto_9

    :cond_c
    const/high16 v5, 0x30000

    and-int/2addr v5, v1

    if-nez v5, :cond_b

    move-object/from16 v5, p6

    invoke-virtual {v0, v5}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_d

    const/high16 v22, 0x20000

    goto :goto_8

    :cond_d
    move/from16 v22, v21

    :goto_8
    or-int v14, v14, v22

    :goto_9
    const/high16 v22, 0x6d80000

    or-int v22, v14, v22

    and-int/lit16 v15, v3, 0x200

    if-eqz v15, :cond_f

    const/high16 v22, 0x36d80000

    or-int v22, v14, v22

    :cond_e
    move-object/from16 v14, p9

    goto :goto_b

    :cond_f
    const/high16 v14, 0x30000000

    and-int/2addr v14, v1

    if-nez v14, :cond_e

    move-object/from16 v14, p9

    invoke-virtual {v0, v14}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x20000000

    goto :goto_a

    :cond_10
    const/high16 v24, 0x10000000

    :goto_a
    or-int v22, v22, v24

    :goto_b
    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_11

    or-int/lit8 v16, v2, 0x6

    move-wide/from16 v4, p10

    :goto_c
    move/from16 v18, v1

    move/from16 v1, v16

    goto :goto_e

    :cond_11
    move-wide/from16 v4, p10

    invoke-virtual {v0, v4, v5}, LP/o;->f(J)Z

    move-result v24

    if-eqz v24, :cond_12

    const/16 v16, 0x4

    goto :goto_d

    :cond_12
    const/16 v16, 0x2

    :goto_d
    or-int v16, v2, v16

    goto :goto_c

    :goto_e
    or-int/lit16 v4, v1, 0x1b0

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_14

    or-int/lit16 v4, v1, 0xdb0

    :cond_13
    move/from16 v1, p14

    goto :goto_10

    :cond_14
    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_13

    move/from16 v1, p14

    invoke-virtual {v0, v1}, LP/o;->e(I)Z

    move-result v16

    if-eqz v16, :cond_15

    const/16 v17, 0x800

    goto :goto_f

    :cond_15
    const/16 v17, 0x400

    :goto_f
    or-int v4, v4, v17

    :goto_10
    or-int v4, v4, v20

    const/high16 v16, 0x180000

    and-int v16, v2, v16

    if-nez v16, :cond_17

    and-int v16, v3, v21

    move-object/from16 v1, p16

    if-nez v16, :cond_16

    invoke-virtual {v0, v1}, LP/o;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x100000

    goto :goto_11

    :cond_16
    const/high16 v16, 0x80000

    :goto_11
    or-int v4, v4, v16

    goto :goto_12

    :cond_17
    move-object/from16 v1, p16

    :goto_12
    const v16, 0x12492493

    and-int v1, v22, v16

    const v2, 0x12492492

    if-ne v1, v2, :cond_19

    const v1, 0x92493

    and-int/2addr v1, v4

    const v2, 0x92492

    if-ne v1, v2, :cond_19

    invoke-virtual {v0}, LP/o;->x()Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_13

    .line 2
    :cond_18
    invoke-virtual {v0}, LP/o;->N()V

    move/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-wide v5, v6

    move-object v2, v9

    move-wide v3, v11

    move-object v10, v14

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    move-wide/from16 v11, p10

    move/from16 v14, p13

    goto/16 :goto_1e

    .line 3
    :cond_19
    :goto_13
    invoke-virtual {v0}, LP/o;->P()V

    and-int/lit8 v1, p18, 0x1

    const v2, -0x380001

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, LP/o;->w()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_14

    .line 4
    :cond_1a
    invoke-virtual {v0}, LP/o;->N()V

    and-int v1, v3, v21

    if-eqz v1, :cond_1b

    and-int/2addr v4, v2

    :cond_1b
    move-wide/from16 v16, p7

    move-wide/from16 v18, p10

    move/from16 v10, p12

    move/from16 v2, p13

    move/from16 v5, p14

    move-object/from16 v8, p16

    move v13, v4

    move-object v1, v9

    move-object/from16 v9, p6

    move/from16 v4, p15

    goto :goto_1a

    :cond_1c
    :goto_14
    if-eqz v8, :cond_1d

    .line 5
    sget-object v1, Lc0/j;->q:Lc0/j;

    goto :goto_15

    :cond_1d
    move-object v1, v9

    :goto_15
    if-eqz v10, :cond_1e

    .line 6
    sget-wide v8, Lj0/o;->g:J

    move-wide v11, v8

    :cond_1e
    if-eqz v13, :cond_1f

    .line 7
    sget-wide v6, LW0/n;->c:J

    :cond_1f
    const/4 v8, 0x0

    if-eqz v19, :cond_20

    move-object v9, v8

    goto :goto_16

    :cond_20
    move-object/from16 v9, p6

    .line 8
    :goto_16
    sget-wide v16, LW0/n;->c:J

    if-eqz v15, :cond_21

    move-object v14, v8

    :cond_21
    if-eqz v18, :cond_22

    move-wide/from16 v18, v16

    goto :goto_17

    :cond_22
    move-wide/from16 v18, p10

    :goto_17
    if-eqz v5, :cond_23

    const v5, 0x7fffffff

    goto :goto_18

    :cond_23
    move/from16 v5, p14

    :goto_18
    and-int v8, v3, v21

    const/4 v10, 0x1

    if-eqz v8, :cond_24

    .line 9
    sget-object v8, LM/N0;->a:LP/z;

    .line 10
    invoke-virtual {v0, v8}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LL0/F;

    and-int/2addr v4, v2

    :goto_19
    move v13, v4

    move v2, v10

    move v4, v2

    goto :goto_1a

    :cond_24
    move-object/from16 v8, p16

    goto :goto_19

    :goto_1a
    invoke-virtual {v0}, LP/o;->q()V

    const v15, -0x6cf36ecd

    .line 11
    invoke-virtual {v0, v15}, LP/o;->S(I)V

    const-wide/16 v20, 0x10

    cmp-long v15, v11, v20

    move-object/from16 p13, v1

    const/4 v1, 0x0

    if-eqz v15, :cond_25

    move/from16 p14, v2

    move-wide/from16 v23, v11

    goto :goto_1c

    :cond_25
    const v15, -0x6cf36bc8

    .line 12
    invoke-virtual {v0, v15}, LP/o;->S(I)V

    .line 13
    invoke-virtual {v8}, LL0/F;->b()J

    move-result-wide v23

    cmp-long v15, v23, v20

    if-eqz v15, :cond_26

    move/from16 p14, v2

    goto :goto_1b

    .line 14
    :cond_26
    sget-object v15, LM/q;->a:LP/z;

    .line 15
    invoke-virtual {v0, v15}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    move-result-object v15

    .line 16
    check-cast v15, Lj0/o;

    move/from16 p14, v2

    .line 17
    iget-wide v2, v15, Lj0/o;->a:J

    move-wide/from16 v23, v2

    .line 18
    :goto_1b
    invoke-virtual {v0, v1}, LP/o;->p(Z)V

    :goto_1c
    invoke-virtual {v0, v1}, LP/o;->p(Z)V

    if-eqz v14, :cond_27

    .line 19
    iget v1, v14, LV0/k;->a:I

    goto :goto_1d

    :cond_27
    const/high16 v1, -0x80000000

    :goto_1d
    const v2, 0xfd6f50

    move/from16 p9, v1

    move/from16 p12, v2

    move-wide/from16 p4, v6

    move-object/from16 p1, v8

    move-object/from16 p6, v9

    move-wide/from16 p7, v16

    move-wide/from16 p10, v18

    move-wide/from16 p2, v23

    .line 20
    invoke-static/range {p1 .. p12}, LL0/F;->c(LL0/F;JJLO0/j;JIJI)LL0/F;

    move-result-object v1

    and-int/lit8 v2, v22, 0x7e

    shl-int/lit8 v3, v13, 0x9

    const v13, 0x36c00

    or-int/2addr v2, v13

    const/high16 v13, 0x380000

    and-int/2addr v3, v13

    or-int/2addr v2, v3

    const/high16 v3, 0xc00000

    or-int/2addr v2, v3

    move-object/from16 p1, p0

    move-object/from16 p2, p13

    move/from16 p5, p14

    move-object/from16 p8, v0

    move-object/from16 p3, v1

    move/from16 p9, v2

    move/from16 p7, v4

    move/from16 p6, v5

    move/from16 p4, v10

    .line 21
    invoke-static/range {p1 .. p9}, LD5/a;->b(Ljava/lang/String;Lc0/m;LL0/F;IZIILP/o;I)V

    move-object/from16 v1, p2

    move/from16 v0, p5

    move/from16 v2, p7

    move v15, v5

    move-wide v5, v6

    move-object v7, v9

    move v13, v10

    move-wide v3, v11

    move-object v10, v14

    move-wide/from16 v11, v18

    move v14, v0

    move/from16 v26, v2

    move-object v2, v1

    move-wide/from16 v27, v16

    move/from16 v16, v26

    move-object/from16 v17, v8

    move-wide/from16 v8, v27

    .line 22
    :goto_1e
    invoke-virtual/range {p17 .. p17}, LP/o;->r()LP/o0;

    move-result-object v0

    if-eqz v0, :cond_28

    move-object v1, v0

    new-instance v0, LM/M0;

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v25, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v20}, LM/M0;-><init>(Ljava/lang/String;Lc0/m;JJLO0/j;JLV0/k;JIZIILL0/F;III)V

    move-object/from16 v1, v25

    .line 23
    iput-object v0, v1, LP/o0;->d:LB5/e;

    :cond_28
    return-void
.end method
