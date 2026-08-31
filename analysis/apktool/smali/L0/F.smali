.class public final LL0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LL0/F;


# instance fields
.field public final a:LL0/y;

.field public final b:LL0/q;

.field public final c:LL0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, LL0/F;

    .line 2
    .line 3
    const-wide/16 v8, 0x0

    .line 4
    .line 5
    const v10, 0xffffff

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    invoke-direct/range {v0 .. v10}, LL0/F;-><init>(JJLO0/j;JJI)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LL0/F;->d:LL0/F;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(JJLO0/j;JJI)V
    .locals 22

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 9
    sget-wide v1, Lj0/o;->g:J

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 10
    sget-wide v1, LW0/n;->c:J

    move-wide v6, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    .line 11
    :cond_3
    sget-object v1, LO0/p;->a:LO0/b;

    move-object v11, v1

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    .line 12
    sget-wide v9, LW0/n;->c:J

    move-wide v13, v9

    goto :goto_4

    :cond_4
    move-wide/from16 v13, p6

    .line 13
    :goto_4
    sget-wide v18, Lj0/o;->g:J

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    .line 14
    sget-wide v0, LW0/n;->c:J

    goto :goto_5

    :cond_5
    move-wide/from16 v0, p8

    .line 15
    :goto_5
    new-instance v3, LL0/y;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, LL0/y;-><init>(JJLO0/j;LO0/h;LO0/i;LO0/p;Ljava/lang/String;JLV0/a;LV0/q;LR0/b;JLV0/l;Lj0/D;)V

    .line 16
    new-instance v8, LL0/q;

    const/high16 v9, -0x80000000

    const/high16 v10, -0x80000000

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/high16 v17, -0x80000000

    const/16 v18, 0x0

    move-wide v11, v0

    move-object v14, v2

    invoke-direct/range {v8 .. v18}, LL0/q;-><init>(IIJLV0/r;LL0/s;LV0/i;IILV0/t;)V

    const/4 v0, 0x0

    move-object/from16 v1, p0

    .line 17
    invoke-direct {v1, v3, v8, v0}, LL0/F;-><init>(LL0/y;LL0/q;LL0/t;)V

    return-void
.end method

.method public constructor <init>(LL0/y;LL0/q;)V
    .locals 2

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iget-object v0, p2, LL0/q;->e:LL0/s;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, LL0/t;

    invoke-direct {v1, v0}, LL0/t;-><init>(LL0/s;)V

    move-object v0, v1

    .line 8
    :goto_0
    invoke-direct {p0, p1, p2, v0}, LL0/F;-><init>(LL0/y;LL0/q;LL0/t;)V

    return-void
.end method

.method public constructor <init>(LL0/y;LL0/q;LL0/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LL0/F;->a:LL0/y;

    .line 3
    iput-object p2, p0, LL0/F;->b:LL0/q;

    .line 4
    iput-object p3, p0, LL0/F;->c:LL0/t;

    return-void
.end method

.method public static a(LL0/F;JLO0/j;LO0/p;JJLV0/i;I)LL0/F;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p10

    .line 4
    .line 5
    iget-object v2, v0, LL0/F;->a:LL0/y;

    .line 6
    .line 7
    iget-object v2, v2, LL0/y;->a:LV0/p;

    .line 8
    .line 9
    invoke-interface {v2}, LV0/p;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    and-int/lit8 v4, v1, 0x2

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    iget-object v4, v0, LL0/F;->a:LL0/y;

    .line 18
    .line 19
    iget-wide v4, v4, LL0/y;->b:J

    .line 20
    .line 21
    move-wide v8, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide/from16 v8, p1

    .line 24
    .line 25
    :goto_0
    and-int/lit8 v4, v1, 0x4

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, LL0/F;->a:LL0/y;

    .line 30
    .line 31
    iget-object v4, v4, LL0/y;->c:LO0/j;

    .line 32
    .line 33
    move-object v10, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v10, p3

    .line 36
    .line 37
    :goto_1
    iget-object v4, v0, LL0/F;->a:LL0/y;

    .line 38
    .line 39
    iget-object v11, v4, LL0/y;->d:LO0/h;

    .line 40
    .line 41
    iget-object v12, v4, LL0/y;->e:LO0/i;

    .line 42
    .line 43
    and-int/lit8 v5, v1, 0x20

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    iget-object v5, v4, LL0/y;->f:LO0/p;

    .line 48
    .line 49
    move-object v13, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object/from16 v13, p4

    .line 52
    .line 53
    :goto_2
    iget-object v14, v4, LL0/y;->g:Ljava/lang/String;

    .line 54
    .line 55
    and-int/lit16 v5, v1, 0x80

    .line 56
    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    iget-wide v5, v4, LL0/y;->h:J

    .line 60
    .line 61
    move-wide v15, v5

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-wide/from16 v15, p5

    .line 64
    .line 65
    :goto_3
    iget-object v5, v4, LL0/y;->i:LV0/a;

    .line 66
    .line 67
    iget-object v6, v4, LL0/y;->j:LV0/q;

    .line 68
    .line 69
    iget-object v7, v4, LL0/y;->k:LR0/b;

    .line 70
    .line 71
    move-object/from16 v17, v5

    .line 72
    .line 73
    move-object/from16 v18, v6

    .line 74
    .line 75
    iget-wide v5, v4, LL0/y;->l:J

    .line 76
    .line 77
    iget-object v1, v4, LL0/y;->m:LV0/l;

    .line 78
    .line 79
    move-object/from16 v22, v1

    .line 80
    .line 81
    iget-object v1, v4, LL0/y;->n:Lj0/D;

    .line 82
    .line 83
    move-object/from16 v23, v1

    .line 84
    .line 85
    iget-object v1, v4, LL0/y;->o:Ll0/c;

    .line 86
    .line 87
    move-object/from16 v24, v1

    .line 88
    .line 89
    iget-object v1, v0, LL0/F;->b:LL0/q;

    .line 90
    .line 91
    move-wide/from16 v20, v5

    .line 92
    .line 93
    iget v5, v1, LL0/q;->a:I

    .line 94
    .line 95
    iget v6, v1, LL0/q;->b:I

    .line 96
    .line 97
    const/high16 v19, 0x20000

    .line 98
    .line 99
    and-int v19, p10, v19

    .line 100
    .line 101
    move/from16 p1, v5

    .line 102
    .line 103
    move/from16 p2, v6

    .line 104
    .line 105
    if-eqz v19, :cond_4

    .line 106
    .line 107
    iget-wide v5, v1, LL0/q;->c:J

    .line 108
    .line 109
    move-wide/from16 v25, v5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_4
    move-wide/from16 v25, p7

    .line 113
    .line 114
    :goto_4
    iget-object v5, v1, LL0/q;->d:LV0/r;

    .line 115
    .line 116
    const/high16 v6, 0x80000

    .line 117
    .line 118
    and-int v6, p10, v6

    .line 119
    .line 120
    if-eqz v6, :cond_5

    .line 121
    .line 122
    iget-object v0, v0, LL0/F;->c:LL0/t;

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    sget-object v0, LN/s;->a:LL0/t;

    .line 126
    .line 127
    :goto_5
    const/high16 v6, 0x100000

    .line 128
    .line 129
    and-int v6, p10, v6

    .line 130
    .line 131
    if-eqz v6, :cond_6

    .line 132
    .line 133
    iget-object v6, v1, LL0/q;->f:LV0/i;

    .line 134
    .line 135
    move-object/from16 v27, v6

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_6
    move-object/from16 v27, p9

    .line 139
    .line 140
    :goto_6
    iget v6, v1, LL0/q;->g:I

    .line 141
    .line 142
    move-object/from16 p5, v5

    .line 143
    .line 144
    iget v5, v1, LL0/q;->h:I

    .line 145
    .line 146
    iget-object v1, v1, LL0/q;->i:LV0/t;

    .line 147
    .line 148
    move-object/from16 p10, v1

    .line 149
    .line 150
    new-instance v1, LL0/F;

    .line 151
    .line 152
    move/from16 v19, v6

    .line 153
    .line 154
    new-instance v6, LL0/y;

    .line 155
    .line 156
    move/from16 p9, v5

    .line 157
    .line 158
    iget-object v5, v4, LL0/y;->a:LV0/p;

    .line 159
    .line 160
    move-object/from16 p0, v6

    .line 161
    .line 162
    invoke-interface {v5}, LV0/p;->a()J

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    invoke-static {v2, v3, v5, v6}, Lj0/o;->c(JJ)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_7

    .line 171
    .line 172
    iget-object v2, v4, LL0/y;->a:LV0/p;

    .line 173
    .line 174
    :goto_7
    move-object/from16 v6, p0

    .line 175
    .line 176
    move/from16 v3, v19

    .line 177
    .line 178
    move-object/from16 v19, v7

    .line 179
    .line 180
    move-object v7, v2

    .line 181
    move/from16 v2, p2

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_7
    const-wide/16 v4, 0x10

    .line 185
    .line 186
    cmp-long v4, v2, v4

    .line 187
    .line 188
    if-eqz v4, :cond_8

    .line 189
    .line 190
    new-instance v4, LV0/c;

    .line 191
    .line 192
    invoke-direct {v4, v2, v3}, LV0/c;-><init>(J)V

    .line 193
    .line 194
    .line 195
    move-object v2, v4

    .line 196
    goto :goto_7

    .line 197
    :cond_8
    sget-object v2, LV0/n;->a:LV0/n;

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :goto_8
    invoke-direct/range {v6 .. v24}, LL0/y;-><init>(LV0/p;JLO0/j;LO0/h;LO0/i;LO0/p;Ljava/lang/String;JLV0/a;LV0/q;LR0/b;JLV0/l;Lj0/D;Ll0/c;)V

    .line 201
    .line 202
    .line 203
    new-instance v4, LL0/q;

    .line 204
    .line 205
    if-eqz v0, :cond_9

    .line 206
    .line 207
    iget-object v5, v0, LL0/t;->a:LL0/s;

    .line 208
    .line 209
    :goto_9
    move/from16 p2, v2

    .line 210
    .line 211
    move/from16 p8, v3

    .line 212
    .line 213
    move-object/from16 p0, v4

    .line 214
    .line 215
    move-object/from16 p6, v5

    .line 216
    .line 217
    move-wide/from16 p3, v25

    .line 218
    .line 219
    move-object/from16 p7, v27

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_9
    const/4 v5, 0x0

    .line 223
    goto :goto_9

    .line 224
    :goto_a
    invoke-direct/range {p0 .. p10}, LL0/q;-><init>(IIJLV0/r;LL0/s;LV0/i;IILV0/t;)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v2, p0

    .line 228
    .line 229
    invoke-direct {v1, v6, v2, v0}, LL0/F;-><init>(LL0/y;LL0/q;LL0/t;)V

    .line 230
    .line 231
    .line 232
    return-object v1
.end method

.method public static c(LL0/F;JJLO0/j;JIJI)LL0/F;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v2, LW0/n;->c:J

    .line 10
    .line 11
    move-wide v9, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v9, p3

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x4

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    move-object v11, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v11, p5

    .line 23
    .line 24
    :goto_1
    and-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    sget-wide v4, LW0/n;->c:J

    .line 29
    .line 30
    move-wide/from16 v16, v4

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-wide/from16 v16, p6

    .line 34
    .line 35
    :goto_2
    sget-wide v21, Lj0/o;->g:J

    .line 36
    .line 37
    const v2, 0x8000

    .line 38
    .line 39
    .line 40
    and-int/2addr v2, v1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/high16 v2, -0x80000000

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move/from16 v2, p8

    .line 47
    .line 48
    :goto_3
    const/high16 v4, 0x20000

    .line 49
    .line 50
    and-int/2addr v1, v4

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    sget-wide v4, LW0/n;->c:J

    .line 54
    .line 55
    move-wide/from16 v26, v4

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_4
    move-wide/from16 v26, p9

    .line 59
    .line 60
    :goto_4
    iget-object v4, v0, LL0/F;->a:LL0/y;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v23, 0x0

    .line 76
    .line 77
    const/16 v24, 0x0

    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    move-wide/from16 v5, p1

    .line 82
    .line 83
    invoke-static/range {v4 .. v25}, LL0/z;->a(LL0/y;JLj0/B;FJLO0/j;LO0/h;LO0/i;LO0/p;Ljava/lang/String;JLV0/a;LV0/q;LR0/b;JLV0/l;Lj0/D;Ll0/c;)LL0/y;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v4, v0, LL0/F;->b:LL0/q;

    .line 88
    .line 89
    const/high16 v5, -0x80000000

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/high16 v9, -0x80000000

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    move/from16 p2, v2

    .line 97
    .line 98
    move-object/from16 p7, v3

    .line 99
    .line 100
    move-object/from16 p1, v4

    .line 101
    .line 102
    move/from16 p3, v5

    .line 103
    .line 104
    move-object/from16 p6, v6

    .line 105
    .line 106
    move-object/from16 p8, v7

    .line 107
    .line 108
    move/from16 p9, v8

    .line 109
    .line 110
    move/from16 p10, v9

    .line 111
    .line 112
    move-object/from16 p11, v10

    .line 113
    .line 114
    move-wide/from16 p4, v26

    .line 115
    .line 116
    invoke-static/range {p1 .. p11}, LL0/r;->a(LL0/q;IIJLV0/r;LL0/s;LV0/i;IILV0/t;)LL0/q;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v0, LL0/F;->a:LL0/y;

    .line 121
    .line 122
    if-ne v3, v1, :cond_5

    .line 123
    .line 124
    iget-object v3, v0, LL0/F;->b:LL0/q;

    .line 125
    .line 126
    if-ne v3, v2, :cond_5

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_5
    new-instance v0, LL0/F;

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, LL0/F;-><init>(LL0/y;LL0/q;)V

    .line 132
    .line 133
    .line 134
    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-object v0, p0, LL0/F;->a:LL0/y;

    .line 2
    .line 3
    iget-object v0, v0, LL0/y;->a:LV0/p;

    .line 4
    .line 5
    invoke-interface {v0}, LV0/p;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LL0/F;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LL0/F;

    .line 12
    .line 13
    iget-object v1, p1, LL0/F;->a:LL0/y;

    .line 14
    .line 15
    iget-object v3, p0, LL0/F;->a:LL0/y;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, LL0/F;->b:LL0/q;

    .line 25
    .line 26
    iget-object v3, p1, LL0/F;->b:LL0/q;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, LL0/F;->c:LL0/t;

    .line 36
    .line 37
    iget-object p1, p1, LL0/F;->c:LL0/t;

    .line 38
    .line 39
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LL0/F;->a:LL0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, LL0/y;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LL0/F;->b:LL0/q;

    .line 10
    .line 11
    invoke-virtual {v1}, LL0/q;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, LL0/F;->c:LL0/t;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, LL0/t;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, v0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LL0/F;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Lj0/o;->i(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", brush="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LL0/F;->a:LL0/y;

    .line 25
    .line 26
    iget-object v2, v1, LL0/y;->a:LV0/p;

    .line 27
    .line 28
    invoke-interface {v2}, LV0/p;->b()Lj0/B;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", alpha="

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, LL0/y;->a:LV0/p;

    .line 41
    .line 42
    invoke-interface {v2}, LV0/p;->c()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", fontSize="

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, LL0/y;->b:J

    .line 55
    .line 56
    invoke-static {v2, v3}, LW0/n;->d(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, ", fontWeight="

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, LL0/y;->c:LO0/j;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, ", fontStyle="

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, LL0/y;->d:LO0/h;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, ", fontSynthesis="

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, LL0/y;->e:LO0/i;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, ", fontFamily="

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, LL0/y;->f:LO0/p;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, ", fontFeatureSettings="

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, LL0/y;->g:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ", letterSpacing="

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-wide v2, v1, LL0/y;->h:J

    .line 119
    .line 120
    invoke-static {v2, v3}, LW0/n;->d(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v2, ", baselineShift="

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, LL0/y;->i:LV0/a;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, ", textGeometricTransform="

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, LL0/y;->j:LV0/q;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v2, ", localeList="

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v2, v1, LL0/y;->k:LR0/b;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v2, ", background="

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-wide v2, v1, LL0/y;->l:J

    .line 163
    .line 164
    const-string v4, ", textDecoration="

    .line 165
    .line 166
    invoke-static {v2, v3, v0, v4}, Lk1/i;->r(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v1, LL0/y;->m:LV0/l;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, ", shadow="

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v2, v1, LL0/y;->n:Lj0/D;

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v2, ", drawStyle="

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v1, v1, LL0/y;->o:Ll0/c;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", textAlign="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, LL0/F;->b:LL0/q;

    .line 200
    .line 201
    iget v2, v1, LL0/q;->a:I

    .line 202
    .line 203
    invoke-static {v2}, LV0/k;->a(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v2, ", textDirection="

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget v2, v1, LL0/q;->b:I

    .line 216
    .line 217
    invoke-static {v2}, LV0/m;->a(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, ", lineHeight="

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-wide v2, v1, LL0/q;->c:J

    .line 230
    .line 231
    invoke-static {v2, v3}, LW0/n;->d(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, ", textIndent="

    .line 239
    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v2, v1, LL0/q;->d:LV0/r;

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v2, ", platformStyle="

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    iget-object v2, p0, LL0/F;->c:LL0/t;

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v2, ", lineHeightStyle="

    .line 259
    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    iget-object v2, v1, LL0/q;->f:LV0/i;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v2, ", lineBreak="

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    iget v2, v1, LL0/q;->g:I

    .line 274
    .line 275
    invoke-static {v2}, LV0/e;->a(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v2, ", hyphens="

    .line 283
    .line 284
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget v2, v1, LL0/q;->h:I

    .line 288
    .line 289
    invoke-static {v2}, LV0/d;->a(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string v2, ", textMotion="

    .line 297
    .line 298
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object v1, v1, LL0/q;->i:LV0/t;

    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const/16 v1, 0x29

    .line 307
    .line 308
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0
.end method
