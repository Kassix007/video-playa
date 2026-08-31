.class public final Lcom/google/android/gms/internal/clearcut/O;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/clearcut/Z;


# static fields
.field public static final o:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Lcom/google/android/gms/internal/clearcut/g;

.field public final g:Z

.field public final h:[I

.field public final i:[I

.field public final j:[I

.field public final k:Lcom/google/android/gms/internal/clearcut/Q;

.field public final l:Lcom/google/android/gms/internal/clearcut/F;

.field public final m:Lcom/google/android/gms/internal/clearcut/c0;

.field public final n:Lcom/google/android/gms/internal/clearcut/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i0;->f()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IIILcom/google/android/gms/internal/clearcut/g;Z[I[I[ILcom/google/android/gms/internal/clearcut/Q;Lcom/google/android/gms/internal/clearcut/F;Lcom/google/android/gms/internal/clearcut/c0;Lcom/google/android/gms/internal/clearcut/p;Lcom/google/android/gms/internal/clearcut/L;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/clearcut/O;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/clearcut/O;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/clearcut/O;->d:I

    .line 11
    .line 12
    iput p5, p0, Lcom/google/android/gms/internal/clearcut/O;->e:I

    .line 13
    .line 14
    iput-boolean p7, p0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 15
    .line 16
    iput-object p8, p0, Lcom/google/android/gms/internal/clearcut/O;->h:[I

    .line 17
    .line 18
    iput-object p9, p0, Lcom/google/android/gms/internal/clearcut/O;->i:[I

    .line 19
    .line 20
    iput-object p10, p0, Lcom/google/android/gms/internal/clearcut/O;->j:[I

    .line 21
    .line 22
    iput-object p11, p0, Lcom/google/android/gms/internal/clearcut/O;->k:Lcom/google/android/gms/internal/clearcut/Q;

    .line 23
    .line 24
    iput-object p12, p0, Lcom/google/android/gms/internal/clearcut/O;->l:Lcom/google/android/gms/internal/clearcut/F;

    .line 25
    .line 26
    iput-object p13, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    .line 27
    .line 28
    iput-object p6, p0, Lcom/google/android/gms/internal/clearcut/O;->f:Lcom/google/android/gms/internal/clearcut/g;

    .line 29
    .line 30
    iput-object p15, p0, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 31
    .line 32
    return-void
.end method

.method public static A(JLjava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static B(JLjava/lang/Object;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static h(Lcom/google/android/gms/internal/clearcut/Z;I[BIILcom/google/android/gms/internal/clearcut/A;Lcom/google/android/gms/internal/clearcut/j;)I
    .locals 2

    .line 1
    invoke-static {p0, p2, p3, p4, p6}, Lcom/google/android/gms/internal/clearcut/O;->j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p3

    :goto_0
    iget-object v0, p6, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge p3, p4, :cond_0

    invoke-static {p2, p3, p6}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, p6, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne p1, v1, :cond_0

    invoke-static {p0, p2, v0, p4, p6}, Lcom/google/android/gms/internal/clearcut/O;->j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p3

    goto :goto_0

    :cond_0
    return p3
.end method

.method public static i(Lcom/google/android/gms/internal/clearcut/Z;[BIIILcom/google/android/gms/internal/clearcut/j;)I
    .locals 7

    .line 1
    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/internal/clearcut/O;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/clearcut/O;->d()Ljava/lang/Object;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/O;->m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/clearcut/O;->a(Ljava/lang/Object;)V

    iput-object v1, v6, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    return p0
.end method

.method public static j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I
    .locals 6

    .line 1
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_0

    invoke-static {p2, p1, v0, p4}, Lcom/google/android/gms/internal/clearcut/l0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget p2, p4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    :cond_0
    move v3, v0

    if-ltz p2, :cond_1

    sub-int/2addr p3, v3

    if-gt p2, p3, :cond_1

    invoke-interface {p0}, Lcom/google/android/gms/internal/clearcut/Z;->d()Ljava/lang/Object;

    move-result-object v1

    add-int v4, v3, p2

    move-object v0, p0

    move-object v2, p1

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/clearcut/Z;->b(Ljava/lang/Object;[BIILcom/google/android/gms/internal/clearcut/j;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/clearcut/Z;->a(Ljava/lang/Object;)V

    iput-object v1, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    return v4

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p0

    throw p0
.end method

.method public static n(Lcom/google/android/gms/internal/clearcut/X;Lcom/google/android/gms/internal/clearcut/Q;Lcom/google/android/gms/internal/clearcut/F;Lcom/google/android/gms/internal/clearcut/c0;Lcom/google/android/gms/internal/clearcut/p;Lcom/google/android/gms/internal/clearcut/L;)Lcom/google/android/gms/internal/clearcut/O;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/clearcut/X;

    .line 4
    .line 5
    if-eqz v1, :cond_17

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/android/gms/internal/clearcut/X;->b:Lcom/google/android/gms/internal/clearcut/Y;

    .line 8
    .line 9
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->d:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    and-int/2addr v2, v3

    .line 13
    const/4 v4, 0x2

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v4

    .line 19
    :goto_0
    if-ne v2, v4, :cond_1

    .line 20
    .line 21
    move v13, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v13, 0x0

    .line 24
    :goto_1
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->e:I

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x0

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->g:I

    .line 33
    .line 34
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->h:I

    .line 35
    .line 36
    iget v7, v1, Lcom/google/android/gms/internal/clearcut/Y;->k:I

    .line 37
    .line 38
    move v9, v2

    .line 39
    move v10, v6

    .line 40
    :goto_2
    shl-int/lit8 v2, v7, 0x2

    .line 41
    .line 42
    new-array v2, v2, [I

    .line 43
    .line 44
    shl-int/lit8 v6, v7, 0x1

    .line 45
    .line 46
    new-array v8, v6, [Ljava/lang/Object;

    .line 47
    .line 48
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->i:I

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    if-lez v6, :cond_3

    .line 52
    .line 53
    new-array v6, v6, [I

    .line 54
    .line 55
    move-object v15, v6

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move-object v15, v7

    .line 58
    :goto_3
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->l:I

    .line 59
    .line 60
    if-lez v6, :cond_4

    .line 61
    .line 62
    new-array v7, v6, [I

    .line 63
    .line 64
    :cond_4
    move-object/from16 v16, v7

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/Y;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v7, v1, Lcom/google/android/gms/internal/clearcut/Y;->c:Ljava/lang/Class;

    .line 71
    .line 72
    iget-object v11, v1, Lcom/google/android/gms/internal/clearcut/Y;->b:[Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v6, :cond_15

    .line 75
    .line 76
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->s:I

    .line 77
    .line 78
    move/from16 v18, v4

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    :goto_4
    iget v4, v1, Lcom/google/android/gms/internal/clearcut/Y;->j:I

    .line 85
    .line 86
    if-ge v6, v4, :cond_6

    .line 87
    .line 88
    sub-int v4, v6, v9

    .line 89
    .line 90
    shl-int/lit8 v4, v4, 0x2

    .line 91
    .line 92
    if-ge v12, v4, :cond_6

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    :goto_5
    const/4 v5, 0x4

    .line 96
    if-ge v4, v5, :cond_5

    .line 97
    .line 98
    add-int v5, v12, v4

    .line 99
    .line 100
    const/16 v20, -0x1

    .line 101
    .line 102
    aput v20, v2, v5

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    move-object/from16 v22, v2

    .line 108
    .line 109
    move/from16 v20, v3

    .line 110
    .line 111
    goto/16 :goto_10

    .line 112
    .line 113
    :cond_6
    iget v4, v1, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 114
    .line 115
    sget-object v5, Lcom/google/android/gms/internal/clearcut/s;->z:Lcom/google/android/gms/internal/clearcut/s;

    .line 116
    .line 117
    iget v6, v5, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 118
    .line 119
    if-le v4, v6, :cond_9

    .line 120
    .line 121
    iget v4, v1, Lcom/google/android/gms/internal/clearcut/Y;->v:I

    .line 122
    .line 123
    shl-int/2addr v4, v3

    .line 124
    aget-object v6, v11, v4

    .line 125
    .line 126
    move/from16 v20, v3

    .line 127
    .line 128
    instance-of v3, v6, Ljava/lang/reflect/Field;

    .line 129
    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    check-cast v6, Ljava/lang/reflect/Field;

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_7
    check-cast v6, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/clearcut/Y;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    aput-object v6, v11, v4

    .line 142
    .line 143
    :goto_6
    sget-object v3, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 144
    .line 145
    move-object/from16 v21, v5

    .line 146
    .line 147
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    long-to-int v4, v4

    .line 152
    iget v5, v1, Lcom/google/android/gms/internal/clearcut/Y;->v:I

    .line 153
    .line 154
    shl-int/lit8 v5, v5, 0x1

    .line 155
    .line 156
    add-int/lit8 v5, v5, 0x1

    .line 157
    .line 158
    aget-object v6, v11, v5

    .line 159
    .line 160
    move-object/from16 v22, v2

    .line 161
    .line 162
    instance-of v2, v6, Ljava/lang/reflect/Field;

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    check-cast v6, Ljava/lang/reflect/Field;

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_8
    check-cast v6, Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/clearcut/Y;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    aput-object v6, v11, v5

    .line 176
    .line 177
    :goto_7
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    long-to-int v2, v2

    .line 182
    :goto_8
    const/4 v3, 0x0

    .line 183
    goto :goto_a

    .line 184
    :cond_9
    move-object/from16 v22, v2

    .line 185
    .line 186
    move/from16 v20, v3

    .line 187
    .line 188
    move-object/from16 v21, v5

    .line 189
    .line 190
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->x:Ljava/lang/reflect/Field;

    .line 191
    .line 192
    sget-object v3, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 193
    .line 194
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    long-to-int v4, v4

    .line 199
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->d:I

    .line 200
    .line 201
    and-int/lit8 v2, v2, 0x1

    .line 202
    .line 203
    move/from16 v5, v20

    .line 204
    .line 205
    if-ne v2, v5, :cond_b

    .line 206
    .line 207
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 208
    .line 209
    sget-object v6, Lcom/google/android/gms/internal/clearcut/s;->t:Lcom/google/android/gms/internal/clearcut/s;

    .line 210
    .line 211
    iget v6, v6, Lcom/google/android/gms/internal/clearcut/s;->q:I

    .line 212
    .line 213
    if-gt v2, v6, :cond_b

    .line 214
    .line 215
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->f:I

    .line 216
    .line 217
    shl-int/2addr v2, v5

    .line 218
    iget v5, v1, Lcom/google/android/gms/internal/clearcut/Y;->w:I

    .line 219
    .line 220
    div-int/lit8 v5, v5, 0x20

    .line 221
    .line 222
    add-int/2addr v5, v2

    .line 223
    aget-object v2, v11, v5

    .line 224
    .line 225
    instance-of v6, v2, Ljava/lang/reflect/Field;

    .line 226
    .line 227
    if-eqz v6, :cond_a

    .line 228
    .line 229
    check-cast v2, Ljava/lang/reflect/Field;

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_a
    check-cast v2, Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/clearcut/Y;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    aput-object v2, v11, v5

    .line 239
    .line 240
    :goto_9
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 241
    .line 242
    .line 243
    move-result-wide v2

    .line 244
    long-to-int v2, v2

    .line 245
    iget v3, v1, Lcom/google/android/gms/internal/clearcut/Y;->w:I

    .line 246
    .line 247
    rem-int/lit8 v3, v3, 0x20

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_b
    const/4 v2, 0x0

    .line 251
    goto :goto_8

    .line 252
    :goto_a
    iget v5, v1, Lcom/google/android/gms/internal/clearcut/Y;->s:I

    .line 253
    .line 254
    aput v5, v22, v12

    .line 255
    .line 256
    add-int/lit8 v5, v12, 0x1

    .line 257
    .line 258
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->t:I

    .line 259
    .line 260
    move/from16 v23, v2

    .line 261
    .line 262
    and-int/lit16 v2, v6, 0x200

    .line 263
    .line 264
    if-eqz v2, :cond_c

    .line 265
    .line 266
    const/high16 v2, 0x20000000

    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_c
    const/4 v2, 0x0

    .line 270
    :goto_b
    and-int/lit16 v6, v6, 0x100

    .line 271
    .line 272
    if-eqz v6, :cond_d

    .line 273
    .line 274
    const/high16 v6, 0x10000000

    .line 275
    .line 276
    goto :goto_c

    .line 277
    :cond_d
    const/4 v6, 0x0

    .line 278
    :goto_c
    or-int/2addr v2, v6

    .line 279
    iget v6, v1, Lcom/google/android/gms/internal/clearcut/Y;->u:I

    .line 280
    .line 281
    shl-int/lit8 v24, v6, 0x14

    .line 282
    .line 283
    or-int v2, v2, v24

    .line 284
    .line 285
    or-int/2addr v2, v4

    .line 286
    aput v2, v22, v5

    .line 287
    .line 288
    add-int/lit8 v2, v12, 0x2

    .line 289
    .line 290
    shl-int/lit8 v3, v3, 0x14

    .line 291
    .line 292
    or-int v3, v3, v23

    .line 293
    .line 294
    aput v3, v22, v2

    .line 295
    .line 296
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->A:Ljava/lang/Object;

    .line 297
    .line 298
    if-eqz v2, :cond_10

    .line 299
    .line 300
    div-int/lit8 v3, v12, 0x4

    .line 301
    .line 302
    const/16 v20, 0x1

    .line 303
    .line 304
    shl-int/lit8 v3, v3, 0x1

    .line 305
    .line 306
    aput-object v2, v8, v3

    .line 307
    .line 308
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 309
    .line 310
    if-eqz v2, :cond_f

    .line 311
    .line 312
    add-int/lit8 v3, v3, 0x1

    .line 313
    .line 314
    aput-object v2, v8, v3

    .line 315
    .line 316
    :cond_e
    :goto_d
    const/16 v20, 0x1

    .line 317
    .line 318
    goto :goto_e

    .line 319
    :cond_f
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 320
    .line 321
    if-eqz v2, :cond_e

    .line 322
    .line 323
    add-int/lit8 v3, v3, 0x1

    .line 324
    .line 325
    aput-object v2, v8, v3

    .line 326
    .line 327
    goto :goto_d

    .line 328
    :cond_10
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->y:Ljava/lang/Object;

    .line 329
    .line 330
    if-eqz v2, :cond_11

    .line 331
    .line 332
    div-int/lit8 v3, v12, 0x4

    .line 333
    .line 334
    const/16 v20, 0x1

    .line 335
    .line 336
    shl-int/lit8 v3, v3, 0x1

    .line 337
    .line 338
    add-int/lit8 v3, v3, 0x1

    .line 339
    .line 340
    aput-object v2, v8, v3

    .line 341
    .line 342
    goto :goto_e

    .line 343
    :cond_11
    const/16 v20, 0x1

    .line 344
    .line 345
    iget-object v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->z:Ljava/lang/Object;

    .line 346
    .line 347
    if-eqz v2, :cond_12

    .line 348
    .line 349
    div-int/lit8 v3, v12, 0x4

    .line 350
    .line 351
    shl-int/lit8 v3, v3, 0x1

    .line 352
    .line 353
    add-int/lit8 v3, v3, 0x1

    .line 354
    .line 355
    aput-object v2, v8, v3

    .line 356
    .line 357
    :cond_12
    :goto_e
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-ne v6, v2, :cond_13

    .line 362
    .line 363
    add-int/lit8 v2, v14, 0x1

    .line 364
    .line 365
    aput v12, v15, v14

    .line 366
    .line 367
    move v14, v2

    .line 368
    goto :goto_f

    .line 369
    :cond_13
    const/16 v2, 0x12

    .line 370
    .line 371
    if-lt v6, v2, :cond_14

    .line 372
    .line 373
    const/16 v2, 0x31

    .line 374
    .line 375
    if-gt v6, v2, :cond_14

    .line 376
    .line 377
    add-int/lit8 v2, v17, 0x1

    .line 378
    .line 379
    aget v3, v22, v5

    .line 380
    .line 381
    const v4, 0xfffff

    .line 382
    .line 383
    .line 384
    and-int/2addr v3, v4

    .line 385
    aput v3, v16, v17

    .line 386
    .line 387
    move/from16 v17, v2

    .line 388
    .line 389
    :cond_14
    :goto_f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/clearcut/Y;->a()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_16

    .line 394
    .line 395
    iget v2, v1, Lcom/google/android/gms/internal/clearcut/Y;->s:I

    .line 396
    .line 397
    move v6, v2

    .line 398
    :goto_10
    add-int/lit8 v12, v12, 0x4

    .line 399
    .line 400
    move/from16 v3, v20

    .line 401
    .line 402
    move-object/from16 v2, v22

    .line 403
    .line 404
    goto/16 :goto_4

    .line 405
    .line 406
    :cond_15
    move-object/from16 v22, v2

    .line 407
    .line 408
    :cond_16
    new-instance v6, Lcom/google/android/gms/internal/clearcut/O;

    .line 409
    .line 410
    iget v11, v1, Lcom/google/android/gms/internal/clearcut/Y;->j:I

    .line 411
    .line 412
    iget-object v12, v0, Lcom/google/android/gms/internal/clearcut/X;->a:Lcom/google/android/gms/internal/clearcut/g;

    .line 413
    .line 414
    iget-object v14, v1, Lcom/google/android/gms/internal/clearcut/Y;->m:[I

    .line 415
    .line 416
    move-object/from16 v17, p1

    .line 417
    .line 418
    move-object/from16 v18, p2

    .line 419
    .line 420
    move-object/from16 v19, p3

    .line 421
    .line 422
    move-object/from16 v20, p4

    .line 423
    .line 424
    move-object/from16 v21, p5

    .line 425
    .line 426
    move-object/from16 v7, v22

    .line 427
    .line 428
    invoke-direct/range {v6 .. v21}, Lcom/google/android/gms/internal/clearcut/O;-><init>([I[Ljava/lang/Object;IIILcom/google/android/gms/internal/clearcut/g;Z[I[I[ILcom/google/android/gms/internal/clearcut/Q;Lcom/google/android/gms/internal/clearcut/F;Lcom/google/android/gms/internal/clearcut/c0;Lcom/google/android/gms/internal/clearcut/p;Lcom/google/android/gms/internal/clearcut/L;)V

    .line 429
    .line 430
    .line 431
    return-object v6

    .line 432
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    new-instance v0, Ljava/lang/ClassCastException;

    .line 436
    .line 437
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 438
    .line 439
    .line 440
    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->i:[I

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    move v3, v0

    .line 8
    :goto_0
    if-ge v3, v2, :cond_1

    .line 9
    .line 10
    aget v4, v1, v3

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const v5, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v4, v5

    .line 20
    int-to-long v4, v4

    .line 21
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    iget-object v7, p0, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 28
    .line 29
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v7, v6

    .line 33
    check-cast v7, Lcom/google/android/gms/internal/clearcut/K;

    .line 34
    .line 35
    iput-boolean v0, v7, Lcom/google/android/gms/internal/clearcut/K;->q:Z

    .line 36
    .line 37
    invoke-static {v4, v5, p1, v6}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->j:[I

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    array-length v2, v1

    .line 48
    move v3, v0

    .line 49
    :goto_1
    if-ge v3, v2, :cond_2

    .line 50
    .line 51
    aget v4, v1, v3

    .line 52
    .line 53
    iget-object v5, p0, Lcom/google/android/gms/internal/clearcut/O;->l:Lcom/google/android/gms/internal/clearcut/F;

    .line 54
    .line 55
    int-to-long v6, v4

    .line 56
    invoke-virtual {v5, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/F;->a(JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast p1, Lcom/google/android/gms/internal/clearcut/x;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 70
    .line 71
    iput-boolean v0, p1, Lcom/google/android/gms/internal/clearcut/b0;->d:Z

    .line 72
    .line 73
    return-void
.end method

.method public final b(Ljava/lang/Object;[BIILcom/google/android/gms/internal/clearcut/j;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move/from16 v8, p4

    .line 6
    .line 7
    move-object/from16 v13, p5

    .line 8
    .line 9
    iget-boolean v1, v0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 10
    .line 11
    if-eqz v1, :cond_18

    .line 12
    .line 13
    sget-object v1, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    .line 14
    .line 15
    move/from16 v2, p3

    .line 16
    .line 17
    :goto_0
    if-ge v2, v8, :cond_16

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    aget-byte v2, v7, v2

    .line 22
    .line 23
    if-gez v2, :cond_0

    .line 24
    .line 25
    invoke-static {v2, v7, v3, v13}, Lcom/google/android/gms/internal/clearcut/l0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget v2, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 30
    .line 31
    :cond_0
    move v5, v2

    .line 32
    move v9, v3

    .line 33
    ushr-int/lit8 v6, v5, 0x3

    .line 34
    .line 35
    and-int/lit8 v2, v5, 0x7

    .line 36
    .line 37
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/clearcut/O;->w(I)I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-ltz v12, :cond_1

    .line 42
    .line 43
    add-int/lit8 v3, v12, 0x1

    .line 44
    .line 45
    iget-object v4, v0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 46
    .line 47
    aget v3, v4, v3

    .line 48
    .line 49
    const/high16 v4, 0xff00000

    .line 50
    .line 51
    and-int/2addr v4, v3

    .line 52
    ushr-int/lit8 v11, v4, 0x14

    .line 53
    .line 54
    const v4, 0xfffff

    .line 55
    .line 56
    .line 57
    and-int/2addr v4, v3

    .line 58
    int-to-long v14, v4

    .line 59
    const/16 v4, 0x11

    .line 60
    .line 61
    const/4 v10, 0x2

    .line 62
    if-gt v11, v4, :cond_b

    .line 63
    .line 64
    const/4 v4, 0x5

    .line 65
    const/4 v6, 0x1

    .line 66
    packed-switch v11, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    :cond_1
    move-object v15, v1

    .line 70
    :cond_2
    :goto_1
    move v3, v9

    .line 71
    goto/16 :goto_b

    .line 72
    .line 73
    :pswitch_0
    if-nez v2, :cond_3

    .line 74
    .line 75
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    iget-wide v2, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 80
    .line 81
    ushr-long v4, v2, v6

    .line 82
    .line 83
    const-wide/16 v10, 0x1

    .line 84
    .line 85
    and-long/2addr v2, v10

    .line 86
    neg-long v2, v2

    .line 87
    xor-long v5, v4, v2

    .line 88
    .line 89
    move-object/from16 v2, p1

    .line 90
    .line 91
    move-wide v3, v14

    .line 92
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 93
    .line 94
    .line 95
    move-object v11, v1

    .line 96
    move-object v1, v2

    .line 97
    move v2, v9

    .line 98
    :goto_2
    move-object v1, v11

    .line 99
    goto :goto_0

    .line 100
    :cond_3
    move-object v11, v1

    .line 101
    move-object/from16 v1, p1

    .line 102
    .line 103
    :cond_4
    move v3, v9

    .line 104
    move-object v15, v11

    .line 105
    goto/16 :goto_b

    .line 106
    .line 107
    :pswitch_1
    move-object v11, v1

    .line 108
    move-object/from16 v1, p1

    .line 109
    .line 110
    if-nez v2, :cond_4

    .line 111
    .line 112
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 117
    .line 118
    ushr-int/lit8 v4, v3, 0x1

    .line 119
    .line 120
    and-int/2addr v3, v6

    .line 121
    neg-int v3, v3

    .line 122
    xor-int/2addr v3, v4

    .line 123
    :goto_3
    invoke-virtual {v11, v1, v14, v15, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :pswitch_2
    move-object v11, v1

    .line 128
    move-object/from16 v1, p1

    .line 129
    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :pswitch_3
    move-object v11, v1

    .line 140
    move-object/from16 v1, p1

    .line 141
    .line 142
    if-ne v2, v10, :cond_4

    .line 143
    .line 144
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->s([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :goto_4
    iget-object v3, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 149
    .line 150
    :goto_5
    invoke-virtual {v11, v1, v14, v15, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :pswitch_4
    move-object v11, v1

    .line 155
    move-object/from16 v1, p1

    .line 156
    .line 157
    if-ne v2, v10, :cond_4

    .line 158
    .line 159
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v2, v7, v9, v8, v13}, Lcom/google/android/gms/internal/clearcut/O;->j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-virtual {v11, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-nez v3, :cond_5

    .line 172
    .line 173
    iget-object v3, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    iget-object v4, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    goto :goto_5

    .line 183
    :pswitch_5
    move-object v11, v1

    .line 184
    move-object/from16 v1, p1

    .line 185
    .line 186
    if-ne v2, v10, :cond_4

    .line 187
    .line 188
    const/high16 v2, 0x20000000

    .line 189
    .line 190
    and-int/2addr v2, v3

    .line 191
    if-nez v2, :cond_7

    .line 192
    .line 193
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 198
    .line 199
    if-nez v3, :cond_6

    .line 200
    .line 201
    const-string v3, ""

    .line 202
    .line 203
    iput-object v3, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    new-instance v4, Ljava/lang/String;

    .line 207
    .line 208
    sget-object v5, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 209
    .line 210
    invoke-direct {v4, v7, v2, v3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 211
    .line 212
    .line 213
    iput-object v4, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 214
    .line 215
    add-int/2addr v2, v3

    .line 216
    goto :goto_4

    .line 217
    :cond_7
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->q([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    goto :goto_4

    .line 222
    :pswitch_6
    move-object v11, v1

    .line 223
    move-object/from16 v1, p1

    .line 224
    .line 225
    if-nez v2, :cond_4

    .line 226
    .line 227
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    iget-wide v3, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 232
    .line 233
    const-wide/16 v9, 0x0

    .line 234
    .line 235
    cmp-long v3, v3, v9

    .line 236
    .line 237
    if-eqz v3, :cond_8

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_8
    const/4 v6, 0x0

    .line 241
    :goto_6
    sget-object v3, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 242
    .line 243
    invoke-virtual {v3, v1, v14, v15, v6}, Lcom/google/android/gms/internal/clearcut/h0;->f(Ljava/lang/Object;JZ)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :pswitch_7
    move-object v11, v1

    .line 249
    move-object/from16 v1, p1

    .line 250
    .line 251
    if-ne v2, v4, :cond_4

    .line 252
    .line 253
    invoke-static {v9, v7}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    invoke-virtual {v11, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 258
    .line 259
    .line 260
    add-int/lit8 v2, v9, 0x4

    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :pswitch_8
    move-object v11, v1

    .line 265
    move-object/from16 v1, p1

    .line 266
    .line 267
    if-ne v2, v6, :cond_4

    .line 268
    .line 269
    invoke-static {v9, v7}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    .line 270
    .line 271
    .line 272
    move-result-wide v5

    .line 273
    move-object v2, v1

    .line 274
    move-object v1, v11

    .line 275
    move-wide v3, v14

    .line 276
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 277
    .line 278
    .line 279
    move-object v1, v2

    .line 280
    add-int/lit8 v2, v9, 0x8

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :pswitch_9
    move-object v11, v1

    .line 285
    move-wide v3, v14

    .line 286
    move-object/from16 v1, p1

    .line 287
    .line 288
    if-nez v2, :cond_4

    .line 289
    .line 290
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    iget v5, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 295
    .line 296
    invoke-virtual {v11, v1, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :pswitch_a
    move-object v11, v1

    .line 302
    move-wide v3, v14

    .line 303
    move-object/from16 v1, p1

    .line 304
    .line 305
    if-nez v2, :cond_9

    .line 306
    .line 307
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    iget-wide v5, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 312
    .line 313
    move-object v2, v1

    .line 314
    move-object v1, v11

    .line 315
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 316
    .line 317
    .line 318
    move-object v15, v1

    .line 319
    move-object v1, v2

    .line 320
    move v2, v9

    .line 321
    :goto_7
    move-object v1, v15

    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_9
    move-object v15, v11

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :pswitch_b
    move-wide v10, v14

    .line 328
    move-object v15, v1

    .line 329
    move-object/from16 v1, p1

    .line 330
    .line 331
    if-ne v2, v4, :cond_2

    .line 332
    .line 333
    invoke-static {v9, v7}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    sget-object v3, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 342
    .line 343
    invoke-virtual {v3, v1, v10, v11, v2}, Lcom/google/android/gms/internal/clearcut/h0;->d(Ljava/lang/Object;JF)V

    .line 344
    .line 345
    .line 346
    add-int/lit8 v2, v9, 0x4

    .line 347
    .line 348
    goto :goto_7

    .line 349
    :pswitch_c
    move-wide v10, v14

    .line 350
    move-object v15, v1

    .line 351
    move-object/from16 v1, p1

    .line 352
    .line 353
    if-ne v2, v6, :cond_a

    .line 354
    .line 355
    invoke-static {v9, v7}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    .line 356
    .line 357
    .line 358
    move-result-wide v2

    .line 359
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 360
    .line 361
    .line 362
    move-result-wide v5

    .line 363
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 364
    .line 365
    move-object/from16 v2, p1

    .line 366
    .line 367
    move-wide v3, v10

    .line 368
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/clearcut/h0;->c(Ljava/lang/Object;JD)V

    .line 369
    .line 370
    .line 371
    move-object v14, v2

    .line 372
    add-int/lit8 v2, v9, 0x8

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_a
    move-object v14, v1

    .line 376
    goto/16 :goto_1

    .line 377
    .line 378
    :cond_b
    move/from16 p3, v5

    .line 379
    .line 380
    move-wide v4, v14

    .line 381
    move-object/from16 v14, p1

    .line 382
    .line 383
    move-object v15, v1

    .line 384
    const/16 v1, 0x1b

    .line 385
    .line 386
    if-ne v11, v1, :cond_f

    .line 387
    .line 388
    if-ne v2, v10, :cond_e

    .line 389
    .line 390
    invoke-virtual {v15, v14, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    check-cast v1, Lcom/google/android/gms/internal/clearcut/A;

    .line 395
    .line 396
    move-object v2, v1

    .line 397
    check-cast v2, Lcom/google/android/gms/internal/clearcut/h;

    .line 398
    .line 399
    iget-boolean v2, v2, Lcom/google/android/gms/internal/clearcut/h;->q:Z

    .line 400
    .line 401
    if-nez v2, :cond_d

    .line 402
    .line 403
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-nez v2, :cond_c

    .line 408
    .line 409
    const/16 v2, 0xa

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_c
    shl-int/lit8 v2, v2, 0x1

    .line 413
    .line 414
    :goto_8
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/clearcut/A;->n(I)Lcom/google/android/gms/internal/clearcut/A;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v15, v14, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_d
    move-object v6, v1

    .line 422
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    move/from16 v2, p3

    .line 427
    .line 428
    move-object v3, v7

    .line 429
    move v5, v8

    .line 430
    move v4, v9

    .line 431
    move-object v7, v13

    .line 432
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/O;->h(Lcom/google/android/gms/internal/clearcut/Z;I[BIILcom/google/android/gms/internal/clearcut/A;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    move-object/from16 v7, p2

    .line 437
    .line 438
    move/from16 v8, p4

    .line 439
    .line 440
    move-object/from16 v13, p5

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_e
    move/from16 v5, p3

    .line 444
    .line 445
    goto/16 :goto_1

    .line 446
    .line 447
    :cond_f
    move/from16 v1, p3

    .line 448
    .line 449
    move v7, v9

    .line 450
    const/16 v8, 0x31

    .line 451
    .line 452
    if-gt v11, v8, :cond_11

    .line 453
    .line 454
    int-to-long v9, v3

    .line 455
    move v3, v7

    .line 456
    move v8, v12

    .line 457
    move v7, v2

    .line 458
    move-wide v12, v4

    .line 459
    move-object/from16 v2, p2

    .line 460
    .line 461
    move/from16 v4, p4

    .line 462
    .line 463
    move v5, v1

    .line 464
    move-object v1, v14

    .line 465
    move-object/from16 v14, p5

    .line 466
    .line 467
    invoke-virtual/range {v0 .. v14}, Lcom/google/android/gms/internal/clearcut/O;->l(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    move v4, v3

    .line 472
    if-ne v6, v4, :cond_10

    .line 473
    .line 474
    :goto_9
    move v2, v6

    .line 475
    goto :goto_c

    .line 476
    :cond_10
    :goto_a
    move-object/from16 v7, p2

    .line 477
    .line 478
    move/from16 v8, p4

    .line 479
    .line 480
    move-object/from16 v13, p5

    .line 481
    .line 482
    move v2, v6

    .line 483
    goto/16 :goto_7

    .line 484
    .line 485
    :cond_11
    move-wide v8, v4

    .line 486
    move v4, v7

    .line 487
    move v5, v1

    .line 488
    move v7, v2

    .line 489
    move-object v1, v14

    .line 490
    const/16 v2, 0x32

    .line 491
    .line 492
    if-ne v11, v2, :cond_13

    .line 493
    .line 494
    if-eq v7, v10, :cond_12

    .line 495
    .line 496
    move v3, v4

    .line 497
    goto :goto_b

    .line 498
    :cond_12
    invoke-virtual {v0, v12, v8, v9, v1}, Lcom/google/android/gms/internal/clearcut/O;->o(IJLjava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    const/4 v1, 0x0

    .line 502
    throw v1

    .line 503
    :cond_13
    move-wide/from16 v16, v8

    .line 504
    .line 505
    move v9, v11

    .line 506
    move-wide/from16 v10, v16

    .line 507
    .line 508
    move-object/from16 v2, p2

    .line 509
    .line 510
    move-object/from16 v13, p5

    .line 511
    .line 512
    move v8, v3

    .line 513
    move v3, v4

    .line 514
    move/from16 v4, p4

    .line 515
    .line 516
    invoke-virtual/range {v0 .. v13}, Lcom/google/android/gms/internal/clearcut/O;->k(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    if-ne v6, v3, :cond_14

    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_14
    move-object/from16 v0, p0

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :goto_b
    move v2, v3

    .line 527
    :goto_c
    move-object/from16 v0, p1

    .line 528
    .line 529
    check-cast v0, Lcom/google/android/gms/internal/clearcut/x;

    .line 530
    .line 531
    iget-object v1, v0, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 532
    .line 533
    sget-object v3, Lcom/google/android/gms/internal/clearcut/b0;->e:Lcom/google/android/gms/internal/clearcut/b0;

    .line 534
    .line 535
    if-ne v1, v3, :cond_15

    .line 536
    .line 537
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 542
    .line 543
    :cond_15
    move/from16 v3, p4

    .line 544
    .line 545
    move-object v4, v1

    .line 546
    move v0, v5

    .line 547
    move-object/from16 v1, p2

    .line 548
    .line 549
    move-object/from16 v5, p5

    .line 550
    .line 551
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/clearcut/l0;->c(I[BIILcom/google/android/gms/internal/clearcut/b0;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    move-object/from16 v0, p0

    .line 556
    .line 557
    move-object/from16 v7, p2

    .line 558
    .line 559
    move-object/from16 v13, p5

    .line 560
    .line 561
    move v8, v3

    .line 562
    goto/16 :goto_7

    .line 563
    .line 564
    :cond_16
    move v4, v8

    .line 565
    if-ne v2, v4, :cond_17

    .line 566
    .line 567
    return-void

    .line 568
    :cond_17
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->b()Lcom/google/android/gms/internal/clearcut/B;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    throw v0

    .line 573
    :cond_18
    move v4, v8

    .line 574
    const/4 v5, 0x0

    .line 575
    move-object/from16 v0, p0

    .line 576
    .line 577
    move-object/from16 v1, p1

    .line 578
    .line 579
    move-object/from16 v2, p2

    .line 580
    .line 581
    move/from16 v3, p3

    .line 582
    .line 583
    move-object/from16 v6, p5

    .line 584
    .line 585
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/clearcut/O;->m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lcom/google/android/gms/internal/clearcut/x;Lcom/google/android/gms/internal/clearcut/x;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ge v0, v2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int v4, v2, v3

    .line 18
    .line 19
    int-to-long v7, v4

    .line 20
    aget v4, v1, v0

    .line 21
    .line 22
    const/high16 v5, 0xff00000

    .line 23
    .line 24
    and-int/2addr v2, v5

    .line 25
    ushr-int/lit8 v2, v2, 0x14

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :cond_0
    :goto_1
    move-object v6, p1

    .line 31
    goto/16 :goto_9

    .line 32
    .line 33
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/clearcut/O;->y(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :pswitch_1
    invoke-virtual {p0, v4, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v7, v8, p1, v2}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v0, 0x2

    .line 51
    .line 52
    aget v1, v1, v2

    .line 53
    .line 54
    :goto_2
    and-int/2addr v1, v3

    .line 55
    int-to-long v1, v1

    .line 56
    invoke-static {v4, v1, v2, p1}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_2
    invoke-virtual {p0, v4, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v7, v8, p1, v2}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v0, 0x2

    .line 74
    .line 75
    aget v1, v1, v2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :pswitch_3
    sget-object v1, Lcom/google/android/gms/internal/clearcut/a0;->a:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget-object v3, p0, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/clearcut/L;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/K;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v7, v8, p1, v1}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->l:Lcom/google/android/gms/internal/clearcut/F;

    .line 102
    .line 103
    invoke-virtual {v1, v7, v8, p1, p2}, Lcom/google/android/gms/internal/clearcut/F;->b(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_5
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/clearcut/O;->p(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_6
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_0

    .line 116
    .line 117
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 118
    .line 119
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    move-object v6, p1

    .line 124
    :goto_3
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/clearcut/h0;->e(Ljava/lang/Object;JJ)V

    .line 125
    .line 126
    .line 127
    :goto_4
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/clearcut/O;->x(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_9

    .line 131
    .line 132
    :pswitch_7
    move-object v6, p1

    .line 133
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_1

    .line 138
    .line 139
    :goto_5
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 140
    .line 141
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :pswitch_8
    move-object v6, p1

    .line 150
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_1

    .line 155
    .line 156
    :goto_6
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 157
    .line 158
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v9

    .line 162
    goto :goto_3

    .line 163
    :pswitch_9
    move-object v6, p1

    .line 164
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_1

    .line 169
    .line 170
    :goto_7
    goto :goto_5

    .line 171
    :pswitch_a
    move-object v6, p1

    .line 172
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_1

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :pswitch_b
    move-object v6, p1

    .line 180
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_1

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :pswitch_c
    move-object v6, p1

    .line 188
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_1

    .line 193
    .line 194
    :goto_8
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {v7, v8, v6, p1}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :pswitch_d
    move-object v6, p1

    .line 203
    invoke-virtual {p0, v0, v6, p2}, Lcom/google/android/gms/internal/clearcut/O;->p(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_9

    .line 207
    .line 208
    :pswitch_e
    move-object v6, p1

    .line 209
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_1

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :pswitch_f
    move-object v6, p1

    .line 217
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_1

    .line 222
    .line 223
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 224
    .line 225
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->i(JLjava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {p1, v6, v7, v8, v1}, Lcom/google/android/gms/internal/clearcut/h0;->f(Ljava/lang/Object;JZ)V

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :pswitch_10
    move-object v6, p1

    .line 234
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_1

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :pswitch_11
    move-object v6, p1

    .line 242
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_1

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :pswitch_12
    move-object v6, p1

    .line 250
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_1

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :pswitch_13
    move-object v6, p1

    .line 258
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_1

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :pswitch_14
    move-object v6, p1

    .line 266
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_1

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :pswitch_15
    move-object v6, p1

    .line 274
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_1

    .line 279
    .line 280
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 281
    .line 282
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->j(JLjava/lang/Object;)F

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-virtual {p1, v6, v7, v8, v1}, Lcom/google/android/gms/internal/clearcut/h0;->d(Ljava/lang/Object;JF)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_4

    .line 290
    .line 291
    :pswitch_16
    move-object v6, p1

    .line 292
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_1

    .line 297
    .line 298
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 299
    .line 300
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->k(JLjava/lang/Object;)D

    .line 301
    .line 302
    .line 303
    move-result-wide v9

    .line 304
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/clearcut/h0;->c(Ljava/lang/Object;JD)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_4

    .line 308
    .line 309
    :cond_1
    :goto_9
    add-int/lit8 v0, v0, 0x4

    .line 310
    .line 311
    move-object p1, v6

    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_2
    move-object v6, p1

    .line 315
    iget-boolean p1, p0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 316
    .line 317
    if-nez p1, :cond_3

    .line 318
    .line 319
    iget-object p1, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    .line 320
    .line 321
    invoke-static {p1, v6, p2}, Lcom/google/android/gms/internal/clearcut/a0;->a(Lcom/google/android/gms/internal/clearcut/c0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_3
    return-void

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->k:Lcom/google/android/gms/internal/clearcut/Q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->f:Lcom/google/android/gms/internal/clearcut/g;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/clearcut/x;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/clearcut/x;->a(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final e(Lcom/google/android/gms/internal/clearcut/x;Lcom/google/android/gms/internal/clearcut/x;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    const/high16 v9, 0xff00000

    .line 20
    .line 21
    and-int/2addr v5, v9

    .line 22
    ushr-int/lit8 v5, v5, 0x14

    .line 23
    .line 24
    packed-switch v5, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 30
    .line 31
    aget v5, v0, v5

    .line 32
    .line 33
    and-int/2addr v5, v6

    .line 34
    int-to-long v5, v5

    .line 35
    sget-object v9, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 36
    .line 37
    invoke-virtual {v9, v5, v6, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-virtual {v9, v5, v6, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-ne v10, v5, :cond_0

    .line 46
    .line 47
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    :cond_0
    :goto_1
    move v4, v2

    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :pswitch_1
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    goto/16 :goto_2

    .line 77
    .line 78
    :pswitch_2
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_0

    .line 83
    .line 84
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_0

    .line 104
    .line 105
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 106
    .line 107
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    cmp-long v5, v9, v5

    .line 116
    .line 117
    if-eqz v5, :cond_1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_0

    .line 125
    .line 126
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 127
    .line 128
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eq v6, v5, :cond_1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_0

    .line 144
    .line 145
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 146
    .line 147
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v9

    .line 151
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v5

    .line 155
    cmp-long v5, v9, v5

    .line 156
    .line 157
    if-eqz v5, :cond_1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_0

    .line 165
    .line 166
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 167
    .line 168
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eq v6, v5, :cond_1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_0

    .line 184
    .line 185
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 186
    .line 187
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eq v6, v5, :cond_1

    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-eqz v5, :cond_0

    .line 204
    .line 205
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 206
    .line 207
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eq v6, v5, :cond_1

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_0

    .line 224
    .line 225
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_1

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    if-eqz v5, :cond_0

    .line 246
    .line 247
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-nez v5, :cond_1

    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-eqz v5, :cond_0

    .line 268
    .line 269
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/clearcut/a0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-nez v5, :cond_1

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_0

    .line 290
    .line 291
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 292
    .line 293
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->i(JLjava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->i(JLjava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eq v6, v5, :cond_1

    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-eqz v5, :cond_0

    .line 310
    .line 311
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 312
    .line 313
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eq v6, v5, :cond_1

    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_0

    .line 330
    .line 331
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 332
    .line 333
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 334
    .line 335
    .line 336
    move-result-wide v9

    .line 337
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 338
    .line 339
    .line 340
    move-result-wide v5

    .line 341
    cmp-long v5, v9, v5

    .line 342
    .line 343
    if-eqz v5, :cond_1

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_0

    .line 352
    .line 353
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 354
    .line 355
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eq v6, v5, :cond_1

    .line 364
    .line 365
    goto/16 :goto_1

    .line 366
    .line 367
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_0

    .line 372
    .line 373
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 374
    .line 375
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 376
    .line 377
    .line 378
    move-result-wide v9

    .line 379
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 380
    .line 381
    .line 382
    move-result-wide v5

    .line 383
    cmp-long v5, v9, v5

    .line 384
    .line 385
    if-eqz v5, :cond_1

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_0

    .line 394
    .line 395
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 396
    .line 397
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 398
    .line 399
    .line 400
    move-result-wide v9

    .line 401
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v5

    .line 405
    cmp-long v5, v9, v5

    .line 406
    .line 407
    if-eqz v5, :cond_1

    .line 408
    .line 409
    goto/16 :goto_1

    .line 410
    .line 411
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-eqz v5, :cond_0

    .line 416
    .line 417
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 418
    .line 419
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    if-eq v6, v5, :cond_1

    .line 428
    .line 429
    goto/16 :goto_1

    .line 430
    .line 431
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/clearcut/O;->z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-eqz v5, :cond_0

    .line 436
    .line 437
    sget-object v5, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 438
    .line 439
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 440
    .line 441
    .line 442
    move-result-wide v9

    .line 443
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 444
    .line 445
    .line 446
    move-result-wide v5

    .line 447
    cmp-long v5, v9, v5

    .line 448
    .line 449
    if-eqz v5, :cond_1

    .line 450
    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :cond_1
    :goto_2
    if-nez v4, :cond_2

    .line 454
    .line 455
    goto :goto_3

    .line 456
    :cond_2
    add-int/lit8 v3, v3, 0x4

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 466
    .line 467
    iget-object p2, p2, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 468
    .line 469
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/clearcut/b0;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    if-nez p1, :cond_4

    .line 474
    .line 475
    :goto_3
    return v2

    .line 476
    :cond_4
    return v4

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, Lcom/google/android/gms/internal/clearcut/O;->h:[I

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    array-length v4, v3

    .line 11
    if-nez v4, :cond_1

    .line 12
    .line 13
    :cond_0
    move/from16 v16, v2

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_1
    array-length v4, v3

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, -0x1

    .line 20
    move v7, v5

    .line 21
    move v8, v7

    .line 22
    :goto_0
    if-ge v7, v4, :cond_0

    .line 23
    .line 24
    aget v9, v3, v7

    .line 25
    .line 26
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/clearcut/O;->w(I)I

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 31
    .line 32
    .line 33
    move-result v11

    .line 34
    iget-boolean v12, v0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 35
    .line 36
    const v13, 0xfffff

    .line 37
    .line 38
    .line 39
    if-nez v12, :cond_3

    .line 40
    .line 41
    add-int/lit8 v14, v10, 0x2

    .line 42
    .line 43
    iget-object v15, v0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 44
    .line 45
    aget v14, v15, v14

    .line 46
    .line 47
    and-int v15, v14, v13

    .line 48
    .line 49
    ushr-int/lit8 v14, v14, 0x14

    .line 50
    .line 51
    shl-int v14, v2, v14

    .line 52
    .line 53
    if-eq v15, v6, :cond_2

    .line 54
    .line 55
    sget-object v6, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    .line 56
    .line 57
    move/from16 v16, v2

    .line 58
    .line 59
    move-object/from16 v17, v3

    .line 60
    .line 61
    int-to-long v2, v15

    .line 62
    invoke-virtual {v6, v1, v2, v3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    move v6, v15

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move/from16 v16, v2

    .line 69
    .line 70
    move-object/from16 v17, v3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move/from16 v16, v2

    .line 74
    .line 75
    move-object/from16 v17, v3

    .line 76
    .line 77
    move v14, v5

    .line 78
    :goto_1
    const/high16 v2, 0x10000000

    .line 79
    .line 80
    and-int/2addr v2, v11

    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    if-eqz v12, :cond_4

    .line 84
    .line 85
    invoke-virtual {v0, v10, v1}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    and-int v2, v8, v14

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    move/from16 v2, v16

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move v2, v5

    .line 98
    :goto_2
    if-nez v2, :cond_6

    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_6
    const/high16 v2, 0xff00000

    .line 103
    .line 104
    and-int/2addr v2, v11

    .line 105
    ushr-int/lit8 v2, v2, 0x14

    .line 106
    .line 107
    const/16 v3, 0x9

    .line 108
    .line 109
    if-eq v2, v3, :cond_c

    .line 110
    .line 111
    const/16 v3, 0x11

    .line 112
    .line 113
    if-eq v2, v3, :cond_c

    .line 114
    .line 115
    const/16 v3, 0x1b

    .line 116
    .line 117
    if-eq v2, v3, :cond_a

    .line 118
    .line 119
    const/16 v3, 0x3c

    .line 120
    .line 121
    if-eq v2, v3, :cond_9

    .line 122
    .line 123
    const/16 v3, 0x44

    .line 124
    .line 125
    if-eq v2, v3, :cond_9

    .line 126
    .line 127
    const/16 v3, 0x31

    .line 128
    .line 129
    if-eq v2, v3, :cond_a

    .line 130
    .line 131
    const/16 v3, 0x32

    .line 132
    .line 133
    if-eq v2, v3, :cond_7

    .line 134
    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_7
    and-int v2, v11, v13

    .line 138
    .line 139
    int-to-long v2, v2

    .line 140
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-object v3, v0, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast v2, Lcom/google/android/gms/internal/clearcut/K;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_8

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_8
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/clearcut/O;->t(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    new-instance v1, Ljava/lang/NoSuchMethodError;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_9
    invoke-virtual {v0, v9, v10, v1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_f

    .line 173
    .line 174
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    and-int v3, v11, v13

    .line 179
    .line 180
    int-to-long v9, v3

    .line 181
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/clearcut/Z;->f(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_f

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    and-int v2, v11, v13

    .line 193
    .line 194
    int-to-long v2, v2

    .line 195
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_f

    .line 206
    .line 207
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    move v9, v5

    .line 212
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-ge v9, v10, :cond_f

    .line 217
    .line 218
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-interface {v3, v10}, Lcom/google/android/gms/internal/clearcut/Z;->f(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    if-nez v10, :cond_b

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_c
    if-eqz v12, :cond_d

    .line 233
    .line 234
    invoke-virtual {v0, v10, v1}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    goto :goto_4

    .line 239
    :cond_d
    and-int v2, v8, v14

    .line 240
    .line 241
    if-eqz v2, :cond_e

    .line 242
    .line 243
    move/from16 v2, v16

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_e
    move v2, v5

    .line 247
    :goto_4
    if-eqz v2, :cond_f

    .line 248
    .line 249
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    and-int v3, v11, v13

    .line 254
    .line 255
    int-to-long v9, v3

    .line 256
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/clearcut/Z;->f(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-nez v2, :cond_f

    .line 265
    .line 266
    :goto_5
    return v5

    .line 267
    :cond_f
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 268
    .line 269
    move/from16 v2, v16

    .line 270
    .line 271
    move-object/from16 v3, v17

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :goto_7
    return v16
.end method

.method public final g(Lcom/google/android/gms/internal/clearcut/x;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    const/high16 v8, 0xff00000

    .line 20
    .line 21
    and-int/2addr v4, v8

    .line 22
    ushr-int/lit8 v4, v4, 0x14

    .line 23
    .line 24
    const/16 v8, 0x4d5

    .line 25
    .line 26
    const/16 v9, 0x4cf

    .line 27
    .line 28
    const/16 v10, 0x25

    .line 29
    .line 30
    packed-switch v4, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_a

    .line 34
    .line 35
    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    :goto_1
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    mul-int/lit8 v3, v3, 0x35

    .line 46
    .line 47
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    :goto_3
    add-int/2addr v4, v3

    .line 52
    move v3, v4

    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    :goto_4
    mul-int/lit8 v3, v3, 0x35

    .line 62
    .line 63
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/O;->B(JLjava/lang/Object;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    :goto_5
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/clearcut/y;->b(J)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    goto :goto_3

    .line 72
    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    :goto_6
    mul-int/lit8 v3, v3, 0x35

    .line 79
    .line 80
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/O;->A(JLjava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    goto :goto_3

    .line 85
    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_2

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_2

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_2

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_2

    .line 118
    .line 119
    :pswitch_8
    mul-int/lit8 v3, v3, 0x35

    .line 120
    .line 121
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_2

    .line 126
    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_2

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    mul-int/lit8 v3, v3, 0x35

    .line 140
    .line 141
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    goto :goto_3

    .line 152
    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_2

    .line 157
    .line 158
    mul-int/lit8 v3, v3, 0x35

    .line 159
    .line 160
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    sget-object v5, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 171
    .line 172
    if-eqz v4, :cond_0

    .line 173
    .line 174
    :goto_7
    move v8, v9

    .line 175
    :cond_0
    add-int/2addr v8, v3

    .line 176
    move v3, v8

    .line 177
    goto/16 :goto_a

    .line 178
    .line 179
    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_2

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_2

    .line 191
    .line 192
    goto/16 :goto_4

    .line 193
    .line 194
    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_2

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_2

    .line 206
    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_2

    .line 214
    .line 215
    goto/16 :goto_4

    .line 216
    .line 217
    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_2

    .line 222
    .line 223
    mul-int/lit8 v3, v3, 0x35

    .line 224
    .line 225
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Ljava/lang/Float;

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :pswitch_12
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_2

    .line 246
    .line 247
    mul-int/lit8 v3, v3, 0x35

    .line 248
    .line 249
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Ljava/lang/Double;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 256
    .line 257
    .line 258
    move-result-wide v4

    .line 259
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 260
    .line 261
    .line 262
    move-result-wide v4

    .line 263
    goto/16 :goto_5

    .line 264
    .line 265
    :pswitch_13
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-eqz v4, :cond_1

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    :cond_1
    :goto_8
    mul-int/lit8 v3, v3, 0x35

    .line 276
    .line 277
    add-int/2addr v3, v10

    .line 278
    goto :goto_a

    .line 279
    :pswitch_14
    mul-int/lit8 v3, v3, 0x35

    .line 280
    .line 281
    sget-object v4, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 282
    .line 283
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    :goto_9
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/clearcut/y;->b(J)I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    goto/16 :goto_3

    .line 292
    .line 293
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 294
    .line 295
    sget-object v4, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 296
    .line 297
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 304
    .line 305
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :pswitch_17
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    if-eqz v4, :cond_1

    .line 320
    .line 321
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    goto :goto_8

    .line 326
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 327
    .line 328
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    check-cast v4, Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    goto/16 :goto_3

    .line 339
    .line 340
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 341
    .line 342
    sget-object v4, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 343
    .line 344
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/h0;->i(JLjava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    sget-object v5, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 349
    .line 350
    if-eqz v4, :cond_0

    .line 351
    .line 352
    goto/16 :goto_7

    .line 353
    .line 354
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 355
    .line 356
    sget-object v4, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 357
    .line 358
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/h0;->j(JLjava/lang/Object;)F

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    goto/16 :goto_3

    .line 367
    .line 368
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 369
    .line 370
    sget-object v4, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 371
    .line 372
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/clearcut/h0;->k(JLjava/lang/Object;)D

    .line 373
    .line 374
    .line 375
    move-result-wide v4

    .line 376
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 377
    .line 378
    .line 379
    move-result-wide v4

    .line 380
    goto :goto_9

    .line 381
    :cond_2
    :goto_a
    add-int/lit8 v2, v2, 0x4

    .line 382
    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 386
    .line 387
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 393
    .line 394
    invoke-virtual {p1}, Lcom/google/android/gms/internal/clearcut/b0;->hashCode()I

    .line 395
    .line 396
    .line 397
    move-result p1

    .line 398
    add-int/2addr p1, v3

    .line 399
    return p1

    .line 400
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_14
        :pswitch_14
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v3, p7

    move-wide/from16 v9, p10

    move/from16 v4, p12

    sget-object v11, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    add-int/lit8 v5, v4, 0x2

    iget-object v6, v0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    aget v5, v6, v5

    const v6, 0xfffff

    and-int/2addr v5, v6

    int-to-long v12, v5

    const/4 v5, 0x5

    const/4 v14, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    packed-switch p9, :pswitch_data_0

    :cond_0
    move/from16 v15, p3

    goto/16 :goto_e

    :pswitch_0
    const/4 v5, 0x3

    if-ne v3, v5, :cond_0

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v6, v2, 0x4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/clearcut/O;->i(Lcom/google/android/gms/internal/clearcut/Z;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    move-object v5, v7

    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_1

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_1
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    if-nez v14, :cond_2

    :goto_0
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_d

    :cond_2
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    move-result-object v3

    goto :goto_0

    :pswitch_1
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    ushr-long v5, v3, v6

    const-wide/16 v14, 0x1

    and-long/2addr v3, v14

    neg-long v3, v3

    xor-long/2addr v3, v5

    .line 1
    :goto_1
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_2
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_2
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    ushr-int/lit8 v4, v3, 0x1

    and-int/2addr v3, v6

    neg-int v3, v3

    xor-int/2addr v3, v4

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_2

    :pswitch_3
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    iget v5, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/clearcut/O;->u(I)Lcom/google/android/gms/internal/clearcut/z;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/clearcut/z;->e(I)Lcom/google/android/gms/internal/clearcut/p0;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_4

    .line 2
    :cond_3
    check-cast v1, Lcom/google/android/gms/internal/clearcut/x;

    iget-object v4, v1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    sget-object v6, Lcom/google/android/gms/internal/clearcut/b0;->e:Lcom/google/android/gms/internal/clearcut/b0;

    if-ne v4, v6, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    move-result-object v4

    iput-object v4, v1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    :cond_4
    int-to-long v5, v5

    .line 3
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v2, v1}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    return v3

    :cond_5
    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v2, v3

    goto/16 :goto_d

    :pswitch_4
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_d

    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v3, :cond_6

    sget-object v3, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-static {v14, v2, v3}, Lcom/google/android/gms/internal/clearcut/m;->g([BII)Lcom/google/android/gms/internal/clearcut/m;

    move-result-object v4

    invoke-virtual {v11, v1, v9, v10, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_5
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_d

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    move-result-object v3

    move/from16 v4, p4

    invoke-static {v3, v2, v15, v4, v5}, Lcom/google/android/gms/internal/clearcut/O;->j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_7

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_7
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    if-nez v14, :cond_8

    :goto_6
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :cond_8
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    move-result-object v3

    goto :goto_6

    :goto_7
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_6
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_d

    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    iget v4, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v4, :cond_9

    const-string v2, ""

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :cond_9
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_b

    add-int v5, v3, v4

    .line 4
    sget-object v6, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    invoke-virtual {v6, v2, v3, v5}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_8

    .line 5
    :cond_a
    new-instance v1, Lcom/google/android/gms/internal/clearcut/B;

    const-string v2, "Protocol message had invalid UTF-8."

    .line 6
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 7
    throw v1

    :cond_b
    :goto_8
    new-instance v5, Ljava/lang/String;

    sget-object v6, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v11, v1, v9, v10, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v3, v4

    :goto_9
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v3

    :pswitch_7
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    const-wide/16 v14, 0x0

    cmp-long v3, v3, v14

    if-eqz v3, :cond_c

    goto :goto_a

    :cond_c
    const/4 v6, 0x0

    :goto_a
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_d

    invoke-static {v15, v2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_b
    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v15, 0x4

    goto :goto_d

    :pswitch_9
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_d

    invoke-static {v15, v2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_c
    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v15, 0x8

    goto :goto_d

    :pswitch_a
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_d

    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_d

    .line 8
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 9
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_b

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_d

    .line 10
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    .line 11
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_d
    :goto_e
    return v15

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I
    .locals 11

    move/from16 v0, p5

    move/from16 v1, p7

    move/from16 v2, p8

    move-wide/from16 v3, p12

    sget-object v5, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/clearcut/A;

    move-object v7, v6

    check-cast v7, Lcom/google/android/gms/internal/clearcut/h;

    .line 1
    iget-boolean v7, v7, Lcom/google/android/gms/internal/clearcut/h;->q:Z

    const/4 v8, 0x1

    if-nez v7, :cond_1

    .line 2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_0

    const/16 v7, 0xa

    goto :goto_0

    :cond_0
    shl-int/2addr v7, v8

    :goto_0
    invoke-interface {v6, v7}, Lcom/google/android/gms/internal/clearcut/A;->n(I)Lcom/google/android/gms/internal/clearcut/A;

    move-result-object v6

    invoke-virtual {v5, p1, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v3, 0x3

    const/4 v4, 0x5

    const/4 v5, 0x2

    const/4 v7, 0x0

    packed-switch p11, :pswitch_data_0

    goto/16 :goto_f

    :pswitch_0
    if-ne v1, v3, :cond_53

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    move-result-object p1

    and-int/lit8 v1, v0, -0x8

    or-int/lit8 v1, v1, 0x4

    move-object/from16 p6, p1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move-object/from16 p11, p14

    move/from16 p10, v1

    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/clearcut/O;->i(Lcom/google/android/gms/internal/clearcut/Z;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    move-object/from16 v4, p6

    move/from16 v5, p10

    move-object/from16 v3, p11

    iget-object v7, v3, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge p1, p4, :cond_2

    invoke-static {p2, p1, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    iget v8, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v8, :cond_2

    move-object/from16 p7, p2

    move/from16 p9, p4

    move-object/from16 p11, v3

    move-object/from16 p6, v4

    move/from16 p10, v5

    move/from16 p8, v7

    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/clearcut/O;->i(Lcom/google/android/gms/internal/clearcut/Z;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    move-object/from16 v1, p6

    move-object/from16 v8, p11

    iget-object v2, v8, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v4, v1

    move-object v3, v8

    goto :goto_1

    :cond_2
    return p1

    :pswitch_1
    move-object/from16 v8, p14

    if-ne v1, v5, :cond_6

    if-nez v6, :cond_5

    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    iget v0, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v0, p1

    if-lt p1, v0, :cond_4

    if-ne p1, v0, :cond_3

    return p1

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_4
    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_6
    if-eqz v1, :cond_7

    goto/16 :goto_f

    :cond_7
    if-nez v6, :cond_8

    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_8
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_2
    move-object/from16 v8, p14

    if-ne v1, v5, :cond_c

    if-nez v6, :cond_b

    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    iget v0, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v0, p1

    if-lt p1, v0, :cond_a

    if-ne p1, v0, :cond_9

    return p1

    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_a
    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_b
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_c
    if-eqz v1, :cond_d

    goto/16 :goto_f

    :cond_d
    if-nez v6, :cond_e

    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_e
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_3
    move-object/from16 v8, p14

    if-ne v1, v5, :cond_1d

    if-nez v6, :cond_1c

    .line 3
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_1b

    if-ne v0, v1, :cond_1a

    .line 4
    check-cast p1, Lcom/google/android/gms/internal/clearcut/x;

    iget-object p2, p1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    sget-object v1, Lcom/google/android/gms/internal/clearcut/b0;->e:Lcom/google/android/gms/internal/clearcut/b0;

    if-ne p2, v1, :cond_f

    goto :goto_2

    :cond_f
    move-object v7, p2

    :goto_2
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/clearcut/O;->u(I)Lcom/google/android/gms/internal/clearcut/z;

    move-result-object p2

    sget-object v1, Lcom/google/android/gms/internal/clearcut/a0;->a:Ljava/lang/Class;

    if-nez p2, :cond_10

    goto/16 :goto_6

    .line 5
    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->m:Lcom/google/android/gms/internal/clearcut/c0;

    if-eqz v6, :cond_15

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_3
    if-ge v4, v2, :cond_14

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {p2, v9}, Lcom/google/android/gms/internal/clearcut/z;->e(I)Lcom/google/android/gms/internal/clearcut/p0;

    move-result-object v10

    if-eqz v10, :cond_12

    if-eq v4, v5, :cond_11

    invoke-interface {v6, v5, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_12
    if-nez v7, :cond_13

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    move-result-object v7

    :cond_13
    int-to-long v8, v9

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v10, p6, 0x3

    .line 9
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v10, v8}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_14
    if-eq v5, v2, :cond_18

    .line 10
    invoke-interface {v6, v5, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    goto :goto_6

    :cond_15
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_16
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {p2, v4}, Lcom/google/android/gms/internal/clearcut/z;->e(I)Lcom/google/android/gms/internal/clearcut/p0;

    move-result-object v5

    if-nez v5, :cond_16

    if-nez v7, :cond_17

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    move-result-object v7

    :cond_17
    int-to-long v4, v4

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v6, p6, 0x3

    .line 14
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v6, v4}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 15
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    :cond_18
    :goto_6
    if-eqz v7, :cond_19

    .line 16
    iput-object v7, p1, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    :cond_19
    return v0

    .line 17
    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_1b
    invoke-static {p2, v0, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_1c
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_1d
    if-eqz v1, :cond_1e

    goto/16 :goto_f

    :cond_1e
    if-nez v6, :cond_1f

    .line 18
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_1f
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_4
    move-object/from16 v8, p14

    if-ne v1, v5, :cond_53

    .line 19
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v1, :cond_20

    :goto_7
    sget-object v1, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_20
    invoke-static {p2, p1, v1}, Lcom/google/android/gms/internal/clearcut/m;->g([BII)Lcom/google/android/gms/internal/clearcut/m;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr p1, v1

    :goto_8
    if-ge p1, p4, :cond_21

    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    iget v2, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v2, :cond_21

    invoke-static {p2, v1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v1, :cond_20

    goto :goto_7

    :cond_21
    return p1

    :pswitch_5
    move-object/from16 v8, p14

    if-ne v1, v5, :cond_53

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    move-result-object p1

    move-object/from16 p6, p1

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move/from16 p7, v0

    move-object/from16 p11, v6

    move-object/from16 p12, v8

    invoke-static/range {p6 .. p12}, Lcom/google/android/gms/internal/clearcut/O;->h(Lcom/google/android/gms/internal/clearcut/Z;I[BIILcom/google/android/gms/internal/clearcut/A;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    return p1

    :pswitch_6
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_53

    const-wide/32 v4, 0x20000000

    and-long v4, p9, v4

    const-wide/16 v7, 0x0

    cmp-long v1, v4, v7

    const-string v4, ""

    if-nez v1, :cond_25

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    iget v5, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v5, :cond_22

    :goto_9
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_22
    new-instance v7, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, p2, v1, v5, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_a
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v5

    :goto_b
    if-ge v1, p4, :cond_24

    invoke-static {p2, v1, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    iget v7, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v7, :cond_24

    invoke-static {p2, v5, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    iget v5, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v5, :cond_23

    goto :goto_9

    :cond_23
    new-instance v7, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, p2, v1, v5, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_a

    :cond_24
    return v1

    :cond_25
    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    iget v5, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    const-string v7, "Protocol message had invalid UTF-8."

    if-nez v5, :cond_26

    :goto_c
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_26
    add-int v8, v1, v5

    .line 20
    sget-object v9, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    invoke-virtual {v9, p2, v1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    move-result v9

    if-eqz v9, :cond_2a

    .line 21
    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, p2, v1, v5, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_d
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v8

    :goto_e
    if-ge v1, p4, :cond_29

    invoke-static {p2, v1, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    iget v8, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v8, :cond_29

    invoke-static {p2, v5, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    iget v5, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v5, :cond_27

    goto :goto_c

    :cond_27
    add-int v8, v1, v5

    .line 22
    sget-object v9, Lcom/google/android/gms/internal/clearcut/k0;->a:Lcom/google/android/gms/internal/clearcut/l0;

    invoke-virtual {v9, p2, v1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->t([BII)Z

    move-result v9

    if-eqz v9, :cond_28

    .line 23
    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, p2, v1, v5, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_d

    .line 24
    :cond_28
    new-instance p1, Lcom/google/android/gms/internal/clearcut/B;

    .line 25
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1

    :cond_29
    return v1

    .line 27
    :cond_2a
    new-instance p1, Lcom/google/android/gms/internal/clearcut/B;

    .line 28
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    throw p1

    :pswitch_7
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_2e

    if-nez v6, :cond_2d

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_2c

    if-ne v0, v1, :cond_2b

    return v0

    :cond_2b
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_2c
    invoke-static {p2, v0, v3}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_2d
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2e
    if-eqz v1, :cond_2f

    goto/16 :goto_f

    :cond_2f
    if-nez v6, :cond_30

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_30
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_8
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_34

    if-nez v6, :cond_33

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_32

    if-ne v0, v1, :cond_31

    return v0

    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_32
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    throw v7

    :cond_33
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_34
    if-eq v1, v4, :cond_35

    goto/16 :goto_f

    :cond_35
    if-nez v6, :cond_36

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    throw v7

    :cond_36
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_9
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_3a

    if-nez v6, :cond_39

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_38

    if-ne v0, v1, :cond_37

    return v0

    :cond_37
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_38
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    throw v7

    :cond_39
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_3a
    if-eq v1, v8, :cond_3b

    goto/16 :goto_f

    :cond_3b
    if-nez v6, :cond_3c

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    throw v7

    :cond_3c
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_a
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_40

    if-nez v6, :cond_3f

    .line 30
    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_3e

    if-ne v0, v1, :cond_3d

    return v0

    :cond_3d
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_3e
    invoke-static {p2, v0, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_3f
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_40
    if-eqz v1, :cond_41

    goto/16 :goto_f

    :cond_41
    if-nez v6, :cond_42

    .line 31
    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_42
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_b
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_46

    if-nez v6, :cond_45

    .line 32
    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_44

    if-ne v0, v1, :cond_43

    return v0

    :cond_43
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    :cond_44
    invoke-static {p2, v0, v3}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_45
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_46
    if-eqz v1, :cond_47

    goto :goto_f

    :cond_47
    if-nez v6, :cond_48

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    throw v7

    :cond_48
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_c
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_4c

    if-nez v6, :cond_4b

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_4a

    if-ne v0, v1, :cond_49

    return v0

    :cond_49
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    .line 33
    :cond_4a
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    throw v7

    :cond_4b
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_4c
    if-eq v1, v4, :cond_4d

    goto :goto_f

    :cond_4d
    if-nez v6, :cond_4e

    .line 35
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    throw v7

    :cond_4e
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_d
    move-object/from16 v3, p14

    if-ne v1, v5, :cond_52

    if-nez v6, :cond_51

    invoke-static {p2, p3, v3}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    iget v1, v3, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_50

    if-ne v0, v1, :cond_4f

    return v0

    :cond_4f
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->a()Lcom/google/android/gms/internal/clearcut/B;

    move-result-object p1

    throw p1

    .line 37
    :cond_50
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 38
    throw v7

    :cond_51
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_52
    if-eq v1, v8, :cond_54

    :cond_53
    :goto_f
    return p3

    :cond_54
    if-nez v6, :cond_55

    .line 39
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 40
    throw v7

    :cond_55
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/clearcut/j;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v13, p6

    .line 10
    .line 11
    sget-object v9, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    .line 12
    .line 13
    const/4 v10, -0x1

    .line 14
    const/16 v16, 0x0

    .line 15
    .line 16
    move/from16 v3, p3

    .line 17
    .line 18
    move v8, v10

    .line 19
    move/from16 v5, v16

    .line 20
    .line 21
    move v11, v5

    .line 22
    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 23
    .line 24
    const v17, 0xfffff

    .line 25
    .line 26
    .line 27
    if-ge v3, v4, :cond_21

    .line 28
    .line 29
    add-int/lit8 v5, v3, 0x1

    .line 30
    .line 31
    aget-byte v3, v1, v3

    .line 32
    .line 33
    if-gez v3, :cond_0

    .line 34
    .line 35
    invoke-static {v3, v1, v5, v13}, Lcom/google/android/gms/internal/clearcut/l0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 40
    .line 41
    :cond_0
    move v12, v3

    .line 42
    move v3, v5

    .line 43
    move-object v5, v6

    .line 44
    ushr-int/lit8 v6, v12, 0x3

    .line 45
    .line 46
    and-int/lit8 v7, v12, 0x7

    .line 47
    .line 48
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/clearcut/O;->w(I)I

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    sget-object v15, Lcom/google/android/gms/internal/clearcut/b0;->e:Lcom/google/android/gms/internal/clearcut/b0;

    .line 53
    .line 54
    if-eq v14, v10, :cond_1d

    .line 55
    .line 56
    add-int/lit8 v18, v14, 0x1

    .line 57
    .line 58
    aget v10, v5, v18

    .line 59
    .line 60
    const/high16 v18, 0xff00000

    .line 61
    .line 62
    and-int v18, v10, v18

    .line 63
    .line 64
    ushr-int/lit8 v1, v18, 0x14

    .line 65
    .line 66
    move/from16 p3, v3

    .line 67
    .line 68
    and-int v3, v10, v17

    .line 69
    .line 70
    move/from16 v18, v12

    .line 71
    .line 72
    int-to-long v12, v3

    .line 73
    const/16 v3, 0x11

    .line 74
    .line 75
    if-gt v1, v3, :cond_13

    .line 76
    .line 77
    add-int/lit8 v3, v14, 0x2

    .line 78
    .line 79
    aget v3, v5, v3

    .line 80
    .line 81
    ushr-int/lit8 v20, v3, 0x14

    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    shl-int v20, v4, v20

    .line 85
    .line 86
    and-int v3, v3, v17

    .line 87
    .line 88
    if-eq v3, v8, :cond_2

    .line 89
    .line 90
    move/from16 v22, v10

    .line 91
    .line 92
    const/4 v10, -0x1

    .line 93
    move/from16 v23, v4

    .line 94
    .line 95
    move-object/from16 v19, v5

    .line 96
    .line 97
    if-eq v8, v10, :cond_1

    .line 98
    .line 99
    int-to-long v4, v8

    .line 100
    invoke-virtual {v9, v2, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 101
    .line 102
    .line 103
    :cond_1
    int-to-long v4, v3

    .line 104
    invoke-virtual {v9, v2, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    move v11, v3

    .line 109
    move/from16 v24, v4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move/from16 v23, v4

    .line 113
    .line 114
    move-object/from16 v19, v5

    .line 115
    .line 116
    move/from16 v22, v10

    .line 117
    .line 118
    const/4 v10, -0x1

    .line 119
    move/from16 v24, v11

    .line 120
    .line 121
    move v11, v8

    .line 122
    :goto_1
    const/4 v3, 0x5

    .line 123
    packed-switch v1, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    :cond_3
    move-object/from16 v8, p2

    .line 127
    .line 128
    move/from16 v12, p3

    .line 129
    .line 130
    move-object/from16 v13, p6

    .line 131
    .line 132
    :goto_2
    move-object v14, v9

    .line 133
    move/from16 v9, p4

    .line 134
    .line 135
    goto/16 :goto_10

    .line 136
    .line 137
    :pswitch_0
    const/4 v1, 0x3

    .line 138
    if-ne v7, v1, :cond_3

    .line 139
    .line 140
    shl-int/lit8 v1, v6, 0x3

    .line 141
    .line 142
    or-int/lit8 v7, v1, 0x4

    .line 143
    .line 144
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    move-object/from16 v4, p2

    .line 149
    .line 150
    move/from16 v5, p3

    .line 151
    .line 152
    move/from16 v6, p4

    .line 153
    .line 154
    move-object/from16 v8, p6

    .line 155
    .line 156
    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/clearcut/O;->i(Lcom/google/android/gms/internal/clearcut/Z;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    move-object v14, v8

    .line 161
    move-object v8, v4

    .line 162
    and-int v1, v24, v20

    .line 163
    .line 164
    if-nez v1, :cond_4

    .line 165
    .line 166
    iget-object v1, v14, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 167
    .line 168
    :goto_3
    invoke-virtual {v9, v2, v12, v13, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    invoke-virtual {v9, v2, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v4, v14, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    goto :goto_3

    .line 183
    :goto_4
    or-int v1, v24, v20

    .line 184
    .line 185
    move v4, v11

    .line 186
    move v11, v1

    .line 187
    move-object v1, v8

    .line 188
    move v8, v4

    .line 189
    move/from16 v4, p4

    .line 190
    .line 191
    move-object v13, v14

    .line 192
    :goto_5
    move/from16 v5, v18

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :pswitch_1
    move-object/from16 v8, p2

    .line 197
    .line 198
    move/from16 v1, p3

    .line 199
    .line 200
    move-object/from16 v14, p6

    .line 201
    .line 202
    if-nez v7, :cond_5

    .line 203
    .line 204
    invoke-static {v8, v1, v14}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    iget-wide v3, v14, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 209
    .line 210
    ushr-long v5, v3, v23

    .line 211
    .line 212
    const-wide/16 v21, 0x1

    .line 213
    .line 214
    and-long v3, v3, v21

    .line 215
    .line 216
    neg-long v3, v3

    .line 217
    xor-long/2addr v5, v3

    .line 218
    move-object v1, v9

    .line 219
    move-wide v3, v12

    .line 220
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 221
    .line 222
    .line 223
    move-object v4, v1

    .line 224
    or-int v1, v24, v20

    .line 225
    .line 226
    move v3, v11

    .line 227
    move v11, v1

    .line 228
    move-object v1, v8

    .line 229
    move v8, v3

    .line 230
    move-object v9, v4

    .line 231
    move v3, v7

    .line 232
    :goto_6
    move-object v13, v14

    .line 233
    move/from16 v5, v18

    .line 234
    .line 235
    move/from16 v4, p4

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_5
    move v12, v1

    .line 240
    move-object v13, v14

    .line 241
    goto :goto_2

    .line 242
    :pswitch_2
    move-object/from16 v8, p2

    .line 243
    .line 244
    move/from16 v1, p3

    .line 245
    .line 246
    move-object/from16 v14, p6

    .line 247
    .line 248
    move-object v4, v9

    .line 249
    if-nez v7, :cond_6

    .line 250
    .line 251
    invoke-static {v8, v1, v14}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    iget v1, v14, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 256
    .line 257
    ushr-int/lit8 v5, v1, 0x1

    .line 258
    .line 259
    and-int/lit8 v1, v1, 0x1

    .line 260
    .line 261
    neg-int v1, v1

    .line 262
    xor-int/2addr v1, v5

    .line 263
    invoke-virtual {v4, v2, v12, v13, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 264
    .line 265
    .line 266
    or-int v1, v24, v20

    .line 267
    .line 268
    move v5, v11

    .line 269
    move v11, v1

    .line 270
    move-object v1, v8

    .line 271
    move v8, v5

    .line 272
    move-object v9, v4

    .line 273
    goto :goto_6

    .line 274
    :cond_6
    move/from16 v9, p4

    .line 275
    .line 276
    move v12, v1

    .line 277
    move-object v13, v14

    .line 278
    :goto_7
    move-object v14, v4

    .line 279
    goto/16 :goto_10

    .line 280
    .line 281
    :pswitch_3
    move-object/from16 v8, p2

    .line 282
    .line 283
    move/from16 v1, p3

    .line 284
    .line 285
    move-object/from16 v5, p6

    .line 286
    .line 287
    move-object v4, v9

    .line 288
    move/from16 v9, p4

    .line 289
    .line 290
    if-nez v7, :cond_a

    .line 291
    .line 292
    invoke-static {v8, v1, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    iget v1, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 297
    .line 298
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/clearcut/O;->u(I)Lcom/google/android/gms/internal/clearcut/z;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    if-eqz v6, :cond_7

    .line 303
    .line 304
    invoke-interface {v6, v1}, Lcom/google/android/gms/internal/clearcut/z;->e(I)Lcom/google/android/gms/internal/clearcut/p0;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    if-eqz v6, :cond_8

    .line 309
    .line 310
    :cond_7
    move/from16 v6, v18

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_8
    move-object v6, v2

    .line 314
    check-cast v6, Lcom/google/android/gms/internal/clearcut/x;

    .line 315
    .line 316
    iget-object v7, v6, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 317
    .line 318
    if-ne v7, v15, :cond_9

    .line 319
    .line 320
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    iput-object v7, v6, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 325
    .line 326
    :cond_9
    int-to-long v12, v1

    .line 327
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    move/from16 v6, v18

    .line 332
    .line 333
    invoke-virtual {v7, v6, v1}, Lcom/google/android/gms/internal/clearcut/b0;->a(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    move v1, v9

    .line 337
    move-object v9, v4

    .line 338
    move v4, v1

    .line 339
    move-object v13, v5

    .line 340
    move v5, v6

    .line 341
    move-object v1, v8

    .line 342
    move v8, v11

    .line 343
    move/from16 v11, v24

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :goto_8
    invoke-virtual {v4, v2, v12, v13, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 348
    .line 349
    .line 350
    :goto_9
    or-int v1, v24, v20

    .line 351
    .line 352
    move v13, v11

    .line 353
    move v11, v1

    .line 354
    move-object v1, v8

    .line 355
    move v8, v13

    .line 356
    move v13, v9

    .line 357
    move-object v9, v4

    .line 358
    move v4, v13

    .line 359
    move-object v13, v5

    .line 360
    move v5, v6

    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :cond_a
    move v12, v1

    .line 364
    move-object v14, v4

    .line 365
    move-object v13, v5

    .line 366
    goto/16 :goto_10

    .line 367
    .line 368
    :pswitch_4
    move-object/from16 v8, p2

    .line 369
    .line 370
    move/from16 v1, p3

    .line 371
    .line 372
    move-object/from16 v5, p6

    .line 373
    .line 374
    move-object v4, v9

    .line 375
    move/from16 v6, v18

    .line 376
    .line 377
    const/4 v3, 0x2

    .line 378
    move/from16 v9, p4

    .line 379
    .line 380
    if-ne v7, v3, :cond_b

    .line 381
    .line 382
    invoke-static {v8, v1, v5}, Lcom/google/android/gms/internal/clearcut/l0;->s([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    :goto_a
    iget-object v1, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 387
    .line 388
    :goto_b
    invoke-virtual {v4, v2, v12, v13, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_b
    move v12, v1

    .line 393
    move-object v14, v4

    .line 394
    move-object v13, v5

    .line 395
    move/from16 v18, v6

    .line 396
    .line 397
    goto/16 :goto_10

    .line 398
    .line 399
    :pswitch_5
    move-object/from16 v8, p2

    .line 400
    .line 401
    move/from16 v1, p3

    .line 402
    .line 403
    move-object/from16 v5, p6

    .line 404
    .line 405
    move-object v4, v9

    .line 406
    move/from16 v6, v18

    .line 407
    .line 408
    const/4 v3, 0x2

    .line 409
    move/from16 v9, p4

    .line 410
    .line 411
    if-ne v7, v3, :cond_b

    .line 412
    .line 413
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-static {v3, v8, v1, v9, v5}, Lcom/google/android/gms/internal/clearcut/O;->j(Lcom/google/android/gms/internal/clearcut/Z;[BIILcom/google/android/gms/internal/clearcut/j;)I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    and-int v1, v24, v20

    .line 422
    .line 423
    if-nez v1, :cond_c

    .line 424
    .line 425
    iget-object v1, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_c
    invoke-virtual {v4, v2, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    iget-object v7, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 433
    .line 434
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    goto :goto_b

    .line 439
    :pswitch_6
    move-object/from16 v8, p2

    .line 440
    .line 441
    move/from16 v1, p3

    .line 442
    .line 443
    move-object/from16 v5, p6

    .line 444
    .line 445
    move-object v4, v9

    .line 446
    move/from16 v6, v18

    .line 447
    .line 448
    const/4 v3, 0x2

    .line 449
    move/from16 v9, p4

    .line 450
    .line 451
    if-ne v7, v3, :cond_b

    .line 452
    .line 453
    const/high16 v3, 0x20000000

    .line 454
    .line 455
    and-int v3, v22, v3

    .line 456
    .line 457
    if-nez v3, :cond_e

    .line 458
    .line 459
    invoke-static {v8, v1, v5}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 464
    .line 465
    if-nez v3, :cond_d

    .line 466
    .line 467
    const-string v3, ""

    .line 468
    .line 469
    iput-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_d
    new-instance v7, Ljava/lang/String;

    .line 473
    .line 474
    sget-object v14, Lcom/google/android/gms/internal/clearcut/y;->a:Ljava/nio/charset/Charset;

    .line 475
    .line 476
    invoke-direct {v7, v8, v1, v3, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 477
    .line 478
    .line 479
    iput-object v7, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 480
    .line 481
    add-int/2addr v1, v3

    .line 482
    :goto_c
    move v3, v1

    .line 483
    goto :goto_a

    .line 484
    :cond_e
    invoke-static {v8, v1, v5}, Lcom/google/android/gms/internal/clearcut/l0;->q([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    goto :goto_c

    .line 489
    :pswitch_7
    move-object/from16 v8, p2

    .line 490
    .line 491
    move/from16 v1, p3

    .line 492
    .line 493
    move-object/from16 v5, p6

    .line 494
    .line 495
    move-object v4, v9

    .line 496
    move/from16 v6, v18

    .line 497
    .line 498
    move/from16 v9, p4

    .line 499
    .line 500
    if-nez v7, :cond_b

    .line 501
    .line 502
    invoke-static {v8, v1, v5}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    iget-wide v14, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 507
    .line 508
    const-wide/16 v17, 0x0

    .line 509
    .line 510
    cmp-long v1, v14, v17

    .line 511
    .line 512
    if-eqz v1, :cond_f

    .line 513
    .line 514
    move/from16 v1, v23

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_f
    move/from16 v1, v16

    .line 518
    .line 519
    :goto_d
    sget-object v7, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 520
    .line 521
    invoke-virtual {v7, v2, v12, v13, v1}, Lcom/google/android/gms/internal/clearcut/h0;->f(Ljava/lang/Object;JZ)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_9

    .line 525
    .line 526
    :pswitch_8
    move-object/from16 v8, p2

    .line 527
    .line 528
    move/from16 v1, p3

    .line 529
    .line 530
    move-object/from16 v5, p6

    .line 531
    .line 532
    move-object v4, v9

    .line 533
    move/from16 v6, v18

    .line 534
    .line 535
    move/from16 v9, p4

    .line 536
    .line 537
    if-ne v7, v3, :cond_b

    .line 538
    .line 539
    invoke-static {v1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    invoke-virtual {v4, v2, v12, v13, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 544
    .line 545
    .line 546
    add-int/lit8 v3, v1, 0x4

    .line 547
    .line 548
    goto/16 :goto_9

    .line 549
    .line 550
    :pswitch_9
    move-object/from16 v8, p2

    .line 551
    .line 552
    move/from16 v1, p3

    .line 553
    .line 554
    move-object/from16 v5, p6

    .line 555
    .line 556
    move-object v4, v9

    .line 557
    move/from16 v6, v18

    .line 558
    .line 559
    move/from16 v3, v23

    .line 560
    .line 561
    move/from16 v9, p4

    .line 562
    .line 563
    if-ne v7, v3, :cond_10

    .line 564
    .line 565
    move/from16 v18, v6

    .line 566
    .line 567
    invoke-static {v1, v8}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    .line 568
    .line 569
    .line 570
    move-result-wide v5

    .line 571
    move-wide/from16 v26, v12

    .line 572
    .line 573
    move v12, v1

    .line 574
    move-object v1, v4

    .line 575
    move-wide/from16 v3, v26

    .line 576
    .line 577
    move-object/from16 v13, p6

    .line 578
    .line 579
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 580
    .line 581
    .line 582
    add-int/lit8 v3, v12, 0x8

    .line 583
    .line 584
    or-int v4, v24, v20

    .line 585
    .line 586
    move v5, v9

    .line 587
    move-object v9, v1

    .line 588
    move-object v1, v8

    .line 589
    move v8, v11

    .line 590
    move v11, v4

    .line 591
    move v4, v5

    .line 592
    goto/16 :goto_5

    .line 593
    .line 594
    :cond_10
    move v12, v1

    .line 595
    move-object v13, v5

    .line 596
    move/from16 v18, v6

    .line 597
    .line 598
    goto/16 :goto_7

    .line 599
    .line 600
    :pswitch_a
    move-object/from16 v8, p2

    .line 601
    .line 602
    move-object v1, v9

    .line 603
    move-wide v3, v12

    .line 604
    move/from16 v12, p3

    .line 605
    .line 606
    move/from16 v9, p4

    .line 607
    .line 608
    move-object/from16 v13, p6

    .line 609
    .line 610
    if-nez v7, :cond_11

    .line 611
    .line 612
    invoke-static {v8, v12, v13}, Lcom/google/android/gms/internal/clearcut/l0;->f([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 613
    .line 614
    .line 615
    move-result v5

    .line 616
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 617
    .line 618
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 619
    .line 620
    .line 621
    or-int v3, v24, v20

    .line 622
    .line 623
    move v4, v9

    .line 624
    move-object v9, v1

    .line 625
    move-object v1, v8

    .line 626
    move v8, v11

    .line 627
    move v11, v3

    .line 628
    move v3, v5

    .line 629
    goto/16 :goto_5

    .line 630
    .line 631
    :cond_11
    move-object v14, v1

    .line 632
    goto/16 :goto_10

    .line 633
    .line 634
    :pswitch_b
    move-object/from16 v8, p2

    .line 635
    .line 636
    move-object v1, v9

    .line 637
    move-wide v3, v12

    .line 638
    move/from16 v12, p3

    .line 639
    .line 640
    move/from16 v9, p4

    .line 641
    .line 642
    move-object/from16 v13, p6

    .line 643
    .line 644
    if-nez v7, :cond_11

    .line 645
    .line 646
    invoke-static {v8, v12, v13}, Lcom/google/android/gms/internal/clearcut/l0;->m([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    iget-wide v5, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 651
    .line 652
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 653
    .line 654
    .line 655
    move-object v14, v1

    .line 656
    or-int v1, v24, v20

    .line 657
    .line 658
    move v3, v11

    .line 659
    move v11, v1

    .line 660
    move-object v1, v8

    .line 661
    move v8, v3

    .line 662
    move v3, v7

    .line 663
    :goto_e
    move v4, v9

    .line 664
    move-object v9, v14

    .line 665
    goto/16 :goto_5

    .line 666
    .line 667
    :pswitch_c
    move-object/from16 v8, p2

    .line 668
    .line 669
    move-object v14, v9

    .line 670
    move-wide v4, v12

    .line 671
    move/from16 v12, p3

    .line 672
    .line 673
    move/from16 v9, p4

    .line 674
    .line 675
    move-object/from16 v13, p6

    .line 676
    .line 677
    if-ne v7, v3, :cond_12

    .line 678
    .line 679
    invoke-static {v12, v8}, Lcom/google/android/gms/internal/clearcut/l0;->o(I[B)I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    sget-object v3, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 688
    .line 689
    invoke-virtual {v3, v2, v4, v5, v1}, Lcom/google/android/gms/internal/clearcut/h0;->d(Ljava/lang/Object;JF)V

    .line 690
    .line 691
    .line 692
    add-int/lit8 v3, v12, 0x4

    .line 693
    .line 694
    :goto_f
    or-int v1, v24, v20

    .line 695
    .line 696
    move v4, v11

    .line 697
    move v11, v1

    .line 698
    move-object v1, v8

    .line 699
    move v8, v4

    .line 700
    goto :goto_e

    .line 701
    :pswitch_d
    move-object/from16 v8, p2

    .line 702
    .line 703
    move-object v14, v9

    .line 704
    move-wide v4, v12

    .line 705
    move/from16 v3, v23

    .line 706
    .line 707
    move/from16 v12, p3

    .line 708
    .line 709
    move/from16 v9, p4

    .line 710
    .line 711
    move-object/from16 v13, p6

    .line 712
    .line 713
    if-ne v7, v3, :cond_12

    .line 714
    .line 715
    invoke-static {v12, v8}, Lcom/google/android/gms/internal/clearcut/l0;->r(I[B)J

    .line 716
    .line 717
    .line 718
    move-result-wide v6

    .line 719
    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 720
    .line 721
    .line 722
    move-result-wide v6

    .line 723
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 724
    .line 725
    move-wide v3, v4

    .line 726
    move-wide v5, v6

    .line 727
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/clearcut/h0;->c(Ljava/lang/Object;JD)V

    .line 728
    .line 729
    .line 730
    add-int/lit8 v3, v12, 0x8

    .line 731
    .line 732
    goto :goto_f

    .line 733
    :cond_12
    :goto_10
    move/from16 v6, p5

    .line 734
    .line 735
    move-object v7, v0

    .line 736
    move-object v8, v2

    .line 737
    move v2, v12

    .line 738
    move-object/from16 v25, v14

    .line 739
    .line 740
    move/from16 v5, v18

    .line 741
    .line 742
    move/from16 v18, v11

    .line 743
    .line 744
    :goto_11
    move/from16 v11, v24

    .line 745
    .line 746
    goto/16 :goto_16

    .line 747
    .line 748
    :cond_13
    move-object/from16 v19, v5

    .line 749
    .line 750
    move-object v3, v9

    .line 751
    move/from16 v22, v10

    .line 752
    .line 753
    move-wide v4, v12

    .line 754
    move/from16 v12, p3

    .line 755
    .line 756
    move/from16 v9, p4

    .line 757
    .line 758
    move-object/from16 v13, p6

    .line 759
    .line 760
    const/16 v10, 0x1b

    .line 761
    .line 762
    if-ne v1, v10, :cond_17

    .line 763
    .line 764
    const/4 v10, 0x2

    .line 765
    if-ne v7, v10, :cond_16

    .line 766
    .line 767
    invoke-virtual {v3, v2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    check-cast v1, Lcom/google/android/gms/internal/clearcut/A;

    .line 772
    .line 773
    move-object v6, v1

    .line 774
    check-cast v6, Lcom/google/android/gms/internal/clearcut/h;

    .line 775
    .line 776
    iget-boolean v6, v6, Lcom/google/android/gms/internal/clearcut/h;->q:Z

    .line 777
    .line 778
    if-nez v6, :cond_15

    .line 779
    .line 780
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 781
    .line 782
    .line 783
    move-result v6

    .line 784
    if-nez v6, :cond_14

    .line 785
    .line 786
    const/16 v6, 0xa

    .line 787
    .line 788
    goto :goto_12

    .line 789
    :cond_14
    shl-int/lit8 v6, v6, 0x1

    .line 790
    .line 791
    :goto_12
    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/clearcut/A;->n(I)Lcom/google/android/gms/internal/clearcut/A;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-virtual {v3, v2, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    :cond_15
    move-object v6, v1

    .line 799
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/clearcut/O;->s(I)Lcom/google/android/gms/internal/clearcut/Z;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    move v5, v9

    .line 804
    move v4, v12

    .line 805
    move-object v7, v13

    .line 806
    move/from16 v2, v18

    .line 807
    .line 808
    move-object v9, v3

    .line 809
    move-object/from16 v3, p2

    .line 810
    .line 811
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/O;->h(Lcom/google/android/gms/internal/clearcut/Z;I[BIILcom/google/android/gms/internal/clearcut/A;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    move-object/from16 v2, p1

    .line 816
    .line 817
    move/from16 v4, p4

    .line 818
    .line 819
    move-object/from16 v13, p6

    .line 820
    .line 821
    move v3, v1

    .line 822
    move/from16 v5, v18

    .line 823
    .line 824
    :goto_13
    const/4 v10, -0x1

    .line 825
    move-object/from16 v1, p2

    .line 826
    .line 827
    goto/16 :goto_0

    .line 828
    .line 829
    :cond_16
    move-object v9, v3

    .line 830
    move-object v7, v0

    .line 831
    move-object/from16 v25, v9

    .line 832
    .line 833
    move/from16 v24, v11

    .line 834
    .line 835
    move v3, v12

    .line 836
    move/from16 v5, v18

    .line 837
    .line 838
    move/from16 v18, v8

    .line 839
    .line 840
    move-object/from16 v8, p1

    .line 841
    .line 842
    goto/16 :goto_15

    .line 843
    .line 844
    :cond_17
    move-object v9, v3

    .line 845
    move v3, v12

    .line 846
    const/16 v2, 0x31

    .line 847
    .line 848
    if-gt v1, v2, :cond_19

    .line 849
    .line 850
    move-object v12, v9

    .line 851
    move/from16 v2, v22

    .line 852
    .line 853
    int-to-long v9, v2

    .line 854
    move-object/from16 v2, p2

    .line 855
    .line 856
    move/from16 v24, v11

    .line 857
    .line 858
    move-object/from16 v25, v12

    .line 859
    .line 860
    move v11, v1

    .line 861
    move-wide v12, v4

    .line 862
    move/from16 v5, v18

    .line 863
    .line 864
    move-object/from16 v1, p1

    .line 865
    .line 866
    move/from16 v4, p4

    .line 867
    .line 868
    move/from16 v18, v8

    .line 869
    .line 870
    move v8, v14

    .line 871
    move-object/from16 v14, p6

    .line 872
    .line 873
    invoke-virtual/range {v0 .. v14}, Lcom/google/android/gms/internal/clearcut/O;->l(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I

    .line 874
    .line 875
    .line 876
    move-result v6

    .line 877
    if-ne v6, v3, :cond_18

    .line 878
    .line 879
    move-object v7, v0

    .line 880
    move-object v8, v1

    .line 881
    :goto_14
    move v2, v6

    .line 882
    move/from16 v11, v24

    .line 883
    .line 884
    move/from16 v6, p5

    .line 885
    .line 886
    goto/16 :goto_16

    .line 887
    .line 888
    :cond_18
    move/from16 v4, p4

    .line 889
    .line 890
    move-object/from16 v13, p6

    .line 891
    .line 892
    move-object v2, v1

    .line 893
    move v3, v6

    .line 894
    move/from16 v8, v18

    .line 895
    .line 896
    move/from16 v11, v24

    .line 897
    .line 898
    move-object/from16 v9, v25

    .line 899
    .line 900
    goto :goto_13

    .line 901
    :cond_19
    move-object/from16 v25, v9

    .line 902
    .line 903
    move/from16 v24, v11

    .line 904
    .line 905
    move v12, v14

    .line 906
    move/from16 v2, v22

    .line 907
    .line 908
    move v9, v1

    .line 909
    move-wide v10, v4

    .line 910
    move/from16 v5, v18

    .line 911
    .line 912
    move-object/from16 v1, p1

    .line 913
    .line 914
    move/from16 v18, v8

    .line 915
    .line 916
    const/16 v4, 0x32

    .line 917
    .line 918
    if-ne v9, v4, :cond_1b

    .line 919
    .line 920
    const/4 v4, 0x2

    .line 921
    if-eq v7, v4, :cond_1a

    .line 922
    .line 923
    move-object v7, v0

    .line 924
    move-object v8, v1

    .line 925
    goto :goto_15

    .line 926
    :cond_1a
    invoke-virtual {v0, v12, v10, v11, v1}, Lcom/google/android/gms/internal/clearcut/O;->o(IJLjava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    const/4 v1, 0x0

    .line 930
    throw v1

    .line 931
    :cond_1b
    move/from16 v4, p4

    .line 932
    .line 933
    move-object/from16 v13, p6

    .line 934
    .line 935
    move v8, v2

    .line 936
    move-object/from16 v2, p2

    .line 937
    .line 938
    invoke-virtual/range {v0 .. v13}, Lcom/google/android/gms/internal/clearcut/O;->k(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    move-object v7, v0

    .line 943
    move-object v8, v1

    .line 944
    if-ne v6, v3, :cond_1c

    .line 945
    .line 946
    goto :goto_14

    .line 947
    :cond_1c
    move-object/from16 v1, p2

    .line 948
    .line 949
    move/from16 v4, p4

    .line 950
    .line 951
    move-object/from16 v13, p6

    .line 952
    .line 953
    move v3, v6

    .line 954
    move-object v0, v7

    .line 955
    move-object v2, v8

    .line 956
    move/from16 v8, v18

    .line 957
    .line 958
    move/from16 v11, v24

    .line 959
    .line 960
    move-object/from16 v9, v25

    .line 961
    .line 962
    const/4 v10, -0x1

    .line 963
    goto/16 :goto_0

    .line 964
    .line 965
    :cond_1d
    move-object v7, v0

    .line 966
    move-object/from16 v19, v5

    .line 967
    .line 968
    move/from16 v18, v8

    .line 969
    .line 970
    move-object/from16 v25, v9

    .line 971
    .line 972
    move/from16 v24, v11

    .line 973
    .line 974
    move v5, v12

    .line 975
    move-object v8, v2

    .line 976
    :goto_15
    move/from16 v6, p5

    .line 977
    .line 978
    move v2, v3

    .line 979
    goto/16 :goto_11

    .line 980
    .line 981
    :goto_16
    if-ne v5, v6, :cond_1f

    .line 982
    .line 983
    if-nez v6, :cond_1e

    .line 984
    .line 985
    goto :goto_18

    .line 986
    :cond_1e
    move/from16 v4, p4

    .line 987
    .line 988
    move v3, v2

    .line 989
    const/4 v10, -0x1

    .line 990
    :goto_17
    move/from16 v0, v18

    .line 991
    .line 992
    goto :goto_19

    .line 993
    :cond_1f
    :goto_18
    move-object v0, v8

    .line 994
    check-cast v0, Lcom/google/android/gms/internal/clearcut/x;

    .line 995
    .line 996
    iget-object v1, v0, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 997
    .line 998
    if-ne v1, v15, :cond_20

    .line 999
    .line 1000
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/b0;->b()Lcom/google/android/gms/internal/clearcut/b0;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    iput-object v1, v0, Lcom/google/android/gms/internal/clearcut/x;->zzjp:Lcom/google/android/gms/internal/clearcut/b0;

    .line 1005
    .line 1006
    :cond_20
    move/from16 v3, p4

    .line 1007
    .line 1008
    move-object v4, v1

    .line 1009
    move v0, v5

    .line 1010
    move-object/from16 v1, p2

    .line 1011
    .line 1012
    move-object/from16 v5, p6

    .line 1013
    .line 1014
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/clearcut/l0;->c(I[BIILcom/google/android/gms/internal/clearcut/b0;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 1015
    .line 1016
    .line 1017
    move-result v2

    .line 1018
    move v5, v0

    .line 1019
    move-object/from16 v1, p2

    .line 1020
    .line 1021
    move-object/from16 v13, p6

    .line 1022
    .line 1023
    move v4, v3

    .line 1024
    move-object v0, v7

    .line 1025
    move-object/from16 v9, v25

    .line 1026
    .line 1027
    const/4 v10, -0x1

    .line 1028
    move v3, v2

    .line 1029
    move-object v2, v8

    .line 1030
    move/from16 v8, v18

    .line 1031
    .line 1032
    goto/16 :goto_0

    .line 1033
    .line 1034
    :cond_21
    move-object v7, v0

    .line 1035
    move-object/from16 v19, v6

    .line 1036
    .line 1037
    move/from16 v18, v8

    .line 1038
    .line 1039
    move-object/from16 v25, v9

    .line 1040
    .line 1041
    move/from16 v24, v11

    .line 1042
    .line 1043
    move/from16 v6, p5

    .line 1044
    .line 1045
    move-object v8, v2

    .line 1046
    goto :goto_17

    .line 1047
    :goto_19
    if-eq v0, v10, :cond_22

    .line 1048
    .line 1049
    int-to-long v0, v0

    .line 1050
    move-object/from16 v9, v25

    .line 1051
    .line 1052
    invoke-virtual {v9, v8, v0, v1, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1053
    .line 1054
    .line 1055
    :cond_22
    iget-object v0, v7, Lcom/google/android/gms/internal/clearcut/O;->i:[I

    .line 1056
    .line 1057
    if-eqz v0, :cond_25

    .line 1058
    .line 1059
    array-length v1, v0

    .line 1060
    move/from16 v2, v16

    .line 1061
    .line 1062
    :goto_1a
    if-ge v2, v1, :cond_25

    .line 1063
    .line 1064
    aget v9, v0, v2

    .line 1065
    .line 1066
    aget v10, v19, v9

    .line 1067
    .line 1068
    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 1069
    .line 1070
    .line 1071
    move-result v10

    .line 1072
    and-int v10, v10, v17

    .line 1073
    .line 1074
    int-to-long v10, v10

    .line 1075
    invoke-static {v10, v11, v8}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v10

    .line 1079
    if-nez v10, :cond_23

    .line 1080
    .line 1081
    goto :goto_1b

    .line 1082
    :cond_23
    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/clearcut/O;->u(I)Lcom/google/android/gms/internal/clearcut/z;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v11

    .line 1086
    if-nez v11, :cond_24

    .line 1087
    .line 1088
    :goto_1b
    add-int/lit8 v2, v2, 0x1

    .line 1089
    .line 1090
    goto :goto_1a

    .line 1091
    :cond_24
    iget-object v0, v7, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 1092
    .line 1093
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    check-cast v10, Lcom/google/android/gms/internal/clearcut/K;

    .line 1097
    .line 1098
    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/clearcut/O;->t(I)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    new-instance v0, Ljava/lang/NoSuchMethodError;

    .line 1102
    .line 1103
    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 1104
    .line 1105
    .line 1106
    throw v0

    .line 1107
    :cond_25
    if-nez v6, :cond_27

    .line 1108
    .line 1109
    if-ne v3, v4, :cond_26

    .line 1110
    .line 1111
    goto :goto_1c

    .line 1112
    :cond_26
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->b()Lcom/google/android/gms/internal/clearcut/B;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    throw v0

    .line 1117
    :cond_27
    if-gt v3, v4, :cond_28

    .line 1118
    .line 1119
    if-ne v5, v6, :cond_28

    .line 1120
    .line 1121
    :goto_1c
    return v3

    .line 1122
    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/B;->b()Lcom/google/android/gms/internal/clearcut/B;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final o(IJLjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/clearcut/O;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/O;->t(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p4, p2, p3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->n:Lcom/google/android/gms/internal/clearcut/L;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, Lcom/google/android/gms/internal/clearcut/K;

    .line 17
    .line 18
    iget-boolean v1, v1, Lcom/google/android/gms/internal/clearcut/K;->q:Z

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lcom/google/android/gms/internal/clearcut/K;->r:Lcom/google/android/gms/internal/clearcut/K;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v1, Lcom/google/android/gms/internal/clearcut/K;

    .line 31
    .line 32
    invoke-direct {v1}, Lcom/google/android/gms/internal/clearcut/K;-><init>()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/clearcut/K;

    .line 37
    .line 38
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    iput-boolean v1, v2, Lcom/google/android/gms/internal/clearcut/K;->q:Z

    .line 43
    .line 44
    move-object v1, v2

    .line 45
    :goto_0
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/clearcut/L;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/K;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p4, p2, p3, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/NoSuchMethodError;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v1, p3}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-static {v2, p3}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    :goto_0
    invoke-static {v0, v1, p2, p3}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/clearcut/O;->x(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    if-eqz p3, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(IILjava/lang/Object;)Z
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 4
    .line 5
    aget p2, v0, p2

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p2, v0

    .line 11
    int-to-long v0, p2

    .line 12
    sget-object p2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 13
    .line 14
    invoke-virtual {p2, v0, v1, p3}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-ne p2, p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final r(ILjava/lang/Object;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 2
    .line 3
    const v1, 0xfffff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int v0, p1, v1

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    const/high16 v3, 0xff00000

    .line 17
    .line 18
    and-int/2addr p1, v3

    .line 19
    ushr-int/lit8 p1, p1, 0x14

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    packed-switch p1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :pswitch_0
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    cmp-long p1, p1, v3

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    cmp-long p1, p1, v3

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 75
    .line 76
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 95
    .line 96
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 105
    .line 106
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/clearcut/m;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_3

    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :pswitch_8
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :pswitch_9
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    instance-of p2, p1, Ljava/lang/String;

    .line 131
    .line 132
    if-eqz p2, :cond_0

    .line 133
    .line 134
    check-cast p1, Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_3

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_0
    instance-of p2, p1, Lcom/google/android/gms/internal/clearcut/m;

    .line 145
    .line 146
    if-eqz p2, :cond_1

    .line 147
    .line 148
    sget-object p2, Lcom/google/android/gms/internal/clearcut/m;->s:Lcom/google/android/gms/internal/clearcut/m;

    .line 149
    .line 150
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/clearcut/m;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_3

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :pswitch_a
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->i(JLjava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    return p1

    .line 171
    :pswitch_b
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 172
    .line 173
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_3

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :pswitch_c
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 181
    .line 182
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 183
    .line 184
    .line 185
    move-result-wide p1

    .line 186
    cmp-long p1, p1, v3

    .line 187
    .line 188
    if-eqz p1, :cond_3

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :pswitch_d
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 192
    .line 193
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_3

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :pswitch_e
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 201
    .line 202
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 203
    .line 204
    .line 205
    move-result-wide p1

    .line 206
    cmp-long p1, p1, v3

    .line 207
    .line 208
    if-eqz p1, :cond_3

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :pswitch_f
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 212
    .line 213
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->h(JLjava/lang/Object;)J

    .line 214
    .line 215
    .line 216
    move-result-wide p1

    .line 217
    cmp-long p1, p1, v3

    .line 218
    .line 219
    if-eqz p1, :cond_3

    .line 220
    .line 221
    goto :goto_0

    .line 222
    :pswitch_10
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 223
    .line 224
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->j(JLjava/lang/Object;)F

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    const/4 p2, 0x0

    .line 229
    cmpl-float p1, p1, p2

    .line 230
    .line 231
    if-eqz p1, :cond_3

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 235
    .line 236
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->k(JLjava/lang/Object;)D

    .line 237
    .line 238
    .line 239
    move-result-wide p1

    .line 240
    const-wide/16 v0, 0x0

    .line 241
    .line 242
    cmpl-double p1, p1, v0

    .line 243
    .line 244
    if-eqz p1, :cond_3

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_2
    add-int/lit8 p1, p1, 0x2

    .line 248
    .line 249
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 250
    .line 251
    aget p1, v0, p1

    .line 252
    .line 253
    ushr-int/lit8 v0, p1, 0x14

    .line 254
    .line 255
    shl-int v0, v2, v0

    .line 256
    .line 257
    and-int/2addr p1, v1

    .line 258
    int-to-long v3, p1

    .line 259
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 260
    .line 261
    invoke-virtual {p1, v3, v4, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    and-int/2addr p1, v0

    .line 266
    if-eqz p1, :cond_3

    .line 267
    .line 268
    :goto_0
    return v2

    .line 269
    :cond_3
    const/4 p1, 0x0

    .line 270
    return p1

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(I)Lcom/google/android/gms/internal/clearcut/Z;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v0, p1

    .line 8
    .line 9
    check-cast v1, Lcom/google/android/gms/internal/clearcut/Z;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/clearcut/V;->c:Lcom/google/android/gms/internal/clearcut/V;

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x1

    .line 17
    .line 18
    aget-object v2, v0, v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/clearcut/V;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/clearcut/Z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    aput-object v1, v0, p1

    .line 27
    .line 28
    return-object v1
.end method

.method public final t(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x4

    shl-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final u(I)Lcom/google/android/gms/internal/clearcut/z;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x4

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/clearcut/z;

    return-object p1
.end method

.method public final v(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final w(I)I
    .locals 7

    .line 1
    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/gms/internal/clearcut/O;->c:I

    if-lt p1, v1, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    iget v3, p0, Lcom/google/android/gms/internal/clearcut/O;->e:I

    if-ge p1, v3, :cond_1

    sub-int v1, p1, v1

    shl-int/lit8 v1, v1, 0x2

    aget v2, v2, v1

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    iget v4, p0, Lcom/google/android/gms/internal/clearcut/O;->d:I

    if-gt p1, v4, :cond_4

    sub-int/2addr v3, v1

    array-length v1, v2

    div-int/lit8 v1, v1, 0x4

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-gt v3, v1, :cond_4

    add-int v4, v1, v3

    ushr-int/lit8 v4, v4, 0x1

    shl-int/lit8 v5, v4, 0x2

    aget v6, v2, v5

    if-ne p1, v6, :cond_2

    return v5

    :cond_2
    if-ge p1, v6, :cond_3

    add-int/lit8 v1, v4, -0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final x(ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/clearcut/O;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    add-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 9
    .line 10
    aget p1, v0, p1

    .line 11
    .line 12
    ushr-int/lit8 v0, p1, 0x14

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    shl-int v0, v1, v0

    .line 16
    .line 17
    const v1, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr p1, v1

    .line 21
    int-to-long v1, p1

    .line 22
    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 23
    .line 24
    invoke-virtual {p1, v1, v2, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    or-int/2addr p1, v0

    .line 29
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final y(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/O;->v(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/clearcut/O;->a:[I

    .line 6
    .line 7
    aget v2, v1, p1

    .line 8
    .line 9
    const v3, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v3

    .line 13
    int-to-long v4, v0

    .line 14
    invoke-virtual {p0, v2, p1, p3}, Lcom/google/android/gms/internal/clearcut/O;->q(IILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-static {v4, v5, p2}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v4, v5, p3}, Lcom/google/android/gms/internal/clearcut/i0;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    invoke-static {v0, p3}, Lcom/google/android/gms/internal/clearcut/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/clearcut/x;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-static {v4, v5, p2, p3}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x2

    .line 41
    .line 42
    aget p1, v1, p1

    .line 43
    .line 44
    :goto_0
    and-int/2addr p1, v3

    .line 45
    int-to-long v0, p1

    .line 46
    invoke-static {v2, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    if-eqz p3, :cond_2

    .line 51
    .line 52
    invoke-static {v4, v5, p2, p3}, Lcom/google/android/gms/internal/clearcut/i0;->c(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    aget p1, v1, p1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    :goto_1
    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/clearcut/x;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/clearcut/O;->r(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method
