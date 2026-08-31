.class public final LS0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/p;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LL0/F;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:LO0/d;

.field public final f:LW0/c;

.field public final g:LS0/e;

.field public final h:Ljava/lang/CharSequence;

.field public final i:LM0/e;

.field public j:LB0/G0;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;LL0/F;Ljava/util/List;Ljava/util/List;LO0/d;LW0/c;)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v1, LS0/d;->a:Ljava/lang/String;

    .line 3
    iput-object v0, v1, LS0/d;->b:LL0/F;

    .line 4
    iput-object v2, v1, LS0/d;->c:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v1, LS0/d;->d:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v1, LS0/d;->e:LO0/d;

    .line 7
    iput-object v3, v1, LS0/d;->f:LW0/c;

    .line 8
    new-instance v4, LS0/e;

    invoke-interface {v3}, LW0/c;->b()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, LV0/l;->b:LV0/l;

    iput-object v5, v4, LS0/e;->b:LV0/l;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, LS0/e;->c:I

    .line 13
    sget-object v7, Lj0/D;->d:Lj0/D;

    .line 14
    iput-object v7, v4, LS0/e;->d:Lj0/D;

    .line 15
    iput-object v4, v1, LS0/d;->g:LS0/e;

    .line 16
    iget-object v7, v0, LL0/F;->c:LL0/t;

    .line 17
    sget-object v7, LS0/i;->a:Lk3/c;

    .line 18
    sget-object v7, LS0/i;->a:Lk3/c;

    .line 19
    iget-object v8, v7, Lk3/c;->q:Ljava/lang/Object;

    check-cast v8, LP/S0;

    if-eqz v8, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, LE1/l;->c()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 21
    invoke-virtual {v7}, Lk3/c;->m()LP/S0;

    move-result-object v8

    iput-object v8, v7, Lk3/c;->q:Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_1
    sget-object v8, LS0/j;->a:LS0/k;

    .line 23
    :goto_0
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 24
    iput-boolean v7, v1, LS0/d;->k:Z

    .line 25
    iget-object v7, v0, LL0/F;->b:LL0/q;

    .line 26
    iget v7, v7, LL0/q;->b:I

    .line 27
    iget-object v8, v0, LL0/F;->a:LL0/y;

    .line 28
    iget-object v8, v8, LL0/y;->k:LR0/b;

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-ne v7, v9, :cond_3

    :cond_2
    :goto_1
    move v7, v10

    goto :goto_3

    :cond_3
    const/4 v9, 0x5

    if-ne v7, v9, :cond_5

    :cond_4
    move v7, v5

    goto :goto_3

    :cond_5
    if-ne v7, v6, :cond_6

    move v7, v11

    goto :goto_3

    :cond_6
    if-ne v7, v10, :cond_7

    move v7, v6

    goto :goto_3

    :cond_7
    if-ne v7, v5, :cond_8

    goto :goto_2

    :cond_8
    const/high16 v9, -0x80000000

    if-ne v7, v9, :cond_78

    :goto_2
    if-eqz v8, :cond_9

    .line 29
    iget-object v7, v8, LR0/b;->q:Ljava/util/List;

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LR0/a;

    .line 30
    iget-object v7, v7, LR0/a;->a:Ljava/util/Locale;

    if-nez v7, :cond_a

    .line 31
    :cond_9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 32
    :cond_a
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_2

    if-eq v7, v6, :cond_4

    goto :goto_1

    .line 33
    :goto_3
    iput v7, v1, LS0/d;->l:I

    .line 34
    new-instance v7, LS0/c;

    invoke-direct {v7, v11, v1}, LS0/c;-><init>(ILjava/lang/Object;)V

    .line 35
    iget-object v8, v0, LL0/F;->b:LL0/q;

    .line 36
    iget-object v8, v8, LL0/q;->i:LV0/t;

    if-nez v8, :cond_b

    .line 37
    sget-object v8, LV0/t;->c:LV0/t;

    .line 38
    :cond_b
    iget-boolean v9, v8, LV0/t;->b:Z

    if-eqz v9, :cond_c

    .line 39
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    or-int/lit16 v9, v9, 0x80

    goto :goto_4

    .line 40
    :cond_c
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    and-int/lit16 v9, v9, -0x81

    .line 41
    :goto_4
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setFlags(I)V

    .line 42
    iget v8, v8, LV0/t;->a:I

    if-ne v8, v6, :cond_d

    .line 43
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    or-int/lit8 v5, v5, 0x40

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFlags(I)V

    .line 44
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_d
    if-ne v8, v10, :cond_e

    .line 45
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 46
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_e
    if-ne v8, v5, :cond_f

    .line 47
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 48
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    .line 49
    :cond_f
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 50
    :goto_5
    iget-object v0, v0, LL0/F;->a:LL0/y;

    .line 51
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move v8, v11

    :goto_6
    if-ge v8, v5, :cond_11

    .line 52
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 53
    move-object v12, v10

    check-cast v12, LL0/c;

    .line 54
    iget-object v12, v12, LL0/c;->a:Ljava/lang/Object;

    .line 55
    instance-of v12, v12, LL0/y;

    if-eqz v12, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_11
    const/4 v10, 0x0

    :goto_7
    if-eqz v10, :cond_12

    move v2, v6

    goto :goto_8

    :cond_12
    move v2, v11

    .line 56
    :goto_8
    iget-wide v12, v0, LL0/y;->b:J

    iget-object v5, v0, LL0/y;->g:Ljava/lang/String;

    iget-object v8, v0, LL0/y;->k:LR0/b;

    iget-object v10, v0, LL0/y;->a:LV0/p;

    iget-object v14, v0, LL0/y;->j:LV0/q;

    move-object/from16 p2, v10

    const/16 p1, 0x0

    iget-wide v9, v0, LL0/y;->h:J

    move/from16 p4, v6

    move-object/from16 p5, v7

    .line 57
    invoke-static {v12, v13}, LW0/n;->b(J)J

    move-result-wide v6

    move-wide/from16 v16, v12

    const-wide v11, 0x100000000L

    .line 58
    invoke-static {v6, v7, v11, v12}, LW0/o;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_13

    move-wide/from16 v11, v16

    invoke-interface {v3, v11, v12}, LW0/c;->T(J)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_9

    :cond_13
    const-wide v11, 0x200000000L

    .line 59
    invoke-static {v6, v7, v11, v12}, LW0/o;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 60
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-static/range {v16 .. v17}, LW0/n;->c(J)F

    move-result v7

    mul-float/2addr v7, v6

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 61
    :cond_14
    :goto_9
    iget-object v6, v0, LL0/y;->f:LO0/p;

    if-nez v6, :cond_16

    .line 62
    iget-object v7, v0, LL0/y;->d:LO0/h;

    if-nez v7, :cond_16

    .line 63
    iget-object v7, v0, LL0/y;->c:LO0/j;

    if-eqz v7, :cond_15

    goto :goto_a

    :cond_15
    move-object/from16 v16, p5

    move/from16 p5, v2

    goto :goto_e

    .line 64
    :cond_16
    :goto_a
    iget-object v7, v0, LL0/y;->c:LO0/j;

    if-nez v7, :cond_17

    .line 65
    sget-object v7, LO0/j;->s:LO0/j;

    .line 66
    :cond_17
    iget-object v11, v0, LL0/y;->d:LO0/h;

    if-eqz v11, :cond_18

    .line 67
    iget v11, v11, LO0/h;->a:I

    goto :goto_b

    :cond_18
    const/4 v11, 0x0

    .line 68
    :goto_b
    iget-object v12, v0, LL0/y;->e:LO0/i;

    if-eqz v12, :cond_19

    .line 69
    iget v12, v12, LO0/i;->a:I

    goto :goto_c

    :cond_19
    const v12, 0xffff

    .line 70
    :goto_c
    const-string v13, "null cannot be cast to non-null type android.graphics.Typeface"

    move-object/from16 v15, p5

    move/from16 p5, v2

    iget-object v2, v15, LS0/c;->r:Ljava/lang/Object;

    check-cast v2, LS0/d;

    move-object/from16 v16, v15

    .line 71
    iget-object v15, v2, LS0/d;->e:LO0/d;

    .line 72
    check-cast v15, LO0/e;

    invoke-virtual {v15, v6, v7, v11, v12}, LO0/e;->b(LO0/p;LO0/j;II)LO0/r;

    move-result-object v6

    .line 73
    instance-of v7, v6, LO0/r;

    if-nez v7, :cond_1a

    .line 74
    new-instance v7, LB0/G0;

    .line 75
    iget-object v11, v2, LS0/d;->j:LB0/G0;

    .line 76
    invoke-direct {v7, v6, v11}, LB0/G0;-><init>(LO0/r;LB0/G0;)V

    .line 77
    iput-object v7, v2, LS0/d;->j:LB0/G0;

    .line 78
    iget-object v2, v7, LB0/G0;->r:Ljava/lang/Object;

    invoke-static {v2, v13}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_d

    .line 79
    :cond_1a
    iget-object v2, v6, LO0/r;->q:Ljava/lang/Object;

    .line 80
    invoke-static {v2, v13}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    .line 81
    :goto_d
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_e
    if-eqz v8, :cond_1e

    .line 82
    sget-object v6, LR0/b;->s:LR0/b;

    .line 83
    sget-object v6, LR0/c;->a:LB0/G0;

    .line 84
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    move-result-object v7

    .line 86
    iget-object v11, v6, LB0/G0;->t:Ljava/lang/Object;

    check-cast v11, LO3/D;

    monitor-enter v11

    .line 87
    :try_start_0
    iget-object v12, v6, LB0/G0;->s:Ljava/lang/Object;

    check-cast v12, LR0/b;

    if-eqz v12, :cond_1b

    iget-object v13, v6, LB0/G0;->r:Ljava/lang/Object;

    check-cast v13, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v7, v13, :cond_1b

    monitor-exit v11

    goto :goto_10

    .line 88
    :cond_1b
    :try_start_1
    invoke-virtual {v7}, Landroid/os/LocaleList;->size()I

    move-result v12

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v15, 0x0

    :goto_f
    if-ge v15, v12, :cond_1c

    .line 89
    new-instance v2, LR0/a;

    move/from16 v18, v12

    invoke-virtual {v7, v15}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v12

    invoke-direct {v2, v12}, LR0/a;-><init>(Ljava/util/Locale;)V

    .line 90
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move/from16 v12, v18

    goto :goto_f

    :catchall_0
    move-exception v0

    goto :goto_12

    .line 91
    :cond_1c
    new-instance v12, LR0/b;

    invoke-direct {v12, v13}, LR0/b;-><init>(Ljava/util/List;)V

    .line 92
    iput-object v7, v6, LB0/G0;->r:Ljava/lang/Object;

    .line 93
    iput-object v12, v6, LB0/G0;->s:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    monitor-exit v11

    .line 95
    :goto_10
    invoke-virtual {v8, v12}, LR0/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v8, v6}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    iget-object v6, v8, LR0/b;->q:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 98
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 99
    check-cast v7, LR0/a;

    .line 100
    iget-object v7, v7, LR0/a;->a:Ljava/util/Locale;

    .line 101
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1d
    const/4 v15, 0x0

    .line 102
    new-array v6, v15, [Ljava/util/Locale;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 103
    check-cast v2, [Ljava/util/Locale;

    array-length v6, v2

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/util/Locale;

    new-instance v6, Landroid/os/LocaleList;

    invoke-direct {v6, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 104
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    goto :goto_13

    .line 105
    :goto_12
    monitor-exit v11

    throw v0

    :cond_1e
    :goto_13
    if-eqz v5, :cond_1f

    .line 106
    const-string v2, ""

    .line 107
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    .line 108
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1f
    if-eqz v14, :cond_20

    .line 109
    sget-object v2, LV0/q;->c:LV0/q;

    .line 110
    invoke-virtual {v14, v2}, LV0/q;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    .line 111
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    .line 112
    iget v5, v14, LV0/q;->a:F

    mul-float/2addr v2, v5

    .line 113
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 114
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v2

    .line 115
    iget v5, v14, LV0/q;->b:F

    add-float/2addr v2, v5

    .line 116
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 117
    :cond_20
    invoke-interface/range {p2 .. p2}, LV0/p;->a()J

    move-result-wide v5

    .line 118
    invoke-virtual {v4, v5, v6}, LS0/e;->d(J)V

    .line 119
    invoke-interface/range {p2 .. p2}, LV0/p;->b()Lj0/B;

    move-result-object v2

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 120
    invoke-interface/range {p2 .. p2}, LV0/p;->c()F

    move-result v7

    .line 121
    invoke-virtual {v4, v2, v5, v6, v7}, LS0/e;->c(Lj0/B;JF)V

    .line 122
    iget-object v2, v0, LL0/y;->n:Lj0/D;

    .line 123
    invoke-virtual {v4, v2}, LS0/e;->f(Lj0/D;)V

    .line 124
    iget-object v2, v0, LL0/y;->m:LV0/l;

    .line 125
    invoke-virtual {v4, v2}, LS0/e;->g(LV0/l;)V

    .line 126
    iget-object v2, v0, LL0/y;->o:Ll0/c;

    .line 127
    invoke-virtual {v4, v2}, LS0/e;->e(Ll0/c;)V

    .line 128
    invoke-static {v9, v10}, LW0/n;->b(J)J

    move-result-wide v5

    const-wide v7, 0x100000000L

    invoke-static {v5, v6, v7, v8}, LW0/o;->a(JJ)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_23

    invoke-static {v9, v10}, LW0/n;->c(J)F

    move-result v2

    cmpg-float v2, v2, v5

    if-nez v2, :cond_21

    goto :goto_14

    .line 129
    :cond_21
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v6

    mul-float/2addr v6, v2

    .line 130
    invoke-interface {v3, v9, v10}, LW0/c;->T(J)F

    move-result v2

    cmpg-float v3, v6, v5

    if-nez v3, :cond_22

    goto :goto_15

    :cond_22
    div-float/2addr v2, v6

    .line 131
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_15

    .line 132
    :cond_23
    :goto_14
    invoke-static {v9, v10}, LW0/n;->b(J)J

    move-result-wide v2

    const-wide v11, 0x200000000L

    invoke-static {v2, v3, v11, v12}, LW0/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_24

    .line 133
    invoke-static {v9, v10}, LW0/n;->c(J)F

    move-result v2

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 134
    :cond_24
    :goto_15
    iget-wide v2, v0, LL0/y;->l:J

    .line 135
    iget-object v0, v0, LL0/y;->i:LV0/a;

    if-eqz p5, :cond_26

    .line 136
    invoke-static {v9, v10}, LW0/n;->b(J)J

    move-result-wide v6

    const-wide v11, 0x100000000L

    invoke-static {v6, v7, v11, v12}, LW0/o;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-static {v9, v10}, LW0/n;->c(J)F

    move-result v4

    cmpg-float v4, v4, v5

    if-nez v4, :cond_25

    goto :goto_16

    :cond_25
    move/from16 v4, p4

    goto :goto_17

    :cond_26
    :goto_16
    const/4 v4, 0x0

    .line 137
    :goto_17
    sget-wide v6, Lj0/o;->g:J

    .line 138
    invoke-static {v2, v3, v6, v7}, Lj0/o;->c(JJ)Z

    move-result v8

    if-nez v8, :cond_27

    .line 139
    sget-wide v11, Lj0/o;->f:J

    .line 140
    invoke-static {v2, v3, v11, v12}, Lj0/o;->c(JJ)Z

    move-result v8

    if-nez v8, :cond_27

    move/from16 v8, p4

    goto :goto_18

    :cond_27
    const/4 v8, 0x0

    :goto_18
    if-eqz v0, :cond_29

    .line 141
    iget v11, v0, LV0/a;->a:F

    .line 142
    invoke-static {v11, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-nez v11, :cond_28

    goto :goto_19

    :cond_28
    move/from16 v11, p4

    goto :goto_1a

    :cond_29
    :goto_19
    const/4 v11, 0x0

    :goto_1a
    if-nez v4, :cond_2a

    if-nez v8, :cond_2a

    if-nez v11, :cond_2a

    move-object/from16 v0, p1

    goto :goto_1f

    :cond_2a
    if-eqz v4, :cond_2b

    :goto_1b
    move-wide/from16 v28, v9

    goto :goto_1c

    .line 143
    :cond_2b
    sget-wide v9, LW0/n;->c:J

    goto :goto_1b

    :goto_1c
    if-eqz v8, :cond_2c

    move-wide/from16 v33, v2

    goto :goto_1d

    :cond_2c
    move-wide/from16 v33, v6

    :goto_1d
    if-eqz v11, :cond_2d

    move-object/from16 v30, v0

    goto :goto_1e

    :cond_2d
    move-object/from16 v30, p1

    .line 144
    :goto_1e
    new-instance v18, LL0/y;

    const/16 v36, 0x0

    const v37, 0xf67f

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v18 .. v37}, LL0/y;-><init>(JJLO0/j;LO0/h;LO0/i;LO0/p;Ljava/lang/String;JLV0/a;LV0/q;LR0/b;JLV0/l;Lj0/D;I)V

    move-object/from16 v0, v18

    :goto_1f
    if-eqz v0, :cond_2f

    .line 145
    iget-object v2, v1, LS0/d;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_20
    if-ge v4, v2, :cond_30

    if-nez v4, :cond_2e

    .line 146
    new-instance v6, LL0/c;

    .line 147
    iget-object v7, v1, LS0/d;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v15, 0x0

    .line 148
    invoke-direct {v6, v15, v7, v0}, LL0/c;-><init>(IILjava/lang/Object;)V

    goto :goto_21

    .line 149
    :cond_2e
    iget-object v6, v1, LS0/d;->c:Ljava/util/List;

    add-int/lit8 v7, v4, -0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LL0/c;

    .line 150
    :goto_21
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    .line 151
    :cond_2f
    iget-object v3, v1, LS0/d;->c:Ljava/util/List;

    .line 152
    :cond_30
    iget-object v0, v1, LS0/d;->a:Ljava/lang/String;

    .line 153
    iget-object v2, v1, LS0/d;->g:LS0/e;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    .line 154
    iget-object v4, v1, LS0/d;->b:LL0/F;

    .line 155
    iget-object v6, v1, LS0/d;->d:Ljava/util/List;

    .line 156
    iget-object v10, v1, LS0/d;->f:LW0/c;

    .line 157
    iget-boolean v7, v1, LS0/d;->k:Z

    .line 158
    sget-object v8, LS0/b;->a:LS0/a;

    if-eqz v7, :cond_32

    .line 159
    invoke-static {}, LE1/l;->c()Z

    move-result v7

    if-eqz v7, :cond_32

    .line 160
    iget-object v7, v4, LL0/F;->c:LL0/t;

    if-eqz v7, :cond_31

    .line 161
    iget-object v7, v7, LL0/t;->a:LL0/s;

    .line 162
    :cond_31
    invoke-static {}, LE1/l;->a()LE1/l;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v15, 0x0

    invoke-virtual {v7, v15, v8, v15, v0}, LE1/l;->f(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    goto :goto_22

    :cond_32
    move-object v7, v0

    .line 163
    :goto_22
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v8

    const-wide/16 v11, 0x0

    const-wide v13, 0xff00000000L

    if-eqz v8, :cond_33

    .line 164
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_33

    .line 165
    iget-object v8, v4, LL0/F;->b:LL0/q;

    .line 166
    iget-object v8, v8, LL0/q;->d:LV0/r;

    .line 167
    sget-object v9, LV0/r;->c:LV0/r;

    .line 168
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_33

    .line 169
    iget-object v8, v4, LL0/F;->b:LL0/q;

    .line 170
    iget-wide v8, v8, LL0/q;->c:J

    and-long/2addr v8, v13

    cmp-long v8, v8, v11

    if-nez v8, :cond_33

    goto/16 :goto_4d

    .line 171
    :cond_33
    instance-of v8, v7, Landroid/text/Spannable;

    if-eqz v8, :cond_34

    .line 172
    check-cast v7, Landroid/text/Spannable;

    goto :goto_23

    .line 173
    :cond_34
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v7, v8

    .line 174
    :goto_23
    iget-object v8, v4, LL0/F;->a:LL0/y;

    iget-object v9, v4, LL0/F;->b:LL0/q;

    .line 175
    iget-object v8, v8, LL0/y;->m:LV0/l;

    move/from16 p2, v5

    .line 176
    sget-object v5, LV0/l;->c:LV0/l;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v8, 0x21

    if-eqz v5, :cond_35

    .line 177
    sget-object v5, LS0/b;->a:LS0/a;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v15, 0x0

    .line 178
    invoke-interface {v7, v5, v15, v0, v8}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 179
    :cond_35
    iget-object v0, v4, LL0/F;->c:LL0/t;

    if-eqz v0, :cond_36

    .line 180
    iget-object v0, v0, LL0/t;->a:LL0/s;

    if-eqz v0, :cond_36

    .line 181
    iget-boolean v0, v0, LL0/s;->a:Z

    goto :goto_24

    :cond_36
    const/4 v0, 0x0

    :goto_24
    if-eqz v0, :cond_38

    .line 182
    iget-object v0, v9, LL0/q;->f:LV0/i;

    if-nez v0, :cond_38

    move-wide/from16 p5, v11

    .line 183
    iget-wide v11, v9, LL0/q;->c:J

    .line 184
    invoke-static {v11, v12, v2, v10}, Lcom/google/android/gms/internal/measurement/P1;->Q(JFLW0/c;)F

    move-result v0

    .line 185
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_37

    .line 186
    new-instance v5, LN0/g;

    invoke-direct {v5, v0}, LN0/g;-><init>(F)V

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v15, 0x0

    .line 187
    invoke-interface {v7, v5, v15, v0, v8}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_37
    const/4 v15, 0x0

    goto :goto_2a

    :cond_38
    move-wide/from16 p5, v11

    .line 188
    iget-object v0, v9, LL0/q;->f:LV0/i;

    if-nez v0, :cond_39

    .line 189
    sget-object v0, LV0/i;->c:LV0/i;

    .line 190
    :cond_39
    iget-wide v11, v9, LL0/q;->c:J

    .line 191
    invoke-static {v11, v12, v2, v10}, Lcom/google/android/gms/internal/measurement/P1;->Q(JFLW0/c;)F

    move-result v19

    .line 192
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_37

    .line 193
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_3a

    goto :goto_25

    :cond_3a
    invoke-static {v7}, LJ5/m;->V0(Ljava/lang/CharSequence;)C

    move-result v5

    const/16 v11, 0xa

    if-ne v5, v11, :cond_3b

    :goto_25
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    :goto_26
    move/from16 v20, v5

    goto :goto_27

    :cond_3b
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v5

    goto :goto_26

    .line 194
    :goto_27
    new-instance v18, LN0/h;

    .line 195
    iget v5, v0, LV0/i;->b:I

    and-int/lit8 v11, v5, 0x1

    if-lez v11, :cond_3c

    move/from16 v21, p4

    goto :goto_28

    :cond_3c
    const/16 v21, 0x0

    :goto_28
    and-int/lit8 v5, v5, 0x10

    if-lez v5, :cond_3d

    move/from16 v22, p4

    goto :goto_29

    :cond_3d
    const/16 v22, 0x0

    .line 196
    :goto_29
    iget v0, v0, LV0/i;->a:F

    const/16 v24, 0x0

    move/from16 v23, v0

    .line 197
    invoke-direct/range {v18 .. v24}, LN0/h;-><init>(FIZZFZ)V

    move-object/from16 v0, v18

    .line 198
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v15, 0x0

    .line 199
    invoke-interface {v7, v0, v15, v5, v8}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 200
    :goto_2a
    iget-object v0, v9, LL0/q;->d:LV0/r;

    if-eqz v0, :cond_46

    .line 201
    iget-wide v11, v0, LV0/r;->a:J

    move-wide/from16 v18, v13

    iget-wide v13, v0, LV0/r;->b:J

    move-object v0, v9

    .line 202
    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    move-result-wide v8

    invoke-static {v11, v12, v8, v9}, LW0/n;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_3e

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    move-result-wide v8

    invoke-static {v13, v14, v8, v9}, LW0/n;->a(JJ)Z

    move-result v5

    if-nez v5, :cond_3f

    :cond_3e
    and-long v8, v11, v18

    cmp-long v5, v8, p5

    if-nez v5, :cond_40

    :cond_3f
    :goto_2b
    move-object/from16 p5, v0

    goto/16 :goto_2e

    :cond_40
    and-long v8, v13, v18

    cmp-long v5, v8, p5

    if-nez v5, :cond_41

    goto :goto_2b

    .line 203
    :cond_41
    invoke-static {v11, v12}, LW0/n;->b(J)J

    move-result-wide v8

    move-object/from16 p5, v0

    const-wide v0, 0x100000000L

    .line 204
    invoke-static {v8, v9, v0, v1}, LW0/o;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_42

    invoke-interface {v10, v11, v12}, LW0/c;->T(J)F

    move-result v5

    const-wide v0, 0x200000000L

    goto :goto_2c

    :cond_42
    const-wide v0, 0x200000000L

    .line 205
    invoke-static {v8, v9, v0, v1}, LW0/o;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_43

    invoke-static {v11, v12}, LW0/n;->c(J)F

    move-result v5

    mul-float/2addr v5, v2

    goto :goto_2c

    :cond_43
    move/from16 v5, p2

    .line 206
    :goto_2c
    invoke-static {v13, v14}, LW0/n;->b(J)J

    move-result-wide v8

    const-wide v11, 0x100000000L

    .line 207
    invoke-static {v8, v9, v11, v12}, LW0/o;->a(JJ)Z

    move-result v17

    if-eqz v17, :cond_44

    invoke-interface {v10, v13, v14}, LW0/c;->T(J)F

    move-result v2

    goto :goto_2d

    .line 208
    :cond_44
    invoke-static {v8, v9, v0, v1}, LW0/o;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_45

    invoke-static {v13, v14}, LW0/n;->c(J)F

    move-result v0

    mul-float/2addr v2, v0

    goto :goto_2d

    :cond_45
    move/from16 v2, p2

    .line 209
    :goto_2d
    new-instance v0, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v1, v8

    float-to-int v1, v1

    float-to-double v8, v2

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v2, v8

    float-to-int v2, v2

    invoke-direct {v0, v1, v2}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 210
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0x21

    const/4 v15, 0x0

    .line 211
    invoke-interface {v7, v0, v15, v1, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2e

    :cond_46
    move-object/from16 p5, v9

    .line 212
    :goto_2e
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 213
    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_2f
    if-ge v5, v2, :cond_4b

    .line 214
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 215
    check-cast v8, LL0/c;

    .line 216
    iget-object v9, v8, LL0/c;->a:Ljava/lang/Object;

    .line 217
    instance-of v11, v9, LL0/y;

    if-eqz v11, :cond_4a

    move-object v11, v9

    check-cast v11, LL0/y;

    .line 218
    iget-object v12, v11, LL0/y;->f:LO0/p;

    if-nez v12, :cond_48

    .line 219
    iget-object v12, v11, LL0/y;->d:LO0/h;

    if-nez v12, :cond_48

    .line 220
    iget-object v11, v11, LL0/y;->c:LO0/j;

    if-eqz v11, :cond_47

    goto :goto_30

    :cond_47
    const/4 v11, 0x0

    goto :goto_31

    :cond_48
    :goto_30
    move/from16 v11, p4

    :goto_31
    if-nez v11, :cond_49

    .line 221
    check-cast v9, LL0/y;

    .line 222
    iget-object v9, v9, LL0/y;->e:LO0/i;

    if-eqz v9, :cond_4a

    .line 223
    :cond_49
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4a
    add-int/lit8 v5, v5, 0x1

    goto :goto_2f

    .line 224
    :cond_4b
    iget-object v2, v4, LL0/F;->a:LL0/y;

    .line 225
    iget-object v4, v2, LL0/y;->f:LO0/p;

    if-nez v4, :cond_4d

    .line 226
    iget-object v5, v2, LL0/y;->d:LO0/h;

    if-nez v5, :cond_4d

    .line 227
    iget-object v5, v2, LL0/y;->c:LO0/j;

    if-eqz v5, :cond_4c

    goto :goto_32

    :cond_4c
    const/4 v5, 0x0

    goto :goto_33

    :cond_4d
    :goto_32
    move/from16 v5, p4

    :goto_33
    if-nez v5, :cond_4f

    .line 228
    iget-object v5, v2, LL0/y;->e:LO0/i;

    if-eqz v5, :cond_4e

    goto :goto_34

    :cond_4e
    move-object/from16 v2, p1

    goto :goto_35

    .line 229
    :cond_4f
    :goto_34
    iget-object v5, v2, LL0/y;->c:LO0/j;

    .line 230
    iget-object v8, v2, LL0/y;->d:LO0/h;

    .line 231
    iget-object v2, v2, LL0/y;->e:LO0/i;

    .line 232
    new-instance v18, LL0/y;

    const/16 v36, 0x0

    const v37, 0xffc3

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v25, v2

    move-object/from16 v26, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v8

    invoke-direct/range {v18 .. v37}, LL0/y;-><init>(JJLO0/j;LO0/h;LO0/i;LO0/p;Ljava/lang/String;JLV0/a;LV0/q;LR0/b;JLV0/l;Lj0/D;I)V

    move-object/from16 v2, v18

    .line 233
    :goto_35
    new-instance v4, LF/p;

    move/from16 v8, p4

    move-object/from16 v5, v16

    invoke-direct {v4, v8, v7, v5}, LF/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 234
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-gt v5, v8, :cond_52

    .line 235
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_51

    const/4 v15, 0x0

    .line 236
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LL0/c;

    .line 237
    iget-object v5, v5, LL0/c;->a:Ljava/lang/Object;

    .line 238
    check-cast v5, LL0/y;

    if-nez v2, :cond_50

    goto :goto_36

    .line 239
    :cond_50
    invoke-virtual {v2, v5}, LL0/y;->c(LL0/y;)LL0/y;

    move-result-object v5

    .line 240
    :goto_36
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL0/c;

    .line 241
    iget v2, v2, LL0/c;->b:I

    .line 242
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 243
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/c;

    .line 244
    iget v0, v0, LL0/c;->c:I

    .line 245
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 246
    invoke-virtual {v4, v5, v2, v0}, LF/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_51
    move-object/from16 v16, v1

    goto/16 :goto_3d

    .line 247
    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v8, v5, 0x2

    .line 248
    new-array v9, v8, [I

    .line 249
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_37
    if-ge v12, v11, :cond_53

    .line 250
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 251
    check-cast v13, LL0/c;

    .line 252
    iget v14, v13, LL0/c;->b:I

    .line 253
    aput v14, v9, v12

    add-int v14, v12, v5

    .line 254
    iget v13, v13, LL0/c;->c:I

    .line 255
    aput v13, v9, v14

    add-int/lit8 v12, v12, 0x1

    goto :goto_37

    :cond_53
    const/4 v12, 0x1

    if-le v8, v12, :cond_54

    .line 256
    invoke-static {v9}, Ljava/util/Arrays;->sort([I)V

    :cond_54
    if-eqz v8, :cond_77

    const/4 v15, 0x0

    .line 257
    aget v5, v9, v15

    const/4 v11, 0x0

    :goto_38
    if-ge v11, v8, :cond_51

    .line 258
    aget v12, v9, v11

    if-ne v12, v5, :cond_55

    move-object/from16 v17, v0

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    goto :goto_3c

    .line 259
    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v13

    move-object v15, v2

    const/4 v14, 0x0

    :goto_39
    if-ge v14, v13, :cond_58

    .line 260
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v0

    .line 261
    move-object/from16 v0, v16

    check-cast v0, LL0/c;

    move-object/from16 v16, v1

    .line 262
    iget v1, v0, LL0/c;->b:I

    move-object/from16 v18, v2

    .line 263
    iget v2, v0, LL0/c;->c:I

    if-eq v1, v2, :cond_57

    .line 264
    invoke-static {v5, v12, v1, v2}, LL0/e;->a(IIII)Z

    move-result v1

    if-eqz v1, :cond_57

    .line 265
    iget-object v0, v0, LL0/c;->a:Ljava/lang/Object;

    .line 266
    check-cast v0, LL0/y;

    if-nez v15, :cond_56

    :goto_3a
    move-object v15, v0

    goto :goto_3b

    .line 267
    :cond_56
    invoke-virtual {v15, v0}, LL0/y;->c(LL0/y;)LL0/y;

    move-result-object v0

    goto :goto_3a

    :cond_57
    :goto_3b
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v16

    move-object/from16 v0, v17

    move-object/from16 v2, v18

    goto :goto_39

    :cond_58
    move-object/from16 v17, v0

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    if-eqz v15, :cond_59

    .line 268
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v15, v0, v1}, LF/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    move v5, v12

    :goto_3c
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v16

    move-object/from16 v0, v17

    move-object/from16 v2, v18

    goto :goto_38

    .line 269
    :goto_3d
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3e
    if-ge v1, v0, :cond_6a

    .line 270
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL0/c;

    .line 271
    iget-object v5, v4, LL0/c;->a:Ljava/lang/Object;

    .line 272
    instance-of v8, v5, LL0/y;

    if-eqz v8, :cond_5a

    .line 273
    iget v11, v4, LL0/c;->b:I

    .line 274
    iget v12, v4, LL0/c;->c:I

    if-ltz v11, :cond_5a

    .line 275
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v11, v4, :cond_5a

    if-le v12, v11, :cond_5a

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v12, v4, :cond_5b

    :cond_5a
    move/from16 p6, v0

    move v4, v1

    move-object/from16 v17, v10

    move-object/from16 v0, p5

    move/from16 p5, v2

    goto/16 :goto_45

    .line 276
    :cond_5b
    check-cast v5, LL0/y;

    .line 277
    iget-object v4, v5, LL0/y;->i:LV0/a;

    iget-wide v13, v5, LL0/y;->h:J

    iget-object v8, v5, LL0/y;->a:LV0/p;

    if-eqz v4, :cond_5c

    .line 278
    iget v4, v4, LV0/a;->a:F

    .line 279
    new-instance v9, LN0/a;

    const/4 v15, 0x0

    invoke-direct {v9, v15, v4}, LN0/a;-><init>(IF)V

    const/16 v4, 0x21

    .line 280
    invoke-interface {v7, v9, v11, v12, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_5c
    move/from16 p6, v0

    move v4, v1

    .line 281
    invoke-interface {v8}, LV0/p;->a()J

    move-result-wide v0

    .line 282
    invoke-static {v7, v0, v1, v11, v12}, Lcom/google/android/gms/internal/measurement/P1;->R(Landroid/text/Spannable;JII)V

    .line 283
    invoke-interface {v8}, LV0/p;->b()Lj0/B;

    move-result-object v0

    .line 284
    invoke-interface {v8}, LV0/p;->c()F

    move-result v1

    if-eqz v0, :cond_5e

    .line 285
    instance-of v8, v0, Lj0/G;

    if-eqz v8, :cond_5d

    .line 286
    check-cast v0, Lj0/G;

    .line 287
    iget-wide v0, v0, Lj0/G;->e:J

    .line 288
    invoke-static {v7, v0, v1, v11, v12}, Lcom/google/android/gms/internal/measurement/P1;->R(Landroid/text/Spannable;JII)V

    goto :goto_3f

    .line 289
    :cond_5d
    new-instance v8, LU0/b;

    check-cast v0, Lj0/l;

    invoke-direct {v8, v0, v1}, LU0/b;-><init>(Lj0/l;F)V

    const/16 v0, 0x21

    .line 290
    invoke-interface {v7, v8, v11, v12, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 291
    :cond_5e
    :goto_3f
    iget-object v0, v5, LL0/y;->m:LV0/l;

    if-eqz v0, :cond_61

    .line 292
    iget v0, v0, LV0/l;->a:I

    .line 293
    new-instance v1, LN0/k;

    or-int/lit8 v8, v0, 0x1

    if-ne v8, v0, :cond_5f

    const/4 v8, 0x1

    goto :goto_40

    :cond_5f
    const/4 v8, 0x0

    :goto_40
    or-int/lit8 v9, v0, 0x2

    if-ne v9, v0, :cond_60

    const/4 v0, 0x1

    goto :goto_41

    :cond_60
    const/4 v0, 0x0

    :goto_41
    invoke-direct {v1, v8, v0}, LN0/k;-><init>(ZZ)V

    const/16 v0, 0x21

    .line 294
    invoke-interface {v7, v1, v11, v12, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_42

    :cond_61
    const/16 v0, 0x21

    .line 295
    :goto_42
    iget-wide v8, v5, LL0/y;->b:J

    move v1, v0

    move-object/from16 v0, p5

    .line 296
    invoke-static/range {v7 .. v12}, Lcom/google/android/gms/internal/measurement/P1;->T(Landroid/text/Spannable;JLW0/c;II)V

    .line 297
    iget-object v8, v5, LL0/y;->g:Ljava/lang/String;

    if-eqz v8, :cond_62

    .line 298
    new-instance v9, LN0/b;

    const/4 v15, 0x0

    invoke-direct {v9, v15, v8}, LN0/b;-><init>(ILjava/lang/Object;)V

    .line 299
    invoke-interface {v7, v9, v11, v12, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 300
    :cond_62
    iget-object v8, v5, LL0/y;->j:LV0/q;

    if-eqz v8, :cond_63

    .line 301
    new-instance v9, Landroid/text/style/ScaleXSpan;

    .line 302
    iget v15, v8, LV0/q;->a:F

    .line 303
    invoke-direct {v9, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 304
    invoke-interface {v7, v9, v11, v12, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 305
    new-instance v9, LN0/a;

    .line 306
    iget v8, v8, LV0/q;->b:F

    const/4 v15, 0x1

    .line 307
    invoke-direct {v9, v15, v8}, LN0/a;-><init>(IF)V

    .line 308
    invoke-interface {v7, v9, v11, v12, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_43

    :cond_63
    const/4 v15, 0x1

    .line 309
    :goto_43
    iget-object v8, v5, LL0/y;->k:LR0/b;

    .line 310
    invoke-static {v7, v8, v11, v12}, Lcom/google/android/gms/internal/measurement/P1;->W(Landroid/text/Spannable;LR0/b;II)V

    .line 311
    iget-wide v8, v5, LL0/y;->l:J

    const-wide/16 v18, 0x10

    cmp-long v17, v8, v18

    if-eqz v17, :cond_64

    .line 312
    new-instance v15, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v8, v9}, Lj0/B;->v(J)I

    move-result v8

    invoke-direct {v15, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 313
    invoke-interface {v7, v15, v11, v12, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 314
    :cond_64
    iget-object v8, v5, LL0/y;->n:Lj0/D;

    if-eqz v8, :cond_66

    move/from16 p5, v2

    .line 315
    iget-wide v1, v8, Lj0/D;->b:J

    .line 316
    new-instance v15, LN0/j;

    move-object/from16 v17, v10

    .line 317
    iget-wide v9, v8, Lj0/D;->a:J

    .line 318
    invoke-static {v9, v10}, Lj0/B;->v(J)I

    move-result v9

    const/16 v10, 0x20

    move-wide/from16 v19, v1

    shr-long v1, v19, v10

    long-to-int v1, v1

    .line 319
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v21, 0xffffffffL

    move-wide/from16 v23, v13

    and-long v13, v19, v21

    long-to-int v2, v13

    .line 320
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 321
    iget v8, v8, Lj0/D;->c:F

    cmpg-float v10, v8, p2

    if-nez v10, :cond_65

    const/4 v8, 0x1

    .line 322
    :cond_65
    invoke-direct {v15, v9, v1, v2, v8}, LN0/j;-><init>(IFFF)V

    const/16 v9, 0x21

    .line 323
    invoke-interface {v7, v15, v11, v12, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_44

    :cond_66
    move v9, v1

    move/from16 p5, v2

    move-object/from16 v17, v10

    move-wide/from16 v23, v13

    .line 324
    :goto_44
    iget-object v1, v5, LL0/y;->o:Ll0/c;

    if-eqz v1, :cond_67

    .line 325
    new-instance v2, LU0/a;

    invoke-direct {v2, v1}, LU0/a;-><init>(Ll0/c;)V

    .line 326
    invoke-interface {v7, v2, v11, v12, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 327
    :cond_67
    invoke-static/range {v23 .. v24}, LW0/n;->b(J)J

    move-result-wide v1

    const-wide v11, 0x100000000L

    invoke-static {v1, v2, v11, v12}, LW0/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_68

    invoke-static/range {v23 .. v24}, LW0/n;->b(J)J

    move-result-wide v1

    const-wide v11, 0x200000000L

    invoke-static {v1, v2, v11, v12}, LW0/o;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_69

    :cond_68
    const/4 v2, 0x1

    goto :goto_46

    :cond_69
    :goto_45
    move/from16 v2, p5

    :goto_46
    add-int/lit8 v1, v4, 0x1

    move-object/from16 p5, v0

    move-object/from16 v10, v17

    move/from16 v0, p6

    goto/16 :goto_3e

    :cond_6a
    move-object/from16 v0, p5

    move/from16 p5, v2

    move-object/from16 v17, v10

    if-eqz p5, :cond_70

    .line 328
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_47
    if-ge v2, v1, :cond_70

    .line 329
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL0/c;

    .line 330
    iget-object v5, v4, LL0/c;->a:Ljava/lang/Object;

    .line 331
    check-cast v5, LL0/b;

    .line 332
    instance-of v8, v5, LL0/y;

    if-eqz v8, :cond_6b

    .line 333
    iget v8, v4, LL0/c;->b:I

    .line 334
    iget v4, v4, LL0/c;->c:I

    if-ltz v8, :cond_6b

    .line 335
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-ge v8, v10, :cond_6b

    if-le v4, v8, :cond_6b

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-le v4, v10, :cond_6c

    :cond_6b
    move-object/from16 v14, v17

    const/16 v9, 0x21

    goto :goto_49

    .line 336
    :cond_6c
    check-cast v5, LL0/y;

    .line 337
    iget-wide v10, v5, LL0/y;->h:J

    .line 338
    invoke-static {v10, v11}, LW0/n;->b(J)J

    move-result-wide v12

    const-wide v14, 0x100000000L

    .line 339
    invoke-static {v12, v13, v14, v15}, LW0/o;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_6d

    new-instance v5, LN0/f;

    move-object/from16 v14, v17

    invoke-interface {v14, v10, v11}, LW0/c;->T(J)F

    move-result v10

    invoke-direct {v5, v10}, LN0/f;-><init>(F)V

    goto :goto_48

    :cond_6d
    move-wide/from16 v19, v10

    move-object/from16 v14, v17

    const-wide v9, 0x200000000L

    .line 340
    invoke-static {v12, v13, v9, v10}, LW0/o;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_6e

    .line 341
    new-instance v5, LN0/e;

    invoke-static/range {v19 .. v20}, LW0/n;->c(J)F

    move-result v9

    invoke-direct {v5, v9}, LN0/e;-><init>(F)V

    goto :goto_48

    :cond_6e
    move-object/from16 v5, p1

    :goto_48
    const/16 v9, 0x21

    if-eqz v5, :cond_6f

    .line 342
    invoke-interface {v7, v5, v8, v4, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6f
    :goto_49
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v17, v14

    goto :goto_47

    :cond_70
    move-object/from16 v14, v17

    .line 343
    iget-object v0, v0, LL0/q;->d:LV0/r;

    if-eqz v0, :cond_72

    .line 344
    iget-wide v0, v0, LV0/r;->a:J

    .line 345
    invoke-static {v0, v1}, LW0/n;->b(J)J

    move-result-wide v4

    const-wide v11, 0x100000000L

    .line 346
    invoke-static {v4, v5, v11, v12}, LW0/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_71

    invoke-interface {v14, v0, v1}, LW0/c;->T(J)F

    goto :goto_4a

    :cond_71
    const-wide v11, 0x200000000L

    .line 347
    invoke-static {v4, v5, v11, v12}, LW0/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_72

    invoke-static {v0, v1}, LW0/n;->c(J)F

    .line 348
    :cond_72
    :goto_4a
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4b
    if-ge v1, v0, :cond_73

    .line 349
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 350
    check-cast v2, LL0/c;

    .line 351
    iget-object v2, v2, LL0/c;->a:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4b

    .line 352
    :cond_73
    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_76

    const/4 v15, 0x0

    .line 353
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 354
    check-cast v0, LL0/c;

    .line 355
    iget-object v1, v0, LL0/c;->a:Ljava/lang/Object;

    if-nez v1, :cond_75

    .line 356
    iget v1, v0, LL0/c;->b:I

    .line 357
    iget v0, v0, LL0/c;->c:I

    .line 358
    const-class v2, LE1/B;

    invoke-interface {v7, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 359
    array-length v1, v0

    move v11, v15

    :goto_4c
    if-ge v11, v1, :cond_74

    aget-object v2, v0, v11

    check-cast v2, LE1/B;

    .line 360
    invoke-interface {v7, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4c

    .line 361
    :cond_74
    new-instance v0, LN0/i;

    .line 362
    throw p1

    .line 363
    :cond_75
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_76
    move-object/from16 v1, p0

    .line 364
    :goto_4d
    iput-object v7, v1, LS0/d;->h:Ljava/lang/CharSequence;

    .line 365
    new-instance v0, LM0/e;

    iget-object v2, v1, LS0/d;->g:LS0/e;

    iget v3, v1, LS0/d;->l:I

    invoke-direct {v0, v7, v2, v3}, LM0/e;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v0, v1, LS0/d;->i:LM0/e;

    return-void

    :cond_77
    move-object/from16 v1, p0

    .line 366
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_78
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 368
    const-string v2, "Invalid TextDirection."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, LS0/d;->j:LB0/G0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LB0/G0;->K()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, LS0/d;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, LS0/d;->b:LL0/F;

    .line 19
    .line 20
    iget-object v0, v0, LL0/F;->c:LL0/t;

    .line 21
    .line 22
    sget-object v0, LS0/i;->a:Lk3/c;

    .line 23
    .line 24
    sget-object v0, LS0/i;->a:Lk3/c;

    .line 25
    .line 26
    iget-object v2, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LP/S0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {}, LE1/l;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Lk3/c;->m()LP/S0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v2, LS0/j;->a:LS0/k;

    .line 47
    .line 48
    :goto_1
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    return v1

    .line 62
    :cond_4
    :goto_2
    const/4 v0, 0x1

    .line 63
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LS0/d;->i:LM0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LM0/e;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()F
    .locals 10

    .line 1
    iget-object v0, p0, LS0/d;->i:LM0/e;

    .line 2
    .line 3
    iget v1, v0, LM0/e;->e:F

    .line 4
    .line 5
    iget-object v2, v0, LM0/e;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget v0, v0, LM0/e;->e:F

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, LM0/b;

    .line 25
    .line 26
    iget-object v4, v0, LM0/e;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v3, v4, v5}, LM0/b;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    new-instance v4, LB0/C;

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    invoke-direct {v4, v5}, LB0/C;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const/16 v5, 0xa

    .line 47
    .line 48
    invoke-direct {v3, v5, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v6, 0x0

    .line 56
    :goto_0
    const/4 v7, -0x1

    .line 57
    if-eq v4, v7, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-ge v7, v5, :cond_1

    .line 64
    .line 65
    new-instance v7, Lm5/j;

    .line 66
    .line 67
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-direct {v7, v6, v8}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Lm5/j;

    .line 87
    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    iget-object v8, v7, Lm5/j;->r:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    iget-object v7, v7, Lm5/j;->q:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    sub-int/2addr v8, v7

    .line 107
    sub-int v7, v4, v6

    .line 108
    .line 109
    if-ge v8, v7, :cond_2

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    new-instance v7, Lm5/j;

    .line 115
    .line 116
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-direct {v7, v6, v8}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    move v9, v6

    .line 135
    move v6, v4

    .line 136
    move v4, v9

    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_4

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    goto :goto_3

    .line 146
    :cond_4
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_6

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lm5/j;

    .line 161
    .line 162
    iget-object v4, v3, Lm5/j;->q:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    iget-object v3, v3, Lm5/j;->r:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v3, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-virtual {v0}, LM0/e;->b()Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-static {v5, v4, v3, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_5

    .line 191
    .line 192
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    check-cast v4, Lm5/j;

    .line 197
    .line 198
    iget-object v5, v4, Lm5/j;->q:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v5, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iget-object v4, v4, Lm5/j;->r:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v4, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    invoke-virtual {v0}, LM0/e;->b()Ljava/lang/CharSequence;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v6, v5, v4, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    goto :goto_2

    .line 227
    :cond_5
    move v1, v3

    .line 228
    :goto_3
    iput v1, v0, LM0/e;->e:F

    .line 229
    .line 230
    return v1

    .line 231
    :cond_6
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 234
    .line 235
    .line 236
    throw v0
.end method
