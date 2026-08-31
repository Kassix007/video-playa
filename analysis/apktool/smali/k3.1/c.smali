.class public final Lk3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/h;
.implements Lj0/p;
.implements LO3/X1;
.implements LO3/Z;
.implements LR4/W1;
.implements Ld2/f0;


# instance fields
.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 9

    sparse-switch p1, :sswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v1, Lu/A0;->a:LZ/m;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 4
    new-instance v0, Lu/l;

    .line 5
    new-instance v3, Lu/m;

    invoke-direct {v3, p1}, Lu/m;-><init>(F)V

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    .line 6
    invoke-direct/range {v0 .. v8}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;JJZ)V

    .line 7
    iput-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 9
    const-string v0, "timeUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance p1, LO3/Y;

    .line 11
    sget-object v0, Lg6/d;->i:Lg6/d;

    .line 12
    invoke-direct {p1, v0}, LO3/Y;-><init>(Lg6/d;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lk3/c;->q:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 17
    iput-object p1, p0, Lk3/c;->q:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 20
    new-instance p1, Ls4/e;

    const/16 v0, 0xb

    .line 21
    invoke-direct {p1, v0}, Ls4/e;-><init>(I)V

    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Lx3/k;

    const/16 v0, 0xb

    .line 23
    invoke-direct {p1, v0}, Lx3/k;-><init>(I)V

    .line 24
    :goto_0
    iput-object p1, p0, Lk3/c;->q:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_2
        0x16 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk3/c;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Lk3/b;Z)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p1, p1, Lk3/b;->q:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string p2, ".temp"

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    const-string p2, "\\W+"

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-virtual {p0, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    rsub-int p2, p2, 0xf2

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-le v0, p2, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    :try_start_0
    const-string v1, "MD5"

    .line 33
    .line 34
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 35
    .line 36
    .line 37
    move-result-object p2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p2, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    :goto_0
    array-length v1, p0

    .line 52
    if-ge v0, v1, :cond_1

    .line 53
    .line 54
    aget-byte v1, p0, v0

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "%02x"

    .line 65
    .line 66
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_1

    .line 81
    :catch_0
    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :cond_2
    :goto_1
    const-string p2, "lottie_cache_"

    .line 86
    .line 87
    invoke-static {p2, p0, p1}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static v(Ljava/lang/String;)Lk3/c;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, LO3/J0;->e(C)LO3/G0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    sget-object p0, LO3/G0;->r:LO3/G0;

    .line 26
    .line 27
    :goto_1
    new-instance v0, Lk3/c;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public a(LB2/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB2/g;

    .line 4
    .line 5
    invoke-static {p2}, La/a;->y(Landroid/graphics/Bitmap;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, p1, p2, p3, v1}, LB2/g;->c(LB2/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LM/u0;

    .line 4
    .line 5
    iget-wide v0, v0, LM/u0;->c:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq6/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq6/j;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    return-wide v0
.end method

.method public synthetic e(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LO3/T1;

    .line 5
    .line 6
    move-object v2, p1

    .line 7
    move v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-virtual/range {v1 .. v6}, LO3/T1;->z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/G;

    .line 4
    .line 5
    iget v1, v0, Ld2/G;->o:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ld2/G;->D()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr v1, v0

    .line 12
    return v1
.end method

.method public g(LB2/a;)LB2/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public h(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ld2/H;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ld2/H;

    .line 16
    .line 17
    iget-object p1, p1, Ld2/H;->b:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    sub-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 23
    .line 24
    sub-int/2addr v1, p1

    .line 25
    return v1
.end method

.method public i(LU2/g;LP2/a;LV2/h;LV2/g;)LP2/b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, LU2/g;->h:LU2/b;

    .line 8
    .line 9
    iget-object v4, v0, LU2/g;->p:LV2/d;

    .line 10
    .line 11
    iget-boolean v3, v3, LU2/b;->q:Z

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move-object/from16 v3, p0

    .line 16
    .line 17
    const/16 v16, 0x0

    .line 18
    .line 19
    goto/16 :goto_17

    .line 20
    .line 21
    :cond_0
    move-object/from16 v3, p0

    .line 22
    .line 23
    iget-object v6, v3, Lk3/c;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, LI2/y;

    .line 26
    .line 27
    iget-object v6, v6, LI2/y;->a:LI2/t;

    .line 28
    .line 29
    iget-object v6, v6, LI2/t;->c:Lm5/o;

    .line 30
    .line 31
    invoke-virtual {v6}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, LP2/c;

    .line 36
    .line 37
    if-eqz v6, :cond_8

    .line 38
    .line 39
    iget-object v7, v6, LP2/c;->c:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v7

    .line 42
    :try_start_0
    iget-object v8, v6, LP2/c;->a:LP2/f;

    .line 43
    .line 44
    invoke-interface {v8, v1}, LP2/f;->i(LP2/a;)LP2/b;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const/4 v9, 0x0

    .line 49
    if-nez v8, :cond_5

    .line 50
    .line 51
    iget-object v8, v6, LP2/c;->b:LB2/g;

    .line 52
    .line 53
    iget-object v10, v8, LB2/g;->a:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/4 v11, 0x0

    .line 62
    if-nez v10, :cond_1

    .line 63
    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    :goto_0
    move-object v8, v11

    .line 67
    goto :goto_4

    .line 68
    :cond_1
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    move v13, v9

    .line 73
    :goto_1
    if-ge v13, v12, :cond_4

    .line 74
    .line 75
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    check-cast v14, LP2/e;

    .line 80
    .line 81
    iget-object v15, v14, LP2/e;->a:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    check-cast v15, LI2/n;

    .line 88
    .line 89
    if-eqz v15, :cond_2

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    new-instance v5, LP2/b;

    .line 94
    .line 95
    iget-object v14, v14, LP2/e;->b:Ljava/util/Map;

    .line 96
    .line 97
    invoke-direct {v5, v15, v14}, LP2/b;-><init>(LI2/n;Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const/16 v16, 0x0

    .line 102
    .line 103
    move-object v5, v11

    .line 104
    :goto_2
    if-eqz v5, :cond_3

    .line 105
    .line 106
    move-object v11, v5

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const/16 v16, 0x0

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v8}, LB2/g;->b()V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    goto :goto_6

    .line 119
    :cond_5
    const/16 v16, 0x0

    .line 120
    .line 121
    :goto_4
    if-eqz v8, :cond_7

    .line 122
    .line 123
    iget-object v5, v8, LP2/b;->a:LI2/n;

    .line 124
    .line 125
    invoke-interface {v5}, LI2/n;->d()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_7

    .line 130
    .line 131
    iget-object v5, v6, LP2/c;->c:Ljava/lang/Object;

    .line 132
    .line 133
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    :try_start_1
    iget-object v10, v6, LP2/c;->a:LP2/f;

    .line 135
    .line 136
    invoke-interface {v10, v1}, LP2/f;->e(LP2/a;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    iget-object v6, v6, LP2/c;->b:LB2/g;

    .line 141
    .line 142
    iget-object v6, v6, LB2/g;->a:Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    invoke-virtual {v6, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    if-eqz v6, :cond_6

    .line 149
    .line 150
    const/4 v9, 0x1

    .line 151
    :cond_6
    :try_start_2
    monitor-exit v5

    .line 152
    goto :goto_5

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    monitor-exit v5

    .line 155
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    :cond_7
    :goto_5
    monitor-exit v7

    .line 157
    goto :goto_7

    .line 158
    :goto_6
    monitor-exit v7

    .line 159
    throw v0

    .line 160
    :cond_8
    const/16 v16, 0x0

    .line 161
    .line 162
    move-object/from16 v8, v16

    .line 163
    .line 164
    :goto_7
    if-eqz v8, :cond_22

    .line 165
    .line 166
    iget-object v5, v8, LP2/b;->a:LI2/n;

    .line 167
    .line 168
    instance-of v6, v5, LI2/a;

    .line 169
    .line 170
    if-eqz v6, :cond_9

    .line 171
    .line 172
    move-object v6, v5

    .line 173
    check-cast v6, LI2/a;

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_9
    move-object/from16 v6, v16

    .line 177
    .line 178
    :goto_8
    if-nez v6, :cond_a

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_a
    iget-object v6, v6, LI2/a;->a:Landroid/graphics/Bitmap;

    .line 182
    .line 183
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    if-nez v6, :cond_b

    .line 188
    .line 189
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 190
    .line 191
    :cond_b
    invoke-static {v6}, Ll6/d;->v(Landroid/graphics/Bitmap$Config;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_c

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_c
    sget-object v6, LU2/i;->e:LI2/l;

    .line 199
    .line 200
    invoke-static {v0, v6}, LI2/q;->d(LU2/g;LI2/l;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    check-cast v6, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-nez v6, :cond_f

    .line 211
    .line 212
    :cond_d
    move-object v2, v8

    .line 213
    :cond_e
    const/4 v7, 0x0

    .line 214
    goto/16 :goto_16

    .line 215
    .line 216
    :cond_f
    :goto_9
    iget-object v1, v1, LP2/a;->b:Ljava/util/Map;

    .line 217
    .line 218
    const-string v6, "coil#size"

    .line 219
    .line 220
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/String;

    .line 225
    .line 226
    const/4 v6, 0x1

    .line 227
    if-eqz v1, :cond_11

    .line 228
    .line 229
    invoke-virtual {v2}, LV2/h;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_d

    .line 238
    .line 239
    :cond_10
    :goto_a
    move-object v2, v8

    .line 240
    goto/16 :goto_15

    .line 241
    .line 242
    :cond_11
    iget-object v1, v8, LP2/b;->b:Ljava/util/Map;

    .line 243
    .line 244
    const-string v9, "coil#is_sampled"

    .line 245
    .line 246
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    instance-of v9, v1, Ljava/lang/Boolean;

    .line 251
    .line 252
    if-eqz v9, :cond_12

    .line 253
    .line 254
    check-cast v1, Ljava/lang/Boolean;

    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_12
    move-object/from16 v1, v16

    .line 258
    .line 259
    :goto_b
    if-eqz v1, :cond_13

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    goto :goto_c

    .line 266
    :cond_13
    const/4 v1, 0x0

    .line 267
    :goto_c
    if-nez v1, :cond_14

    .line 268
    .line 269
    sget-object v1, LV2/h;->c:LV2/h;

    .line 270
    .line 271
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-nez v1, :cond_10

    .line 276
    .line 277
    sget-object v1, LV2/d;->r:LV2/d;

    .line 278
    .line 279
    if-ne v4, v1, :cond_14

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_14
    invoke-interface {v5}, LI2/n;->b()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-interface {v5}, LI2/n;->a()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    instance-of v5, v5, LI2/a;

    .line 291
    .line 292
    if-eqz v5, :cond_15

    .line 293
    .line 294
    sget-object v5, LU2/h;->b:LI2/l;

    .line 295
    .line 296
    invoke-static {v0, v5}, LI2/q;->d(LU2/g;LI2/l;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, LV2/h;

    .line 301
    .line 302
    goto :goto_d

    .line 303
    :cond_15
    sget-object v0, LV2/h;->c:LV2/h;

    .line 304
    .line 305
    :goto_d
    iget-object v5, v2, LV2/h;->a:LV2/c;

    .line 306
    .line 307
    instance-of v10, v5, LV2/a;

    .line 308
    .line 309
    const v11, 0x7fffffff

    .line 310
    .line 311
    .line 312
    if-eqz v10, :cond_16

    .line 313
    .line 314
    check-cast v5, LV2/a;

    .line 315
    .line 316
    iget v5, v5, LV2/a;->a:I

    .line 317
    .line 318
    goto :goto_e

    .line 319
    :cond_16
    move v5, v11

    .line 320
    :goto_e
    iget-object v10, v0, LV2/h;->a:LV2/c;

    .line 321
    .line 322
    instance-of v12, v10, LV2/a;

    .line 323
    .line 324
    if-eqz v12, :cond_17

    .line 325
    .line 326
    check-cast v10, LV2/a;

    .line 327
    .line 328
    iget v10, v10, LV2/a;->a:I

    .line 329
    .line 330
    goto :goto_f

    .line 331
    :cond_17
    move v10, v11

    .line 332
    :goto_f
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    iget-object v2, v2, LV2/h;->b:LV2/c;

    .line 337
    .line 338
    instance-of v10, v2, LV2/a;

    .line 339
    .line 340
    if-eqz v10, :cond_18

    .line 341
    .line 342
    check-cast v2, LV2/a;

    .line 343
    .line 344
    iget v2, v2, LV2/a;->a:I

    .line 345
    .line 346
    goto :goto_10

    .line 347
    :cond_18
    move v2, v11

    .line 348
    :goto_10
    iget-object v0, v0, LV2/h;->b:LV2/c;

    .line 349
    .line 350
    instance-of v10, v0, LV2/a;

    .line 351
    .line 352
    if-eqz v10, :cond_19

    .line 353
    .line 354
    check-cast v0, LV2/a;

    .line 355
    .line 356
    iget v0, v0, LV2/a;->a:I

    .line 357
    .line 358
    goto :goto_11

    .line 359
    :cond_19
    move v0, v11

    .line 360
    :goto_11
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    int-to-double v12, v5

    .line 365
    int-to-double v14, v1

    .line 366
    div-double/2addr v12, v14

    .line 367
    int-to-double v14, v0

    .line 368
    move-object v2, v8

    .line 369
    int-to-double v7, v9

    .line 370
    div-double/2addr v14, v7

    .line 371
    if-eq v5, v11, :cond_1a

    .line 372
    .line 373
    if-eq v0, v11, :cond_1a

    .line 374
    .line 375
    move-object/from16 v7, p4

    .line 376
    .line 377
    goto :goto_12

    .line 378
    :cond_1a
    sget-object v7, LV2/g;->q:LV2/g;

    .line 379
    .line 380
    :goto_12
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    if-eqz v7, :cond_1d

    .line 385
    .line 386
    if-ne v7, v6, :cond_1c

    .line 387
    .line 388
    cmpg-double v7, v12, v14

    .line 389
    .line 390
    if-gez v7, :cond_1b

    .line 391
    .line 392
    sub-int/2addr v5, v1

    .line 393
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    goto :goto_14

    .line 398
    :cond_1b
    sub-int/2addr v0, v9

    .line 399
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    :goto_13
    move-wide v12, v14

    .line 404
    goto :goto_14

    .line 405
    :cond_1c
    new-instance v0, LC2/e;

    .line 406
    .line 407
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_1d
    cmpl-double v7, v12, v14

    .line 412
    .line 413
    if-lez v7, :cond_1e

    .line 414
    .line 415
    sub-int/2addr v5, v1

    .line 416
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    goto :goto_14

    .line 421
    :cond_1e
    sub-int/2addr v0, v9

    .line 422
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    goto :goto_13

    .line 427
    :goto_14
    if-gt v0, v6, :cond_1f

    .line 428
    .line 429
    goto :goto_15

    .line 430
    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 435
    .line 436
    if-eqz v0, :cond_21

    .line 437
    .line 438
    if-ne v0, v6, :cond_20

    .line 439
    .line 440
    cmpg-double v0, v12, v4

    .line 441
    .line 442
    if-gtz v0, :cond_e

    .line 443
    .line 444
    goto :goto_15

    .line 445
    :cond_20
    new-instance v0, LC2/e;

    .line 446
    .line 447
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 448
    .line 449
    .line 450
    throw v0

    .line 451
    :cond_21
    cmpg-double v0, v12, v4

    .line 452
    .line 453
    if-nez v0, :cond_e

    .line 454
    .line 455
    :goto_15
    move v7, v6

    .line 456
    :goto_16
    if-eqz v7, :cond_22

    .line 457
    .line 458
    return-object v2

    .line 459
    :cond_22
    :goto_17
    return-object v16
.end method

.method public j(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk3/c;->q()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lk3/b;->r:Lk3/b;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {p1, v2, v3}, Lk3/c;->d(Ljava/lang/String;Lk3/b;Z)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 25
    .line 26
    invoke-virtual {p0}, Lk3/c;->q()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lk3/b;->s:Lk3/b;

    .line 31
    .line 32
    invoke-static {p1, v2, v3}, Lk3/c;->d(Ljava/lang/String;Lk3/b;Z)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 47
    .line 48
    invoke-virtual {p0}, Lk3/c;->q()Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lk3/b;->t:Lk3/b;

    .line 53
    .line 54
    invoke-static {p1, v2, v3}, Lk3/c;->d(Ljava/lang/String;Lk3/b;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    const/4 p1, 0x0

    .line 69
    return-object p1
.end method

.method public l(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/G;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ld2/G;->u(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public m()LP/S0;
    .locals 3

    .line 1
    invoke-static {}, LE1/l;->a()LE1/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LE1/l;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v0, LS0/k;

    .line 13
    .line 14
    invoke-direct {v0, v2}, LS0/k;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, LS0/g;

    .line 25
    .line 26
    invoke-direct {v2, v1, p0}, LS0/g;-><init>(LP/f0;Lk3/c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, LE1/l;->g(LE1/i;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld2/G;

    .line 4
    .line 5
    invoke-virtual {v0}, Ld2/G;->G()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public o(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ld2/H;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ld2/H;

    .line 16
    .line 17
    iget-object p1, p1, Ld2/H;->b:Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 20
    .line 21
    add-int/2addr v1, p1

    .line 22
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 23
    .line 24
    add-int/2addr v1, p1

    .line 25
    return v1
.end method

.method public p(LU2/g;Ljava/lang/Object;LU2/n;LI2/i;)LP2/a;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p4, p1, LU2/g;->c:Ljava/util/Map;

    .line 5
    .line 6
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LI2/y;

    .line 9
    .line 10
    iget-object v0, v0, LI2/y;->c:LI2/g;

    .line 11
    .line 12
    iget-object v0, v0, LI2/g;->c:Ljava/util/List;

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    const/4 v3, 0x0

    .line 23
    if-ge v2, v1, :cond_4

    .line 24
    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lm5/j;

    .line 30
    .line 31
    iget-object v5, v4, Lm5/j;->q:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, LN2/a;

    .line 34
    .line 35
    iget-object v4, v4, Lm5/j;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, LH5/c;

    .line 38
    .line 39
    check-cast v4, Lkotlin/jvm/internal/f;

    .line 40
    .line 41
    invoke-virtual {v4, p2}, Lkotlin/jvm/internal/f;->d(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    const-string v4, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>"

    .line 48
    .line 49
    invoke-static {v5, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget v4, v5, LN2/a;->a:I

    .line 53
    .line 54
    packed-switch v4, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    move-object v4, p2

    .line 58
    check-cast v4, LI2/B;

    .line 59
    .line 60
    iget-object v4, v4, LI2/B;->a:Ljava/lang/String;

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :pswitch_0
    move-object v4, p2

    .line 65
    check-cast v4, LI2/B;

    .line 66
    .line 67
    iget-object v5, v4, LI2/B;->c:Ljava/lang/String;

    .line 68
    .line 69
    const-string v6, "file"

    .line 70
    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    :cond_0
    iget-object v5, v4, LI2/B;->e:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    sget-object v5, LY2/j;->a:[Landroid/graphics/Bitmap$Config;

    .line 84
    .line 85
    iget-object v5, v4, LI2/B;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    invoke-static {v4}, LI2/q;->g(LI2/B;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {v5}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const-string v6, "android_asset"

    .line 102
    .line 103
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    sget-object v5, LU2/h;->c:LI2/l;

    .line 111
    .line 112
    invoke-static {p3, v5}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    invoke-static {v4}, LI2/q;->f(LI2/B;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    if-eqz v5, :cond_2

    .line 129
    .line 130
    iget-object v6, p3, LU2/n;->f:Lq6/l;

    .line 131
    .line 132
    sget-object v7, Lq6/x;->r:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v5}, LO3/D;->r(Ljava/lang/String;)Lq6/x;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v6, v5}, Lq6/l;->G(Lq6/x;)Le1/e;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iget-object v5, v5, Le1/e;->g:Ljava/io/Serializable;

    .line 143
    .line 144
    check-cast v5, Ljava/lang/Long;

    .line 145
    .line 146
    new-instance v6, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const/16 v4, 0x2d

    .line 155
    .line 156
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    goto :goto_2

    .line 167
    :cond_2
    :goto_1
    move-object v4, v3

    .line 168
    goto :goto_2

    .line 169
    :pswitch_1
    move-object v4, p2

    .line 170
    check-cast v4, LI2/B;

    .line 171
    .line 172
    iget-object v5, v4, LI2/B;->c:Ljava/lang/String;

    .line 173
    .line 174
    const-string v6, "android.resource"

    .line 175
    .line 176
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_2

    .line 181
    .line 182
    new-instance v5, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const/16 v4, 0x3a

    .line 191
    .line 192
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    iget-object v4, p3, LU2/n;->a:Landroid/content/Context;

    .line 196
    .line 197
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    sget-object v6, LY2/j;->a:[Landroid/graphics/Bitmap$Config;

    .line 206
    .line 207
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 208
    .line 209
    and-int/lit8 v4, v4, 0x30

    .line 210
    .line 211
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    :goto_2
    if-eqz v4, :cond_3

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_4
    move-object v4, v3

    .line 226
    :goto_3
    if-nez v4, :cond_5

    .line 227
    .line 228
    return-object v3

    .line 229
    :cond_5
    sget-object p2, LU2/h;->a:LI2/l;

    .line 230
    .line 231
    invoke-static {p1, p2}, LI2/q;->d(LU2/g;LI2/l;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Ljava/util/List;

    .line 236
    .line 237
    check-cast p1, Ljava/util/Collection;

    .line 238
    .line 239
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-nez p1, :cond_6

    .line 244
    .line 245
    invoke-static {p4}, Ln5/x;->P(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iget-object p2, p3, LU2/n;->b:LV2/h;

    .line 250
    .line 251
    invoke-virtual {p2}, LV2/h;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    const-string p3, "coil#size"

    .line 256
    .line 257
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    new-instance p2, LP2/a;

    .line 261
    .line 262
    invoke-direct {p2, v4, p1}, LP2/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 263
    .line 264
    .line 265
    return-object p2

    .line 266
    :cond_6
    new-instance p1, LP2/a;

    .line 267
    .line 268
    invoke-direct {p1, v4, p4}, LP2/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 269
    .line 270
    .line 271
    return-object p1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La3/d;

    .line 4
    .line 5
    iget-object v0, v0, La3/d;->q:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v1, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "lottie_network_cache"

    .line 14
    .line 15
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v1
.end method

.method public r(FLW0/c;LM5/w;)V
    .locals 7

    .line 1
    sget v0, LE/O;->a:F

    .line 2
    .line 3
    invoke-interface {p2, v0}, LW0/c;->u(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    cmpg-float p2, p1, p2

    .line 8
    .line 9
    if-gtz p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, La0/r;->c()La0/h;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, La0/h;->e()LB5/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v1, v0

    .line 25
    :goto_0
    invoke-static {p2}, La0/r;->d(La0/h;)La0/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :try_start_0
    iget-object v3, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lu/l;

    .line 32
    .line 33
    iget-object v3, v3, Lu/l;->r:LP/f0;

    .line 34
    .line 35
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget-object v4, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lu/l;

    .line 48
    .line 49
    iget-boolean v5, v4, Lu/l;->v:Z

    .line 50
    .line 51
    const/4 v6, 0x3

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    sub-float/2addr v3, p1

    .line 55
    const/4 p1, 0x0

    .line 56
    const/16 v5, 0x1e

    .line 57
    .line 58
    invoke-static {v4, v3, p1, v5}, Lu/d;->k(Lu/l;FFI)Lu/l;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance p1, LE/M;

    .line 65
    .line 66
    invoke-direct {p1, p0, v0}, LE/M;-><init>(Lk3/c;Lq5/c;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p3, v0, v0, p1, v6}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    new-instance v3, Lu/l;

    .line 76
    .line 77
    sget-object v4, Lu/A0;->a:LZ/m;

    .line 78
    .line 79
    neg-float p1, p1

    .line 80
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/16 v5, 0x3c

    .line 85
    .line 86
    invoke-direct {v3, v4, p1, v0, v5}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;I)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance p1, LE/N;

    .line 92
    .line 93
    invoke-direct {p1, p0, v0}, LE/N;-><init>(Lk3/c;Lq5/c;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p3, v0, v0, p1, v6}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-static {p2, v2, v1}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_2
    invoke-static {p2, v2, v1}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public s(Ljava/lang/String;Ljava/io/InputStream;Lk3/b;)Ljava/io/File;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p3, v0}, Lk3/c;->d(Ljava/lang/String;Lk3/b;Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    new-instance p3, Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {p0}, Lk3/c;->q()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p3, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    .line 16
    .line 17
    invoke-direct {p1, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x400

    .line 21
    .line 22
    :try_start_1
    new-array v0, v0, [B

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, -0x1

    .line 29
    if-eq v1, v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p3

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 45
    .line 46
    .line 47
    return-object p3

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    goto :goto_2

    .line 50
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 51
    .line 52
    .line 53
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    :goto_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public t()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO3/E1;

    .line 4
    .line 5
    invoke-virtual {v0}, LO3/C;->o()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/t0;

    .line 11
    .line 12
    iget-object v1, v0, LO3/t0;->u:LO3/h0;

    .line 13
    .line 14
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, LO3/t0;->A:LB3/a;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-virtual {v1, v3, v4}, LO3/h0;->y(J)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, v0, LO3/t0;->u:LO3/h0;

    .line 33
    .line 34
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, LO3/h0;->C:LO3/e0;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v1, v3}, LO3/e0;->e(Z)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 49
    .line 50
    .line 51
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 52
    .line 53
    const/16 v3, 0x64

    .line 54
    .line 55
    if-ne v1, v3, :cond_0

    .line 56
    .line 57
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 58
    .line 59
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 63
    .line 64
    const-string v1, "Detected application was in foreground"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-virtual {p0, v0, v1}, Lk3/c;->w(J)V

    .line 77
    .line 78
    .line 79
    :cond_0
    return-void
.end method

.method public u(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO3/E1;

    .line 4
    .line 5
    invoke-virtual {v0}, LO3/C;->o()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LO3/E1;->s()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LO3/t0;

    .line 14
    .line 15
    iget-object v1, v0, LO3/t0;->u:LO3/h0;

    .line 16
    .line 17
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, LO3/h0;->y(J)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v1, LO3/h0;->C:LO3/e0;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, LO3/e0;->e(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LO3/t0;->q()LO3/N;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, LO3/N;->t()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, LO3/h0;->G:LO3/f0;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, LO3/f0;->b(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v1, LO3/h0;->C:LO3/e0;

    .line 51
    .line 52
    invoke-virtual {v0}, LO3/e0;->d()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lk3/c;->w(J)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public w(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO3/E1;

    .line 4
    .line 5
    invoke-virtual {v0}, LO3/C;->o()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/t0;

    .line 11
    .line 12
    invoke-virtual {v0}, LO3/t0;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v6, v0, LO3/t0;->u:LO3/h0;

    .line 21
    .line 22
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v6, LO3/h0;->G:LO3/f0;

    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, LO3/f0;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, LO3/t0;->A:LB3/a;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    iget-object v3, v0, LO3/t0;->v:LO3/X;

    .line 40
    .line 41
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v3, LO3/X;->E:LO3/V;

    .line 45
    .line 46
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "Session started, time"

    .line 51
    .line 52
    invoke-virtual {v3, v1, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v1, 0x3e8

    .line 56
    .line 57
    div-long v7, p1, v1

    .line 58
    .line 59
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v0, v0, LO3/t0;->C:LO3/b1;

    .line 64
    .line 65
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "auto"

    .line 69
    .line 70
    const-string v5, "_sid"

    .line 71
    .line 72
    move-wide v1, p1

    .line 73
    invoke-virtual/range {v0 .. v5}, LO3/b1;->z(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v6, LO3/h0;->H:LO3/f0;

    .line 80
    .line 81
    invoke-virtual {v1, v7, v8}, LO3/f0;->b(J)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v6, LO3/h0;->C:LO3/e0;

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v1, v2}, LO3/e0;->e(Z)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v1, "_sid"

    .line 96
    .line 97
    invoke-virtual {v3, v1, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 101
    .line 102
    .line 103
    const-string v1, "auto"

    .line 104
    .line 105
    const-string v2, "_s"

    .line 106
    .line 107
    move-wide v4, p1

    .line 108
    invoke-virtual/range {v0 .. v5}, LO3/b1;->w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 109
    .line 110
    .line 111
    iget-object v1, v6, LO3/h0;->M:LK2/a;

    .line 112
    .line 113
    invoke-virtual {v1}, LK2/a;->e()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_1

    .line 122
    .line 123
    new-instance v3, Landroid/os/Bundle;

    .line 124
    .line 125
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v2, "_ffr"

    .line 129
    .line 130
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "auto"

    .line 137
    .line 138
    const-string v2, "_ssr"

    .line 139
    .line 140
    move-wide v4, p1

    .line 141
    invoke-virtual/range {v0 .. v5}, LO3/b1;->w(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 142
    .line 143
    .line 144
    :cond_1
    :goto_0
    return-void
.end method

.method public zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object p2, p0, Lk3/c;->q:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    check-cast v0, LO3/b1;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LO3/t0;

    .line 15
    .line 16
    iget-object p1, p1, LO3/t0;->A:LB3/a;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    const-string v1, "auto"

    .line 26
    .line 27
    const-string v2, "_err"

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    const/4 v5, 0x1

    .line 31
    move-object v3, p3

    .line 32
    invoke-virtual/range {v0 .. v7}, LO3/b1;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string p2, "Unexpected call on client side"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method
