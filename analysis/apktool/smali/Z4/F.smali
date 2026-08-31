.class public final LZ4/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD2/i;


# instance fields
.field public final synthetic a:LW0/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:J

.field public final synthetic f:LB5/c;


# direct methods
.method public constructor <init>(LW0/c;Ljava/lang/String;FFJLB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ4/F;->a:LW0/c;

    .line 5
    .line 6
    iput-object p2, p0, LZ4/F;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, LZ4/F;->c:F

    .line 9
    .line 10
    iput p4, p0, LZ4/F;->d:F

    .line 11
    .line 12
    iput-wide p5, p0, LZ4/F;->e:J

    .line 13
    .line 14
    iput-object p7, p0, LZ4/F;->f:LB5/c;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(LD2/r;)V
    .locals 9

    .line 1
    iget-object p1, p1, LD2/r;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LZ4/F;->a:LW0/c;

    .line 8
    .line 9
    invoke-interface {v1, v0}, LW0/c;->f0(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {v1, p1}, LW0/c;->f0(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v1, p0, LZ4/F;->b:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "SMALL"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x2

    .line 30
    iget v5, p0, LZ4/F;->c:F

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    move v3, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    int-to-float v3, v4

    .line 37
    mul-float/2addr v3, v5

    .line 38
    :goto_0
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const-string v7, "FULL_SCREEN"

    .line 43
    .line 44
    const-string v8, "FULL_WIDTH"

    .line 45
    .line 46
    if-ltz v6, :cond_2

    .line 47
    .line 48
    invoke-static {v0, v3}, Ljava/lang/Float;->compare(FF)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const-string v4, "width"

    .line 53
    .line 54
    if-lez v2, :cond_1

    .line 55
    .line 56
    invoke-static {v0, p1, v3, v4}, Ll6/d;->m(FFFLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_1
    invoke-static {v0, v3}, Ljava/lang/Float;->compare(FF)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-gez v2, :cond_7

    .line 65
    .line 66
    invoke-static {v0, p1, v3, v4, v3}, Ll6/d;->t(FFFLjava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget v3, p0, LZ4/F;->d:F

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    :goto_1
    move v2, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    int-to-float v2, v4

    .line 88
    mul-float/2addr v2, v3

    .line 89
    :goto_2
    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    const-string v6, "height"

    .line 94
    .line 95
    if-lez v4, :cond_5

    .line 96
    .line 97
    invoke-static {v0, p1, v2, v6}, Ll6/d;->m(FFFLjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    invoke-static {p1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-gez v4, :cond_6

    .line 112
    .line 113
    invoke-static {v0, p1, v2, v6, v5}, Ll6/d;->t(FFFLjava/lang/String;F)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    sput v5, LZ4/L;->a:F

    .line 118
    .line 119
    sput v3, LZ4/L;->b:F

    .line 120
    .line 121
    :cond_7
    :goto_3
    invoke-static {v1, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    sget-object v3, Lj0/B;->a:LO3/D;

    .line 126
    .line 127
    iget-wide v4, p0, LZ4/F;->e:J

    .line 128
    .line 129
    sget-object v6, Lc0/j;->q:Lc0/j;

    .line 130
    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    sget p1, LZ4/L;->b:F

    .line 134
    .line 135
    invoke-static {v6, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget v0, LZ4/L;->a:F

    .line 140
    .line 141
    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1, v4, v5, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_8
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_a

    .line 156
    .line 157
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    const/4 v0, 0x5

    .line 162
    if-gez p1, :cond_9

    .line 163
    .line 164
    sget p1, LZ4/L;->b:F

    .line 165
    .line 166
    invoke-static {v6, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    sget v1, LZ4/L;->a:F

    .line 171
    .line 172
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1, v4, v5, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    goto :goto_4

    .line 189
    :cond_9
    sget p1, LZ4/L;->b:F

    .line 190
    .line 191
    invoke-static {v6, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    sget v1, LZ4/L;->a:F

    .line 196
    .line 197
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {p1, v4, v5, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    goto :goto_4

    .line 214
    :cond_a
    invoke-static {p1, v0}, Ljava/lang/Float;->compare(FF)I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    const/16 v0, 0xa

    .line 219
    .line 220
    if-lez p1, :cond_b

    .line 221
    .line 222
    sget p1, LZ4/L;->b:F

    .line 223
    .line 224
    invoke-static {v6, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    sget v1, LZ4/L;->a:F

    .line 229
    .line 230
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-static {p1, v4, v5, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    goto :goto_4

    .line 247
    :cond_b
    sget p1, LZ4/L;->b:F

    .line 248
    .line 249
    invoke-static {v6, p1}, Landroidx/compose/foundation/layout/c;->a(Lc0/m;F)Lc0/m;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    sget v1, LZ4/L;->a:F

    .line 254
    .line 255
    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/c;->e(Lc0/m;F)Lc0/m;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {v0}, LH/e;->a(I)LH/d;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {p1, v0}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1, v4, v5, v3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :goto_4
    iget-object v0, p0, LZ4/F;->f:LB5/c;

    .line 272
    .line 273
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public final b(LD2/e;)V
    .locals 0

    .line 1
    iget-object p1, p1, LD2/e;->c:Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
