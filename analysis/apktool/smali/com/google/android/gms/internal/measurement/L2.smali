.class public final Lcom/google/android/gms/internal/measurement/L2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/S2;


# static fields
.field public static final j:[I

.field public static final k:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/android/gms/internal/measurement/Y1;

.field public final f:[I

.field public final g:I

.field public final h:I

.field public final i:Lcom/google/android/gms/internal/measurement/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/measurement/L2;->j:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d3;->l()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/Y1;[IIILcom/google/android/gms/internal/measurement/o2;Lcom/google/android/gms/internal/measurement/o2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/measurement/L2;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/measurement/L2;->d:I

    .line 11
    .line 12
    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/L2;->f:[I

    .line 13
    .line 14
    iput p7, p0, Lcom/google/android/gms/internal/measurement/L2;->g:I

    .line 15
    .line 16
    iput p8, p0, Lcom/google/android/gms/internal/measurement/L2;->h:I

    .line 17
    .line 18
    iput-object p9, p0, Lcom/google/android/gms/internal/measurement/L2;->i:Lcom/google/android/gms/internal/measurement/o2;

    .line 19
    .line 20
    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/L2;->e:Lcom/google/android/gms/internal/measurement/Y1;

    .line 21
    .line 22
    return-void
.end method

.method public static E(I)I
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static i(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/q2;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/gms/internal/measurement/q2;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/q2;->e()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static j(JLjava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

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

.method public static k(JLjava/lang/Object;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

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

.method public static final r([BIILcom/google/android/gms/internal/measurement/g3;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/b2;)I
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/g3;->s:Lcom/google/android/gms/internal/measurement/g3;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    const-string p1, "unsupported field type."

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_1
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget-wide p1, p5, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 23
    .line 24
    invoke-static {p1, p2}, Ll6/d;->H(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 33
    .line 34
    return p0

    .line 35
    :pswitch_2
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p5, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 40
    .line 41
    invoke-static {p1}, Ll6/d;->G(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_3
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/P1;->p0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_4
    sget-object p3, Lcom/google/android/gms/internal/measurement/P2;->c:Lcom/google/android/gms/internal/measurement/P2;

    .line 58
    .line 59
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/measurement/P2;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/S2;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v2, p0

    .line 68
    move v3, p1

    .line 69
    move v4, p2

    .line 70
    move-object v5, p5

    .line 71
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/P1;->q0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIILcom/google/android/gms/internal/measurement/b2;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/measurement/S2;->a(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 79
    .line 80
    return p0

    .line 81
    :pswitch_5
    move-object v2, p0

    .line 82
    move v3, p1

    .line 83
    move-object v5, p5

    .line 84
    invoke-static {v2, v3, v5}, Lcom/google/android/gms/internal/measurement/P1;->o0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    :pswitch_6
    move-object v2, p0

    .line 90
    move v3, p1

    .line 91
    move-object v5, p5

    .line 92
    invoke-static {v2, v3, v5}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    iget-wide p1, v5, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 97
    .line 98
    const-wide/16 p3, 0x0

    .line 99
    .line 100
    cmp-long p1, p1, p3

    .line 101
    .line 102
    if-eqz p1, :cond_0

    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const/4 p1, 0x0

    .line 107
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 112
    .line 113
    return p0

    .line 114
    :pswitch_7
    move-object v2, p0

    .line 115
    move v3, p1

    .line 116
    move-object v5, p5

    .line 117
    add-int/lit8 p1, v3, 0x4

    .line 118
    .line 119
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput-object p0, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 128
    .line 129
    return p1

    .line 130
    :pswitch_8
    move-object v2, p0

    .line 131
    move v3, p1

    .line 132
    move-object v5, p5

    .line 133
    add-int/lit8 p1, v3, 0x8

    .line 134
    .line 135
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    .line 136
    .line 137
    .line 138
    move-result-wide p2

    .line 139
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iput-object p0, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 144
    .line 145
    return p1

    .line 146
    :pswitch_9
    move-object v2, p0

    .line 147
    move v3, p1

    .line 148
    move-object v5, p5

    .line 149
    invoke-static {v2, v3, v5}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    iget p1, v5, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 154
    .line 155
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 160
    .line 161
    return p0

    .line 162
    :pswitch_a
    move-object v2, p0

    .line 163
    move v3, p1

    .line 164
    move-object v5, p5

    .line 165
    invoke-static {v2, v3, v5}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    iget-wide p1, v5, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 170
    .line 171
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 176
    .line 177
    return p0

    .line 178
    :pswitch_b
    move-object v2, p0

    .line 179
    move v3, p1

    .line 180
    move-object v5, p5

    .line 181
    add-int/lit8 p1, v3, 0x4

    .line 182
    .line 183
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iput-object p0, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 196
    .line 197
    return p1

    .line 198
    :pswitch_c
    move-object v2, p0

    .line 199
    move v3, p1

    .line 200
    move-object v5, p5

    .line 201
    add-int/lit8 p1, v3, 0x8

    .line 202
    .line 203
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    .line 204
    .line 205
    .line 206
    move-result-wide p2

    .line 207
    invoke-static {p2, p3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 208
    .line 209
    .line 210
    move-result-wide p2

    .line 211
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iput-object p0, v5, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 216
    .line 217
    return p1

    .line 218
    nop

    .line 219
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
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static t(Lcom/google/android/gms/internal/measurement/R2;Lcom/google/android/gms/internal/measurement/o2;Lcom/google/android/gms/internal/measurement/o2;)Lcom/google/android/gms/internal/measurement/L2;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/R2;

    .line 4
    .line 5
    if-eqz v1, :cond_37

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/R2;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const v5, 0xd800

    .line 19
    .line 20
    .line 21
    if-lt v4, v5, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    :goto_0
    add-int/lit8 v7, v4, 0x1

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lt v4, v5, :cond_1

    .line 31
    .line 32
    move v4, v7

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v7, 0x1

    .line 35
    :cond_1
    add-int/lit8 v4, v7, 0x1

    .line 36
    .line 37
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-lt v7, v5, :cond_3

    .line 42
    .line 43
    and-int/lit16 v7, v7, 0x1fff

    .line 44
    .line 45
    const/16 v9, 0xd

    .line 46
    .line 47
    :goto_1
    add-int/lit8 v10, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-lt v4, v5, :cond_2

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0x1fff

    .line 56
    .line 57
    shl-int/2addr v4, v9

    .line 58
    or-int/2addr v7, v4

    .line 59
    add-int/lit8 v9, v9, 0xd

    .line 60
    .line 61
    move v4, v10

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    shl-int/2addr v4, v9

    .line 64
    or-int/2addr v7, v4

    .line 65
    move v4, v10

    .line 66
    :cond_3
    if-nez v7, :cond_4

    .line 67
    .line 68
    sget-object v7, Lcom/google/android/gms/internal/measurement/L2;->j:[I

    .line 69
    .line 70
    move v9, v3

    .line 71
    move v10, v9

    .line 72
    move v11, v10

    .line 73
    move v12, v11

    .line 74
    move v13, v12

    .line 75
    move/from16 v16, v13

    .line 76
    .line 77
    move-object v15, v7

    .line 78
    move/from16 v7, v16

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_4
    add-int/lit8 v7, v4, 0x1

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-lt v4, v5, :cond_6

    .line 89
    .line 90
    and-int/lit16 v4, v4, 0x1fff

    .line 91
    .line 92
    const/16 v9, 0xd

    .line 93
    .line 94
    :goto_2
    add-int/lit8 v10, v7, 0x1

    .line 95
    .line 96
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-lt v7, v5, :cond_5

    .line 101
    .line 102
    and-int/lit16 v7, v7, 0x1fff

    .line 103
    .line 104
    shl-int/2addr v7, v9

    .line 105
    or-int/2addr v4, v7

    .line 106
    add-int/lit8 v9, v9, 0xd

    .line 107
    .line 108
    move v7, v10

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    shl-int/2addr v7, v9

    .line 111
    or-int/2addr v4, v7

    .line 112
    move v7, v10

    .line 113
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 114
    .line 115
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-lt v7, v5, :cond_8

    .line 120
    .line 121
    and-int/lit16 v7, v7, 0x1fff

    .line 122
    .line 123
    const/16 v10, 0xd

    .line 124
    .line 125
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 126
    .line 127
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-lt v9, v5, :cond_7

    .line 132
    .line 133
    and-int/lit16 v9, v9, 0x1fff

    .line 134
    .line 135
    shl-int/2addr v9, v10

    .line 136
    or-int/2addr v7, v9

    .line 137
    add-int/lit8 v10, v10, 0xd

    .line 138
    .line 139
    move v9, v11

    .line 140
    goto :goto_3

    .line 141
    :cond_7
    shl-int/2addr v9, v10

    .line 142
    or-int/2addr v7, v9

    .line 143
    move v9, v11

    .line 144
    :cond_8
    add-int/lit8 v10, v9, 0x1

    .line 145
    .line 146
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-lt v9, v5, :cond_a

    .line 151
    .line 152
    and-int/lit16 v9, v9, 0x1fff

    .line 153
    .line 154
    const/16 v11, 0xd

    .line 155
    .line 156
    :goto_4
    add-int/lit8 v12, v10, 0x1

    .line 157
    .line 158
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-lt v10, v5, :cond_9

    .line 163
    .line 164
    and-int/lit16 v10, v10, 0x1fff

    .line 165
    .line 166
    shl-int/2addr v10, v11

    .line 167
    or-int/2addr v9, v10

    .line 168
    add-int/lit8 v11, v11, 0xd

    .line 169
    .line 170
    move v10, v12

    .line 171
    goto :goto_4

    .line 172
    :cond_9
    shl-int/2addr v10, v11

    .line 173
    or-int/2addr v9, v10

    .line 174
    move v10, v12

    .line 175
    :cond_a
    add-int/lit8 v11, v10, 0x1

    .line 176
    .line 177
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-lt v10, v5, :cond_c

    .line 182
    .line 183
    and-int/lit16 v10, v10, 0x1fff

    .line 184
    .line 185
    const/16 v12, 0xd

    .line 186
    .line 187
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 188
    .line 189
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-lt v11, v5, :cond_b

    .line 194
    .line 195
    and-int/lit16 v11, v11, 0x1fff

    .line 196
    .line 197
    shl-int/2addr v11, v12

    .line 198
    or-int/2addr v10, v11

    .line 199
    add-int/lit8 v12, v12, 0xd

    .line 200
    .line 201
    move v11, v13

    .line 202
    goto :goto_5

    .line 203
    :cond_b
    shl-int/2addr v11, v12

    .line 204
    or-int/2addr v10, v11

    .line 205
    move v11, v13

    .line 206
    :cond_c
    add-int/lit8 v12, v11, 0x1

    .line 207
    .line 208
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-lt v11, v5, :cond_e

    .line 213
    .line 214
    and-int/lit16 v11, v11, 0x1fff

    .line 215
    .line 216
    const/16 v13, 0xd

    .line 217
    .line 218
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 219
    .line 220
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    if-lt v12, v5, :cond_d

    .line 225
    .line 226
    and-int/lit16 v12, v12, 0x1fff

    .line 227
    .line 228
    shl-int/2addr v12, v13

    .line 229
    or-int/2addr v11, v12

    .line 230
    add-int/lit8 v13, v13, 0xd

    .line 231
    .line 232
    move v12, v14

    .line 233
    goto :goto_6

    .line 234
    :cond_d
    shl-int/2addr v12, v13

    .line 235
    or-int/2addr v11, v12

    .line 236
    move v12, v14

    .line 237
    :cond_e
    add-int/lit8 v13, v12, 0x1

    .line 238
    .line 239
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    if-lt v12, v5, :cond_10

    .line 244
    .line 245
    and-int/lit16 v12, v12, 0x1fff

    .line 246
    .line 247
    const/16 v14, 0xd

    .line 248
    .line 249
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 250
    .line 251
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 252
    .line 253
    .line 254
    move-result v13

    .line 255
    if-lt v13, v5, :cond_f

    .line 256
    .line 257
    and-int/lit16 v13, v13, 0x1fff

    .line 258
    .line 259
    shl-int/2addr v13, v14

    .line 260
    or-int/2addr v12, v13

    .line 261
    add-int/lit8 v14, v14, 0xd

    .line 262
    .line 263
    move v13, v15

    .line 264
    goto :goto_7

    .line 265
    :cond_f
    shl-int/2addr v13, v14

    .line 266
    or-int/2addr v12, v13

    .line 267
    move v13, v15

    .line 268
    :cond_10
    add-int/lit8 v14, v13, 0x1

    .line 269
    .line 270
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    if-lt v13, v5, :cond_12

    .line 275
    .line 276
    and-int/lit16 v13, v13, 0x1fff

    .line 277
    .line 278
    const/16 v15, 0xd

    .line 279
    .line 280
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 281
    .line 282
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-lt v14, v5, :cond_11

    .line 287
    .line 288
    and-int/lit16 v14, v14, 0x1fff

    .line 289
    .line 290
    shl-int/2addr v14, v15

    .line 291
    or-int/2addr v13, v14

    .line 292
    add-int/lit8 v15, v15, 0xd

    .line 293
    .line 294
    move/from16 v14, v16

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_11
    shl-int/2addr v14, v15

    .line 298
    or-int/2addr v13, v14

    .line 299
    move/from16 v14, v16

    .line 300
    .line 301
    :cond_12
    add-int/lit8 v15, v14, 0x1

    .line 302
    .line 303
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-lt v14, v5, :cond_14

    .line 308
    .line 309
    and-int/lit16 v14, v14, 0x1fff

    .line 310
    .line 311
    const/16 v16, 0xd

    .line 312
    .line 313
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 314
    .line 315
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    if-lt v15, v5, :cond_13

    .line 320
    .line 321
    and-int/lit16 v15, v15, 0x1fff

    .line 322
    .line 323
    shl-int v15, v15, v16

    .line 324
    .line 325
    or-int/2addr v14, v15

    .line 326
    add-int/lit8 v16, v16, 0xd

    .line 327
    .line 328
    move/from16 v15, v17

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_13
    shl-int v15, v15, v16

    .line 332
    .line 333
    or-int/2addr v14, v15

    .line 334
    move/from16 v15, v17

    .line 335
    .line 336
    :cond_14
    add-int v16, v14, v12

    .line 337
    .line 338
    add-int v13, v16, v13

    .line 339
    .line 340
    add-int v16, v4, v4

    .line 341
    .line 342
    add-int v16, v16, v7

    .line 343
    .line 344
    new-array v7, v13, [I

    .line 345
    .line 346
    move-object v13, v7

    .line 347
    move v7, v4

    .line 348
    move v4, v15

    .line 349
    move-object v15, v13

    .line 350
    move v13, v12

    .line 351
    move v12, v9

    .line 352
    move v9, v13

    .line 353
    move v13, v10

    .line 354
    move/from16 v10, v16

    .line 355
    .line 356
    move/from16 v16, v14

    .line 357
    .line 358
    :goto_a
    sget-object v14, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 359
    .line 360
    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/R2;->c:[Ljava/lang/Object;

    .line 361
    .line 362
    iget-object v8, v0, Lcom/google/android/gms/internal/measurement/R2;->a:Lcom/google/android/gms/internal/measurement/Y1;

    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    add-int v9, v16, v9

    .line 369
    .line 370
    add-int v6, v11, v11

    .line 371
    .line 372
    mul-int/lit8 v11, v11, 0x3

    .line 373
    .line 374
    new-array v11, v11, [I

    .line 375
    .line 376
    new-array v6, v6, [Ljava/lang/Object;

    .line 377
    .line 378
    move/from16 v23, v9

    .line 379
    .line 380
    move/from16 v22, v16

    .line 381
    .line 382
    const/16 v20, 0x0

    .line 383
    .line 384
    const/16 v21, 0x0

    .line 385
    .line 386
    :goto_b
    if-ge v4, v2, :cond_36

    .line 387
    .line 388
    add-int/lit8 v24, v4, 0x1

    .line 389
    .line 390
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-lt v4, v5, :cond_16

    .line 395
    .line 396
    and-int/lit16 v4, v4, 0x1fff

    .line 397
    .line 398
    move/from16 v5, v24

    .line 399
    .line 400
    const/16 v24, 0xd

    .line 401
    .line 402
    :goto_c
    add-int/lit8 v26, v5, 0x1

    .line 403
    .line 404
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    move/from16 v27, v2

    .line 409
    .line 410
    const v2, 0xd800

    .line 411
    .line 412
    .line 413
    if-lt v5, v2, :cond_15

    .line 414
    .line 415
    and-int/lit16 v2, v5, 0x1fff

    .line 416
    .line 417
    shl-int v2, v2, v24

    .line 418
    .line 419
    or-int/2addr v4, v2

    .line 420
    add-int/lit8 v24, v24, 0xd

    .line 421
    .line 422
    move/from16 v5, v26

    .line 423
    .line 424
    move/from16 v2, v27

    .line 425
    .line 426
    goto :goto_c

    .line 427
    :cond_15
    shl-int v2, v5, v24

    .line 428
    .line 429
    or-int/2addr v4, v2

    .line 430
    move/from16 v2, v26

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_16
    move/from16 v27, v2

    .line 434
    .line 435
    move/from16 v2, v24

    .line 436
    .line 437
    :goto_d
    add-int/lit8 v5, v2, 0x1

    .line 438
    .line 439
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    move-object/from16 v24, v3

    .line 444
    .line 445
    const v3, 0xd800

    .line 446
    .line 447
    .line 448
    if-lt v2, v3, :cond_18

    .line 449
    .line 450
    and-int/lit16 v2, v2, 0x1fff

    .line 451
    .line 452
    const/16 v26, 0xd

    .line 453
    .line 454
    :goto_e
    add-int/lit8 v28, v5, 0x1

    .line 455
    .line 456
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-lt v5, v3, :cond_17

    .line 461
    .line 462
    and-int/lit16 v3, v5, 0x1fff

    .line 463
    .line 464
    shl-int v3, v3, v26

    .line 465
    .line 466
    or-int/2addr v2, v3

    .line 467
    add-int/lit8 v26, v26, 0xd

    .line 468
    .line 469
    move/from16 v5, v28

    .line 470
    .line 471
    const v3, 0xd800

    .line 472
    .line 473
    .line 474
    goto :goto_e

    .line 475
    :cond_17
    shl-int v3, v5, v26

    .line 476
    .line 477
    or-int/2addr v2, v3

    .line 478
    move/from16 v5, v28

    .line 479
    .line 480
    :cond_18
    and-int/lit16 v3, v2, 0x400

    .line 481
    .line 482
    if-eqz v3, :cond_19

    .line 483
    .line 484
    add-int/lit8 v3, v20, 0x1

    .line 485
    .line 486
    aput v21, v15, v20

    .line 487
    .line 488
    move/from16 v20, v3

    .line 489
    .line 490
    :cond_19
    and-int/lit16 v3, v2, 0xff

    .line 491
    .line 492
    move/from16 v26, v4

    .line 493
    .line 494
    and-int/lit16 v4, v2, 0x800

    .line 495
    .line 496
    move/from16 v28, v4

    .line 497
    .line 498
    const/16 v4, 0x33

    .line 499
    .line 500
    if-lt v3, v4, :cond_23

    .line 501
    .line 502
    add-int/lit8 v4, v5, 0x1

    .line 503
    .line 504
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    move/from16 v29, v4

    .line 509
    .line 510
    const v4, 0xd800

    .line 511
    .line 512
    .line 513
    if-lt v5, v4, :cond_1b

    .line 514
    .line 515
    and-int/lit16 v5, v5, 0x1fff

    .line 516
    .line 517
    move/from16 v33, v29

    .line 518
    .line 519
    move/from16 v29, v5

    .line 520
    .line 521
    move/from16 v5, v33

    .line 522
    .line 523
    const/16 v33, 0xd

    .line 524
    .line 525
    :goto_f
    add-int/lit8 v34, v5, 0x1

    .line 526
    .line 527
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-lt v5, v4, :cond_1a

    .line 532
    .line 533
    and-int/lit16 v4, v5, 0x1fff

    .line 534
    .line 535
    shl-int v4, v4, v33

    .line 536
    .line 537
    or-int v29, v29, v4

    .line 538
    .line 539
    add-int/lit8 v33, v33, 0xd

    .line 540
    .line 541
    move/from16 v5, v34

    .line 542
    .line 543
    const v4, 0xd800

    .line 544
    .line 545
    .line 546
    goto :goto_f

    .line 547
    :cond_1a
    shl-int v4, v5, v33

    .line 548
    .line 549
    or-int v5, v29, v4

    .line 550
    .line 551
    move/from16 v4, v34

    .line 552
    .line 553
    goto :goto_10

    .line 554
    :cond_1b
    move/from16 v4, v29

    .line 555
    .line 556
    :goto_10
    move/from16 v29, v4

    .line 557
    .line 558
    add-int/lit8 v4, v3, -0x33

    .line 559
    .line 560
    move/from16 v33, v5

    .line 561
    .line 562
    const/16 v5, 0x9

    .line 563
    .line 564
    if-eq v4, v5, :cond_1c

    .line 565
    .line 566
    const/16 v5, 0x11

    .line 567
    .line 568
    if-ne v4, v5, :cond_1d

    .line 569
    .line 570
    :cond_1c
    const/4 v5, 0x1

    .line 571
    goto :goto_13

    .line 572
    :cond_1d
    const/16 v5, 0xc

    .line 573
    .line 574
    if-ne v4, v5, :cond_20

    .line 575
    .line 576
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/R2;->a()I

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    const/4 v5, 0x1

    .line 581
    if-eq v4, v5, :cond_1f

    .line 582
    .line 583
    if-eqz v28, :cond_1e

    .line 584
    .line 585
    goto :goto_11

    .line 586
    :cond_1e
    const/4 v4, 0x0

    .line 587
    goto :goto_14

    .line 588
    :cond_1f
    :goto_11
    add-int/lit8 v4, v10, 0x1

    .line 589
    .line 590
    div-int/lit8 v19, v21, 0x3

    .line 591
    .line 592
    add-int v19, v19, v19

    .line 593
    .line 594
    add-int/lit8 v19, v19, 0x1

    .line 595
    .line 596
    aget-object v10, v24, v10

    .line 597
    .line 598
    aput-object v10, v6, v19

    .line 599
    .line 600
    :goto_12
    move v10, v4

    .line 601
    :cond_20
    move/from16 v4, v28

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :goto_13
    add-int/lit8 v4, v10, 0x1

    .line 605
    .line 606
    div-int/lit8 v19, v21, 0x3

    .line 607
    .line 608
    add-int v19, v19, v19

    .line 609
    .line 610
    add-int/lit8 v30, v19, 0x1

    .line 611
    .line 612
    aget-object v5, v24, v10

    .line 613
    .line 614
    aput-object v5, v6, v30

    .line 615
    .line 616
    goto :goto_12

    .line 617
    :goto_14
    add-int v5, v33, v33

    .line 618
    .line 619
    move/from16 v28, v4

    .line 620
    .line 621
    aget-object v4, v24, v5

    .line 622
    .line 623
    move/from16 v30, v5

    .line 624
    .line 625
    instance-of v5, v4, Ljava/lang/reflect/Field;

    .line 626
    .line 627
    if-eqz v5, :cond_21

    .line 628
    .line 629
    check-cast v4, Ljava/lang/reflect/Field;

    .line 630
    .line 631
    goto :goto_15

    .line 632
    :cond_21
    check-cast v4, Ljava/lang/String;

    .line 633
    .line 634
    invoke-static {v4, v8}, Lcom/google/android/gms/internal/measurement/L2;->u(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    aput-object v4, v24, v30

    .line 639
    .line 640
    :goto_15
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 641
    .line 642
    .line 643
    move-result-wide v4

    .line 644
    long-to-int v4, v4

    .line 645
    add-int/lit8 v5, v30, 0x1

    .line 646
    .line 647
    move/from16 v30, v4

    .line 648
    .line 649
    aget-object v4, v24, v5

    .line 650
    .line 651
    move/from16 v31, v5

    .line 652
    .line 653
    instance-of v5, v4, Ljava/lang/reflect/Field;

    .line 654
    .line 655
    if-eqz v5, :cond_22

    .line 656
    .line 657
    check-cast v4, Ljava/lang/reflect/Field;

    .line 658
    .line 659
    goto :goto_16

    .line 660
    :cond_22
    check-cast v4, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v4, v8}, Lcom/google/android/gms/internal/measurement/L2;->u(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    aput-object v4, v24, v31

    .line 667
    .line 668
    :goto_16
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 669
    .line 670
    .line 671
    move-result-wide v4

    .line 672
    long-to-int v4, v4

    .line 673
    move/from16 v31, v29

    .line 674
    .line 675
    move/from16 v5, v30

    .line 676
    .line 677
    const v25, 0xd800

    .line 678
    .line 679
    .line 680
    move-object/from16 v29, v6

    .line 681
    .line 682
    move/from16 v30, v7

    .line 683
    .line 684
    move-object v6, v8

    .line 685
    const/4 v7, 0x0

    .line 686
    move v8, v4

    .line 687
    :goto_17
    move/from16 v4, v28

    .line 688
    .line 689
    goto/16 :goto_24

    .line 690
    .line 691
    :cond_23
    add-int/lit8 v4, v10, 0x1

    .line 692
    .line 693
    aget-object v29, v24, v10

    .line 694
    .line 695
    move/from16 v33, v4

    .line 696
    .line 697
    move-object/from16 v4, v29

    .line 698
    .line 699
    check-cast v4, Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v4, v8}, Lcom/google/android/gms/internal/measurement/L2;->u(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    move-object/from16 v29, v6

    .line 706
    .line 707
    const/16 v6, 0x9

    .line 708
    .line 709
    if-eq v3, v6, :cond_24

    .line 710
    .line 711
    const/16 v6, 0x11

    .line 712
    .line 713
    if-ne v3, v6, :cond_25

    .line 714
    .line 715
    :cond_24
    move/from16 v30, v7

    .line 716
    .line 717
    const/4 v7, 0x1

    .line 718
    goto/16 :goto_1d

    .line 719
    .line 720
    :cond_25
    const/16 v6, 0x1b

    .line 721
    .line 722
    if-eq v3, v6, :cond_2d

    .line 723
    .line 724
    const/16 v6, 0x31

    .line 725
    .line 726
    if-ne v3, v6, :cond_26

    .line 727
    .line 728
    add-int/lit8 v10, v10, 0x2

    .line 729
    .line 730
    move/from16 v30, v7

    .line 731
    .line 732
    const/4 v7, 0x1

    .line 733
    goto/16 :goto_1c

    .line 734
    .line 735
    :cond_26
    const/16 v6, 0xc

    .line 736
    .line 737
    if-eq v3, v6, :cond_2a

    .line 738
    .line 739
    const/16 v6, 0x1e

    .line 740
    .line 741
    if-eq v3, v6, :cond_2a

    .line 742
    .line 743
    const/16 v6, 0x2c

    .line 744
    .line 745
    if-ne v3, v6, :cond_27

    .line 746
    .line 747
    goto :goto_19

    .line 748
    :cond_27
    const/16 v6, 0x32

    .line 749
    .line 750
    if-ne v3, v6, :cond_29

    .line 751
    .line 752
    add-int/lit8 v6, v10, 0x2

    .line 753
    .line 754
    add-int/lit8 v30, v22, 0x1

    .line 755
    .line 756
    aput v21, v15, v22

    .line 757
    .line 758
    div-int/lit8 v22, v21, 0x3

    .line 759
    .line 760
    aget-object v31, v24, v33

    .line 761
    .line 762
    add-int v22, v22, v22

    .line 763
    .line 764
    aput-object v31, v29, v22

    .line 765
    .line 766
    if-eqz v28, :cond_28

    .line 767
    .line 768
    add-int/lit8 v22, v22, 0x1

    .line 769
    .line 770
    add-int/lit8 v10, v10, 0x3

    .line 771
    .line 772
    aget-object v6, v24, v6

    .line 773
    .line 774
    aput-object v6, v29, v22

    .line 775
    .line 776
    move-object v6, v8

    .line 777
    move/from16 v22, v30

    .line 778
    .line 779
    :goto_18
    move/from16 v30, v7

    .line 780
    .line 781
    goto :goto_1f

    .line 782
    :cond_28
    move v10, v6

    .line 783
    move-object v6, v8

    .line 784
    move/from16 v22, v30

    .line 785
    .line 786
    const/16 v28, 0x0

    .line 787
    .line 788
    goto :goto_18

    .line 789
    :cond_29
    move/from16 v30, v7

    .line 790
    .line 791
    const/4 v7, 0x1

    .line 792
    goto :goto_1e

    .line 793
    :cond_2a
    :goto_19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/R2;->a()I

    .line 794
    .line 795
    .line 796
    move-result v6

    .line 797
    move/from16 v30, v7

    .line 798
    .line 799
    const/4 v7, 0x1

    .line 800
    if-eq v6, v7, :cond_2c

    .line 801
    .line 802
    if-eqz v28, :cond_2b

    .line 803
    .line 804
    goto :goto_1a

    .line 805
    :cond_2b
    move-object v6, v8

    .line 806
    move/from16 v10, v33

    .line 807
    .line 808
    const/16 v28, 0x0

    .line 809
    .line 810
    goto :goto_1f

    .line 811
    :cond_2c
    :goto_1a
    add-int/lit8 v10, v10, 0x2

    .line 812
    .line 813
    div-int/lit8 v6, v21, 0x3

    .line 814
    .line 815
    add-int/2addr v6, v6

    .line 816
    add-int/2addr v6, v7

    .line 817
    aget-object v19, v24, v33

    .line 818
    .line 819
    aput-object v19, v29, v6

    .line 820
    .line 821
    :goto_1b
    move-object v6, v8

    .line 822
    goto :goto_1f

    .line 823
    :cond_2d
    move/from16 v30, v7

    .line 824
    .line 825
    const/4 v7, 0x1

    .line 826
    add-int/lit8 v10, v10, 0x2

    .line 827
    .line 828
    :goto_1c
    div-int/lit8 v6, v21, 0x3

    .line 829
    .line 830
    add-int/2addr v6, v6

    .line 831
    add-int/2addr v6, v7

    .line 832
    aget-object v19, v24, v33

    .line 833
    .line 834
    aput-object v19, v29, v6

    .line 835
    .line 836
    goto :goto_1b

    .line 837
    :goto_1d
    div-int/lit8 v6, v21, 0x3

    .line 838
    .line 839
    add-int/2addr v6, v6

    .line 840
    add-int/2addr v6, v7

    .line 841
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-result-object v10

    .line 845
    aput-object v10, v29, v6

    .line 846
    .line 847
    :goto_1e
    move-object v6, v8

    .line 848
    move/from16 v10, v33

    .line 849
    .line 850
    :goto_1f
    invoke-virtual {v14, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 851
    .line 852
    .line 853
    move-result-wide v7

    .line 854
    long-to-int v4, v7

    .line 855
    and-int/lit16 v7, v2, 0x1000

    .line 856
    .line 857
    const v8, 0xfffff

    .line 858
    .line 859
    .line 860
    if-eqz v7, :cond_31

    .line 861
    .line 862
    const/16 v7, 0x11

    .line 863
    .line 864
    if-gt v3, v7, :cond_31

    .line 865
    .line 866
    add-int/lit8 v7, v5, 0x1

    .line 867
    .line 868
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    const v8, 0xd800

    .line 873
    .line 874
    .line 875
    if-lt v5, v8, :cond_2f

    .line 876
    .line 877
    and-int/lit16 v5, v5, 0x1fff

    .line 878
    .line 879
    const/16 v25, 0xd

    .line 880
    .line 881
    :goto_20
    add-int/lit8 v31, v7, 0x1

    .line 882
    .line 883
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 884
    .line 885
    .line 886
    move-result v7

    .line 887
    if-lt v7, v8, :cond_2e

    .line 888
    .line 889
    and-int/lit16 v7, v7, 0x1fff

    .line 890
    .line 891
    shl-int v7, v7, v25

    .line 892
    .line 893
    or-int/2addr v5, v7

    .line 894
    add-int/lit8 v25, v25, 0xd

    .line 895
    .line 896
    move/from16 v7, v31

    .line 897
    .line 898
    goto :goto_20

    .line 899
    :cond_2e
    shl-int v7, v7, v25

    .line 900
    .line 901
    or-int/2addr v5, v7

    .line 902
    goto :goto_21

    .line 903
    :cond_2f
    move/from16 v31, v7

    .line 904
    .line 905
    :goto_21
    add-int v7, v30, v30

    .line 906
    .line 907
    div-int/lit8 v25, v5, 0x20

    .line 908
    .line 909
    add-int v25, v25, v7

    .line 910
    .line 911
    aget-object v7, v24, v25

    .line 912
    .line 913
    instance-of v8, v7, Ljava/lang/reflect/Field;

    .line 914
    .line 915
    if-eqz v8, :cond_30

    .line 916
    .line 917
    check-cast v7, Ljava/lang/reflect/Field;

    .line 918
    .line 919
    goto :goto_22

    .line 920
    :cond_30
    check-cast v7, Ljava/lang/String;

    .line 921
    .line 922
    invoke-static {v7, v6}, Lcom/google/android/gms/internal/measurement/L2;->u(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 923
    .line 924
    .line 925
    move-result-object v7

    .line 926
    aput-object v7, v24, v25

    .line 927
    .line 928
    :goto_22
    invoke-virtual {v14, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 929
    .line 930
    .line 931
    move-result-wide v7

    .line 932
    long-to-int v7, v7

    .line 933
    rem-int/lit8 v5, v5, 0x20

    .line 934
    .line 935
    move v8, v7

    .line 936
    const v25, 0xd800

    .line 937
    .line 938
    .line 939
    goto :goto_23

    .line 940
    :cond_31
    const v25, 0xd800

    .line 941
    .line 942
    .line 943
    move/from16 v31, v5

    .line 944
    .line 945
    const/4 v5, 0x0

    .line 946
    :goto_23
    const/16 v7, 0x12

    .line 947
    .line 948
    if-lt v3, v7, :cond_32

    .line 949
    .line 950
    const/16 v7, 0x31

    .line 951
    .line 952
    if-gt v3, v7, :cond_32

    .line 953
    .line 954
    add-int/lit8 v7, v23, 0x1

    .line 955
    .line 956
    aput v4, v15, v23

    .line 957
    .line 958
    move/from16 v23, v7

    .line 959
    .line 960
    :cond_32
    move v7, v5

    .line 961
    move v5, v4

    .line 962
    goto/16 :goto_17

    .line 963
    .line 964
    :goto_24
    add-int/lit8 v28, v21, 0x1

    .line 965
    .line 966
    aput v26, v11, v21

    .line 967
    .line 968
    add-int/lit8 v26, v21, 0x2

    .line 969
    .line 970
    move-object/from16 v32, v1

    .line 971
    .line 972
    and-int/lit16 v1, v2, 0x200

    .line 973
    .line 974
    if-eqz v1, :cond_33

    .line 975
    .line 976
    const/high16 v1, 0x20000000

    .line 977
    .line 978
    goto :goto_25

    .line 979
    :cond_33
    const/4 v1, 0x0

    .line 980
    :goto_25
    and-int/lit16 v2, v2, 0x100

    .line 981
    .line 982
    if-eqz v2, :cond_34

    .line 983
    .line 984
    const/high16 v2, 0x10000000

    .line 985
    .line 986
    goto :goto_26

    .line 987
    :cond_34
    const/4 v2, 0x0

    .line 988
    :goto_26
    if-eqz v4, :cond_35

    .line 989
    .line 990
    const/high16 v4, -0x80000000

    .line 991
    .line 992
    goto :goto_27

    .line 993
    :cond_35
    const/4 v4, 0x0

    .line 994
    :goto_27
    shl-int/lit8 v3, v3, 0x14

    .line 995
    .line 996
    or-int/2addr v1, v2

    .line 997
    or-int/2addr v1, v4

    .line 998
    or-int/2addr v1, v3

    .line 999
    or-int/2addr v1, v5

    .line 1000
    aput v1, v11, v28

    .line 1001
    .line 1002
    add-int/lit8 v21, v21, 0x3

    .line 1003
    .line 1004
    shl-int/lit8 v1, v7, 0x14

    .line 1005
    .line 1006
    or-int/2addr v1, v8

    .line 1007
    aput v1, v11, v26

    .line 1008
    .line 1009
    move-object v8, v6

    .line 1010
    move-object/from16 v3, v24

    .line 1011
    .line 1012
    move/from16 v5, v25

    .line 1013
    .line 1014
    move/from16 v2, v27

    .line 1015
    .line 1016
    move-object/from16 v6, v29

    .line 1017
    .line 1018
    move/from16 v7, v30

    .line 1019
    .line 1020
    move/from16 v4, v31

    .line 1021
    .line 1022
    move-object/from16 v1, v32

    .line 1023
    .line 1024
    goto/16 :goto_b

    .line 1025
    .line 1026
    :cond_36
    move-object/from16 v29, v6

    .line 1027
    .line 1028
    new-instance v1, Lcom/google/android/gms/internal/measurement/L2;

    .line 1029
    .line 1030
    iget-object v14, v0, Lcom/google/android/gms/internal/measurement/R2;->a:Lcom/google/android/gms/internal/measurement/Y1;

    .line 1031
    .line 1032
    move-object/from16 v18, p1

    .line 1033
    .line 1034
    move-object/from16 v19, p2

    .line 1035
    .line 1036
    move/from16 v17, v9

    .line 1037
    .line 1038
    move-object v10, v11

    .line 1039
    move-object/from16 v11, v29

    .line 1040
    .line 1041
    move-object v9, v1

    .line 1042
    invoke-direct/range {v9 .. v19}, Lcom/google/android/gms/internal/measurement/L2;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/Y1;[IIILcom/google/android/gms/internal/measurement/o2;Lcom/google/android/gms/internal/measurement/o2;)V

    .line 1043
    .line 1044
    .line 1045
    return-object v9

    .line 1046
    :cond_37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1050
    .line 1051
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1052
    .line 1053
    .line 1054
    throw v0
.end method

.method public static u(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/lit8 v3, v3, 0xb

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    add-int/2addr v3, v4

    .line 60
    add-int/lit8 v3, v3, 0x1d

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    add-int/2addr v3, v4

    .line 69
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 70
    .line 71
    .line 72
    const-string v3, "Field "

    .line 73
    .line 74
    const-string v4, " for "

    .line 75
    .line 76
    invoke-static {v5, v3, p0, v4, p1}, Lk1/i;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p0, " not found. Known fields are "

    .line 80
    .line 81
    invoke-static {v5, p0, v1}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v2
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final B(IILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const v1, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p2, v1

    .line 26
    int-to-long v1, p2

    .line 27
    invoke-virtual {p1, p3, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method public final C(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v3, v1

    .line 12
    invoke-virtual {v0, p3, v3, v4, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 p2, p2, 0x2

    .line 16
    .line 17
    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 18
    .line 19
    aget p2, p4, p2

    .line 20
    .line 21
    and-int/2addr p2, v2

    .line 22
    int-to-long v0, p2

    .line 23
    invoke-static {p1, v0, v1, p3}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final D(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q2;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/q2;->j()V

    .line 18
    .line 19
    .line 20
    iput v1, v0, Lcom/google/android/gms/internal/measurement/Y1;->zza:I

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/q2;->f()V

    .line 23
    .line 24
    .line 25
    :cond_1
    move v0, v1

    .line 26
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 27
    .line 28
    array-length v3, v2

    .line 29
    if-ge v0, v3, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const v4, 0xfffff

    .line 36
    .line 37
    .line 38
    and-int/2addr v4, v3

    .line 39
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-long v4, v4

    .line 44
    const/16 v6, 0x9

    .line 45
    .line 46
    if-eq v3, v6, :cond_3

    .line 47
    .line 48
    const/16 v6, 0x3c

    .line 49
    .line 50
    if-eq v3, v6, :cond_2

    .line 51
    .line 52
    const/16 v6, 0x44

    .line 53
    .line 54
    if-eq v3, v6, :cond_2

    .line 55
    .line 56
    packed-switch v3, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 61
    .line 62
    invoke-virtual {v2, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    move-object v6, v3

    .line 69
    check-cast v6, Lcom/google/android/gms/internal/measurement/H2;

    .line 70
    .line 71
    iput-boolean v1, v6, Lcom/google/android/gms/internal/measurement/H2;->q:Z

    .line 72
    .line 73
    invoke-virtual {v2, p1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_1
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lcom/google/android/gms/internal/measurement/w2;

    .line 82
    .line 83
    check-cast v2, Lcom/google/android/gms/internal/measurement/Z1;

    .line 84
    .line 85
    iget-boolean v3, v2, Lcom/google/android/gms/internal/measurement/Z1;->q:Z

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    iput-boolean v1, v2, Lcom/google/android/gms/internal/measurement/Z1;->q:Z

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    aget v2, v2, v0

    .line 93
    .line 94
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    sget-object v3, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 105
    .line 106
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/measurement/S2;->a(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    :pswitch_2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget-object v3, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 125
    .line 126
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/measurement/S2;->a(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->i:Lcom/google/android/gms/internal/measurement/o2;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    check-cast p1, Lcom/google/android/gms/internal/measurement/q2;

    .line 142
    .line 143
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 144
    .line 145
    iget-boolean v0, p1, Lcom/google/android/gms/internal/measurement/Y2;->e:Z

    .line 146
    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    iput-boolean v1, p1, Lcom/google/android/gms/internal/measurement/Y2;->e:Z

    .line 150
    .line 151
    :cond_6
    :goto_2
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x11
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
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-long v5, v5

    .line 22
    packed-switch v3, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :pswitch_0
    add-int/lit8 v3, v1, 0x2

    .line 28
    .line 29
    aget v2, v2, v3

    .line 30
    .line 31
    and-int/2addr v2, v4

    .line 32
    int-to-long v2, v2

    .line 33
    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v2, v3, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v4, v2, :cond_2

    .line 42
    .line 43
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_1
    if-nez v2, :cond_0

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_3
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :pswitch_4
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    cmp-long v2, v2, v4

    .line 125
    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_5
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-ne v2, v3, :cond_2

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :pswitch_6
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    cmp-long v2, v2, v4

    .line 163
    .line 164
    if-nez v2, :cond_2

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_7
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_2

    .line 173
    .line 174
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-ne v2, v3, :cond_2

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_8
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_2

    .line 191
    .line 192
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-ne v2, v3, :cond_2

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_9
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_2

    .line 209
    .line 210
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-ne v2, v3, :cond_2

    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_a
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_2

    .line 227
    .line 228
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_b
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_2

    .line 249
    .line 250
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_2

    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :pswitch_c
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_2

    .line 271
    .line 272
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/T2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_2

    .line 285
    .line 286
    goto/16 :goto_2

    .line 287
    .line 288
    :pswitch_d
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_2

    .line 293
    .line 294
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 295
    .line 296
    invoke-virtual {v2, v5, v6, p1}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    invoke-virtual {v2, v5, v6, p2}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-ne v3, v2, :cond_2

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :pswitch_e
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_2

    .line 313
    .line 314
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-ne v2, v3, :cond_2

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :pswitch_f
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_2

    .line 331
    .line 332
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 333
    .line 334
    .line 335
    move-result-wide v2

    .line 336
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 337
    .line 338
    .line 339
    move-result-wide v4

    .line 340
    cmp-long v2, v2, v4

    .line 341
    .line 342
    if-nez v2, :cond_2

    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :pswitch_10
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_2

    .line 351
    .line 352
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ne v2, v3, :cond_2

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :pswitch_11
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_2

    .line 368
    .line 369
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 374
    .line 375
    .line 376
    move-result-wide v4

    .line 377
    cmp-long v2, v2, v4

    .line 378
    .line 379
    if-nez v2, :cond_2

    .line 380
    .line 381
    goto :goto_2

    .line 382
    :pswitch_12
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_2

    .line 387
    .line 388
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 389
    .line 390
    .line 391
    move-result-wide v2

    .line 392
    invoke-static {v5, v6, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    cmp-long v2, v2, v4

    .line 397
    .line 398
    if-nez v2, :cond_2

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :pswitch_13
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_2

    .line 406
    .line 407
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 408
    .line 409
    invoke-virtual {v2, v5, v6, p1}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-virtual {v2, v5, v6, p2}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-ne v3, v2, :cond_2

    .line 426
    .line 427
    goto :goto_2

    .line 428
    :pswitch_14
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/L2;->l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    if-eqz v2, :cond_2

    .line 433
    .line 434
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 435
    .line 436
    invoke-virtual {v2, v5, v6, p1}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 437
    .line 438
    .line 439
    move-result-wide v3

    .line 440
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 441
    .line 442
    .line 443
    move-result-wide v3

    .line 444
    invoke-virtual {v2, v5, v6, p2}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 445
    .line 446
    .line 447
    move-result-wide v5

    .line 448
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 449
    .line 450
    .line 451
    move-result-wide v5

    .line 452
    cmp-long v2, v3, v5

    .line 453
    .line 454
    if-nez v2, :cond_2

    .line 455
    .line 456
    :cond_0
    :goto_2
    add-int/lit8 v1, v1, 0x3

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 461
    .line 462
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 463
    .line 464
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/Y2;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    if-nez p1, :cond_3

    .line 469
    .line 470
    :cond_2
    :goto_3
    return v0

    .line 471
    :cond_3
    const/4 p1, 0x1

    .line 472
    return p1

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
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

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const v3, 0xfffff

    .line 21
    .line 22
    .line 23
    and-int v4, v2, v3

    .line 24
    .line 25
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    aget v5, v1, v0

    .line 30
    .line 31
    int-to-long v8, v4

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_1
    move-object v7, p1

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :pswitch_1
    invoke-virtual {p0, v5, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v8, v9, p1, v2}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v0, 0x2

    .line 56
    .line 57
    aget v1, v1, v2

    .line 58
    .line 59
    and-int/2addr v1, v3

    .line 60
    int-to-long v1, v1

    .line 61
    invoke-static {v5, v1, v2, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_3
    invoke-virtual {p0, v5, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v8, v9, p1, v2}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v2, v0, 0x2

    .line 83
    .line 84
    aget v1, v1, v2

    .line 85
    .line 86
    and-int/2addr v1, v3

    .line 87
    int-to-long v1, v1

    .line 88
    invoke-static {v5, v1, v2, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :pswitch_4
    sget-object v1, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 93
    .line 94
    invoke-static {v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/o2;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/H2;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v8, v9, p1, v1}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_5
    invoke-static {v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lcom/google/android/gms/internal/measurement/w2;

    .line 115
    .line 116
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lcom/google/android/gms/internal/measurement/w2;

    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-lez v3, :cond_2

    .line 131
    .line 132
    if-lez v4, :cond_2

    .line 133
    .line 134
    move-object v5, v1

    .line 135
    check-cast v5, Lcom/google/android/gms/internal/measurement/Z1;

    .line 136
    .line 137
    iget-boolean v5, v5, Lcom/google/android/gms/internal/measurement/Z1;->q:Z

    .line 138
    .line 139
    if-nez v5, :cond_1

    .line 140
    .line 141
    add-int/2addr v4, v3

    .line 142
    invoke-interface {v1, v4}, Lcom/google/android/gms/internal/measurement/w2;->K(I)Lcom/google/android/gms/internal/measurement/w2;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 147
    .line 148
    .line 149
    :cond_2
    if-gtz v3, :cond_3

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    move-object v2, v1

    .line 153
    :goto_2
    invoke-static {v8, v9, p1, v2}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->v(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_0

    .line 166
    .line 167
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    invoke-static {p1, v8, v9, v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->i(Ljava/lang/Object;JJ)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_1

    .line 178
    .line 179
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_0

    .line 184
    .line 185
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_0

    .line 202
    .line 203
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v1

    .line 207
    invoke-static {p1, v8, v9, v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->i(Ljava/lang/Object;JJ)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_0

    .line 220
    .line 221
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_0

    .line 238
    .line 239
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_0

    .line 256
    .line 257
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_0

    .line 274
    .line 275
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v8, v9, p1, v1}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->v(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eqz v1, :cond_0

    .line 297
    .line 298
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-static {v8, v9, p1, v1}, Lcom/google/android/gms/internal/measurement/d3;->k(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_0

    .line 315
    .line 316
    sget-object v1, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 317
    .line 318
    invoke-virtual {v1, v8, v9, p2}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    invoke-virtual {v1, p1, v8, v9, v2}, Lcom/google/android/gms/internal/measurement/c3;->c(Ljava/lang/Object;JZ)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_0

    .line 335
    .line 336
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_0

    .line 353
    .line 354
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 355
    .line 356
    .line 357
    move-result-wide v1

    .line 358
    invoke-static {p1, v8, v9, v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->i(Ljava/lang/Object;JJ)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_0

    .line 371
    .line 372
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-static {v1, v8, v9, p1}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_0

    .line 389
    .line 390
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 391
    .line 392
    .line 393
    move-result-wide v1

    .line 394
    invoke-static {p1, v8, v9, v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->i(Ljava/lang/Object;JJ)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_1

    .line 401
    .line 402
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_0

    .line 407
    .line 408
    invoke-static {v8, v9, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 409
    .line 410
    .line 411
    move-result-wide v1

    .line 412
    invoke-static {p1, v8, v9, v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->i(Ljava/lang/Object;JJ)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_1

    .line 419
    .line 420
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-eqz v1, :cond_0

    .line 425
    .line 426
    sget-object v1, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 427
    .line 428
    invoke-virtual {v1, v8, v9, p2}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    invoke-virtual {v1, p1, v8, v9, v2}, Lcom/google/android/gms/internal/measurement/c3;->e(Ljava/lang/Object;JF)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_1

    .line 439
    .line 440
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_0

    .line 445
    .line 446
    sget-object v6, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 447
    .line 448
    invoke-virtual {v6, v8, v9, p2}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 449
    .line 450
    .line 451
    move-result-wide v10

    .line 452
    move-object v7, p1

    .line 453
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/c3;->g(Ljava/lang/Object;JD)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p0, v0, v7}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :goto_3
    add-int/lit8 v0, v0, 0x3

    .line 460
    .line 461
    move-object p1, v7

    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_4
    move-object v7, p1

    .line 465
    invoke-static {v7, p2}, Lcom/google/android/gms/internal/measurement/T2;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_5
    move-object v7, p1

    .line 470
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 471
    .line 472
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    const-string v0, "Mutating immutable message: "

    .line 477
    .line 478
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p2

    .line 482
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw p1

    .line 486
    nop

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
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
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
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

.method public final d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/b2;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/L2;->s(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/b2;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/F2;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    sget-object v7, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const v9, 0xfffff

    .line 11
    .line 12
    .line 13
    move v2, v8

    .line 14
    move v4, v2

    .line 15
    move v3, v9

    .line 16
    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 17
    .line 18
    array-length v10, v5

    .line 19
    if-ge v2, v10, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    aget v12, v5, v2

    .line 30
    .line 31
    const/16 v13, 0x11

    .line 32
    .line 33
    const/4 v14, 0x1

    .line 34
    if-gt v11, v13, :cond_2

    .line 35
    .line 36
    add-int/lit8 v13, v2, 0x2

    .line 37
    .line 38
    aget v13, v5, v13

    .line 39
    .line 40
    and-int v15, v13, v9

    .line 41
    .line 42
    if-eq v15, v3, :cond_1

    .line 43
    .line 44
    if-ne v15, v9, :cond_0

    .line 45
    .line 46
    move v4, v8

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    int-to-long v3, v15

    .line 49
    invoke-virtual {v7, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    move v4, v3

    .line 54
    :goto_1
    move v3, v15

    .line 55
    :cond_1
    ushr-int/lit8 v13, v13, 0x14

    .line 56
    .line 57
    shl-int v13, v14, v13

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move v13, v8

    .line 61
    :goto_2
    and-int/2addr v10, v9

    .line 62
    int-to-long v9, v10

    .line 63
    const/16 v16, 0x3f

    .line 64
    .line 65
    const/4 v15, 0x2

    .line 66
    packed-switch v11, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    goto/16 :goto_a

    .line 70
    .line 71
    :pswitch_0
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v6, v12, v5, v9}, Lcom/google/android/gms/internal/measurement/F2;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :pswitch_1
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_7

    .line 95
    .line 96
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    add-long v13, v9, v9

    .line 101
    .line 102
    shr-long v9, v9, v16

    .line 103
    .line 104
    xor-long/2addr v9, v13

    .line 105
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 108
    .line 109
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_a

    .line 113
    .line 114
    :pswitch_2
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_7

    .line 119
    .line 120
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    add-int v9, v5, v5

    .line 125
    .line 126
    shr-int/lit8 v5, v5, 0x1f

    .line 127
    .line 128
    xor-int/2addr v5, v9

    .line 129
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 132
    .line 133
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->g0(II)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :pswitch_3
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_7

    .line 143
    .line 144
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 151
    .line 152
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_a

    .line 156
    .line 157
    :pswitch_4
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_7

    .line 162
    .line 163
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 170
    .line 171
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_a

    .line 175
    .line 176
    :pswitch_5
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 189
    .line 190
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->f0(II)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_a

    .line 194
    .line 195
    :pswitch_6
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_7

    .line 200
    .line 201
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 208
    .line 209
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->g0(II)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_a

    .line 213
    .line 214
    :pswitch_7
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_7

    .line 219
    .line 220
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    check-cast v5, Lcom/google/android/gms/internal/measurement/f2;

    .line 225
    .line 226
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 229
    .line 230
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_a

    .line 234
    .line 235
    :pswitch_8
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_7

    .line 240
    .line 241
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-virtual {v6, v12, v5, v9}, Lcom/google/android/gms/internal/measurement/F2;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_a

    .line 253
    .line 254
    :pswitch_9
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_7

    .line 259
    .line 260
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    instance-of v9, v5, Ljava/lang/String;

    .line 265
    .line 266
    if-eqz v9, :cond_3

    .line 267
    .line 268
    check-cast v5, Ljava/lang/String;

    .line 269
    .line 270
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 273
    .line 274
    shl-int/lit8 v10, v12, 0x3

    .line 275
    .line 276
    or-int/2addr v10, v15

    .line 277
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/g2;->t0(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_a

    .line 284
    .line 285
    :cond_3
    check-cast v5, Lcom/google/android/gms/internal/measurement/f2;

    .line 286
    .line 287
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 290
    .line 291
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_a

    .line 295
    .line 296
    :pswitch_a
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    if-eqz v5, :cond_7

    .line 301
    .line 302
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    check-cast v5, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 315
    .line 316
    shl-int/lit8 v10, v12, 0x3

    .line 317
    .line 318
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/g2;->m0(B)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_a

    .line 325
    .line 326
    :pswitch_b
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-eqz v5, :cond_7

    .line 331
    .line 332
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 339
    .line 340
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_a

    .line 344
    .line 345
    :pswitch_c
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_7

    .line 350
    .line 351
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 352
    .line 353
    .line 354
    move-result-wide v9

    .line 355
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 358
    .line 359
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_a

    .line 363
    .line 364
    :pswitch_d
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    if-eqz v5, :cond_7

    .line 369
    .line 370
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 377
    .line 378
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->f0(II)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_a

    .line 382
    .line 383
    :pswitch_e
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_7

    .line 388
    .line 389
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 390
    .line 391
    .line 392
    move-result-wide v9

    .line 393
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 396
    .line 397
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_a

    .line 401
    .line 402
    :pswitch_f
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_7

    .line 407
    .line 408
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 409
    .line 410
    .line 411
    move-result-wide v9

    .line 412
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 415
    .line 416
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_a

    .line 420
    .line 421
    :pswitch_10
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_7

    .line 426
    .line 427
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Ljava/lang/Float;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    iget-object v9, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v9, Lcom/google/android/gms/internal/measurement/g2;

    .line 440
    .line 441
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    invoke-virtual {v9, v12, v5}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 446
    .line 447
    .line 448
    goto/16 :goto_a

    .line 449
    .line 450
    :pswitch_11
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-eqz v5, :cond_7

    .line 455
    .line 456
    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    check-cast v5, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 463
    .line 464
    .line 465
    move-result-wide v9

    .line 466
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 469
    .line 470
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 471
    .line 472
    .line 473
    move-result-wide v9

    .line 474
    invoke-virtual {v5, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_a

    .line 478
    .line 479
    :pswitch_12
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    if-eqz v5, :cond_7

    .line 484
    .line 485
    div-int/lit8 v9, v2, 0x3

    .line 486
    .line 487
    iget-object v10, v0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 488
    .line 489
    add-int/2addr v9, v9

    .line 490
    aget-object v9, v10, v9

    .line 491
    .line 492
    check-cast v9, Lcom/google/android/gms/internal/measurement/G2;

    .line 493
    .line 494
    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/G2;->a:Lcom/google/android/gms/internal/measurement/t;

    .line 495
    .line 496
    check-cast v5, Lcom/google/android/gms/internal/measurement/H2;

    .line 497
    .line 498
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/H2;->entrySet()Ljava/util/Set;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    if-eqz v10, :cond_7

    .line 514
    .line 515
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    check-cast v10, Ljava/util/Map$Entry;

    .line 520
    .line 521
    iget-object v11, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v11, Lcom/google/android/gms/internal/measurement/g2;

    .line 524
    .line 525
    invoke-virtual {v11, v12, v15}, Lcom/google/android/gms/internal/measurement/g2;->e0(II)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v13

    .line 532
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v14

    .line 536
    invoke-static {v9, v13, v14}, Lcom/google/android/gms/internal/measurement/G2;->b(Lcom/google/android/gms/internal/measurement/t;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 541
    .line 542
    .line 543
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v13

    .line 547
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    invoke-static {v11, v9, v13, v10}, Lcom/google/android/gms/internal/measurement/G2;->a(Lcom/google/android/gms/internal/measurement/g2;Lcom/google/android/gms/internal/measurement/t;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    goto :goto_3

    .line 555
    :pswitch_13
    aget v5, v5, v2

    .line 556
    .line 557
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    check-cast v9, Ljava/util/List;

    .line 562
    .line 563
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    sget-object v11, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 568
    .line 569
    if-eqz v9, :cond_7

    .line 570
    .line 571
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    if-nez v11, :cond_7

    .line 576
    .line 577
    move v11, v8

    .line 578
    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 579
    .line 580
    .line 581
    move-result v12

    .line 582
    if-ge v11, v12, :cond_7

    .line 583
    .line 584
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v12

    .line 588
    invoke-virtual {v6, v5, v12, v10}, Lcom/google/android/gms/internal/measurement/F2;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 589
    .line 590
    .line 591
    add-int/lit8 v11, v11, 0x1

    .line 592
    .line 593
    goto :goto_4

    .line 594
    :pswitch_14
    aget v5, v5, v2

    .line 595
    .line 596
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    check-cast v9, Ljava/util/List;

    .line 601
    .line 602
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->g(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_a

    .line 606
    .line 607
    :pswitch_15
    aget v5, v5, v2

    .line 608
    .line 609
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v9

    .line 613
    check-cast v9, Ljava/util/List;

    .line 614
    .line 615
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->l(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_a

    .line 619
    .line 620
    :pswitch_16
    aget v5, v5, v2

    .line 621
    .line 622
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    check-cast v9, Ljava/util/List;

    .line 627
    .line 628
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_a

    .line 632
    .line 633
    :pswitch_17
    aget v5, v5, v2

    .line 634
    .line 635
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    check-cast v9, Ljava/util/List;

    .line 640
    .line 641
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->n(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_a

    .line 645
    .line 646
    :pswitch_18
    aget v5, v5, v2

    .line 647
    .line 648
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v9

    .line 652
    check-cast v9, Ljava/util/List;

    .line 653
    .line 654
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->o(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_a

    .line 658
    .line 659
    :pswitch_19
    aget v5, v5, v2

    .line 660
    .line 661
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v9

    .line 665
    check-cast v9, Ljava/util/List;

    .line 666
    .line 667
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_a

    .line 671
    .line 672
    :pswitch_1a
    aget v5, v5, v2

    .line 673
    .line 674
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v9

    .line 678
    check-cast v9, Ljava/util/List;

    .line 679
    .line 680
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->p(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_a

    .line 684
    .line 685
    :pswitch_1b
    aget v5, v5, v2

    .line 686
    .line 687
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v9

    .line 691
    check-cast v9, Ljava/util/List;

    .line 692
    .line 693
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->m(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 694
    .line 695
    .line 696
    goto/16 :goto_a

    .line 697
    .line 698
    :pswitch_1c
    aget v5, v5, v2

    .line 699
    .line 700
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    check-cast v9, Ljava/util/List;

    .line 705
    .line 706
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->h(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 707
    .line 708
    .line 709
    goto/16 :goto_a

    .line 710
    .line 711
    :pswitch_1d
    aget v5, v5, v2

    .line 712
    .line 713
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v9

    .line 717
    check-cast v9, Ljava/util/List;

    .line 718
    .line 719
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 720
    .line 721
    .line 722
    goto/16 :goto_a

    .line 723
    .line 724
    :pswitch_1e
    aget v5, v5, v2

    .line 725
    .line 726
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v9

    .line 730
    check-cast v9, Ljava/util/List;

    .line 731
    .line 732
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->f(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_a

    .line 736
    .line 737
    :pswitch_1f
    aget v5, v5, v2

    .line 738
    .line 739
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    check-cast v9, Ljava/util/List;

    .line 744
    .line 745
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->e(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 746
    .line 747
    .line 748
    goto/16 :goto_a

    .line 749
    .line 750
    :pswitch_20
    aget v5, v5, v2

    .line 751
    .line 752
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v9

    .line 756
    check-cast v9, Ljava/util/List;

    .line 757
    .line 758
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->d(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 759
    .line 760
    .line 761
    goto/16 :goto_a

    .line 762
    .line 763
    :pswitch_21
    aget v5, v5, v2

    .line 764
    .line 765
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    check-cast v9, Ljava/util/List;

    .line 770
    .line 771
    invoke-static {v5, v9, v6, v14}, Lcom/google/android/gms/internal/measurement/T2;->c(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 772
    .line 773
    .line 774
    goto/16 :goto_a

    .line 775
    .line 776
    :pswitch_22
    aget v5, v5, v2

    .line 777
    .line 778
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v9

    .line 782
    check-cast v9, Ljava/util/List;

    .line 783
    .line 784
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->g(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 785
    .line 786
    .line 787
    goto/16 :goto_a

    .line 788
    .line 789
    :pswitch_23
    aget v5, v5, v2

    .line 790
    .line 791
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v9

    .line 795
    check-cast v9, Ljava/util/List;

    .line 796
    .line 797
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->l(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 798
    .line 799
    .line 800
    goto/16 :goto_a

    .line 801
    .line 802
    :pswitch_24
    aget v5, v5, v2

    .line 803
    .line 804
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v9

    .line 808
    check-cast v9, Ljava/util/List;

    .line 809
    .line 810
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_a

    .line 814
    .line 815
    :pswitch_25
    aget v5, v5, v2

    .line 816
    .line 817
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v9

    .line 821
    check-cast v9, Ljava/util/List;

    .line 822
    .line 823
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->n(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 824
    .line 825
    .line 826
    goto/16 :goto_a

    .line 827
    .line 828
    :pswitch_26
    aget v5, v5, v2

    .line 829
    .line 830
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v9

    .line 834
    check-cast v9, Ljava/util/List;

    .line 835
    .line 836
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->o(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 837
    .line 838
    .line 839
    goto/16 :goto_a

    .line 840
    .line 841
    :pswitch_27
    aget v5, v5, v2

    .line 842
    .line 843
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v9

    .line 847
    check-cast v9, Ljava/util/List;

    .line 848
    .line 849
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 850
    .line 851
    .line 852
    goto/16 :goto_a

    .line 853
    .line 854
    :pswitch_28
    aget v5, v5, v2

    .line 855
    .line 856
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v9

    .line 860
    check-cast v9, Ljava/util/List;

    .line 861
    .line 862
    sget-object v10, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 863
    .line 864
    if-eqz v9, :cond_7

    .line 865
    .line 866
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 867
    .line 868
    .line 869
    move-result v10

    .line 870
    if-nez v10, :cond_7

    .line 871
    .line 872
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    move v10, v8

    .line 876
    :goto_5
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    if-ge v10, v11, :cond_7

    .line 881
    .line 882
    iget-object v11, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v11, Lcom/google/android/gms/internal/measurement/g2;

    .line 885
    .line 886
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v12

    .line 890
    check-cast v12, Lcom/google/android/gms/internal/measurement/f2;

    .line 891
    .line 892
    invoke-virtual {v11, v5, v12}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 893
    .line 894
    .line 895
    add-int/lit8 v10, v10, 0x1

    .line 896
    .line 897
    goto :goto_5

    .line 898
    :pswitch_29
    aget v5, v5, v2

    .line 899
    .line 900
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v9

    .line 904
    check-cast v9, Ljava/util/List;

    .line 905
    .line 906
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 907
    .line 908
    .line 909
    move-result-object v10

    .line 910
    sget-object v11, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 911
    .line 912
    if-eqz v9, :cond_7

    .line 913
    .line 914
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 915
    .line 916
    .line 917
    move-result v11

    .line 918
    if-nez v11, :cond_7

    .line 919
    .line 920
    move v11, v8

    .line 921
    :goto_6
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 922
    .line 923
    .line 924
    move-result v12

    .line 925
    if-ge v11, v12, :cond_7

    .line 926
    .line 927
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v12

    .line 931
    invoke-virtual {v6, v5, v12, v10}, Lcom/google/android/gms/internal/measurement/F2;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 932
    .line 933
    .line 934
    add-int/lit8 v11, v11, 0x1

    .line 935
    .line 936
    goto :goto_6

    .line 937
    :pswitch_2a
    aget v5, v5, v2

    .line 938
    .line 939
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v9

    .line 943
    check-cast v9, Ljava/util/List;

    .line 944
    .line 945
    sget-object v10, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 946
    .line 947
    if-eqz v9, :cond_7

    .line 948
    .line 949
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    if-nez v10, :cond_7

    .line 954
    .line 955
    iget-object v10, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v10, Lcom/google/android/gms/internal/measurement/g2;

    .line 958
    .line 959
    instance-of v11, v9, Lcom/google/android/gms/internal/measurement/B2;

    .line 960
    .line 961
    if-eqz v11, :cond_5

    .line 962
    .line 963
    move-object v11, v9

    .line 964
    check-cast v11, Lcom/google/android/gms/internal/measurement/B2;

    .line 965
    .line 966
    move v12, v8

    .line 967
    :goto_7
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 968
    .line 969
    .line 970
    move-result v13

    .line 971
    if-ge v12, v13, :cond_7

    .line 972
    .line 973
    invoke-interface {v11}, Lcom/google/android/gms/internal/measurement/B2;->zzc()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v13

    .line 977
    instance-of v14, v13, Ljava/lang/String;

    .line 978
    .line 979
    if-eqz v14, :cond_4

    .line 980
    .line 981
    check-cast v13, Ljava/lang/String;

    .line 982
    .line 983
    shl-int/lit8 v14, v5, 0x3

    .line 984
    .line 985
    or-int/2addr v14, v15

    .line 986
    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v10, v13}, Lcom/google/android/gms/internal/measurement/g2;->t0(Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    goto :goto_8

    .line 993
    :cond_4
    check-cast v13, Lcom/google/android/gms/internal/measurement/f2;

    .line 994
    .line 995
    invoke-virtual {v10, v5, v13}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 996
    .line 997
    .line 998
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 999
    .line 1000
    goto :goto_7

    .line 1001
    :cond_5
    move v11, v8

    .line 1002
    :goto_9
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1003
    .line 1004
    .line 1005
    move-result v12

    .line 1006
    if-ge v11, v12, :cond_7

    .line 1007
    .line 1008
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v12

    .line 1012
    check-cast v12, Ljava/lang/String;

    .line 1013
    .line 1014
    shl-int/lit8 v13, v5, 0x3

    .line 1015
    .line 1016
    or-int/2addr v13, v15

    .line 1017
    invoke-virtual {v10, v13}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/measurement/g2;->t0(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    add-int/lit8 v11, v11, 0x1

    .line 1024
    .line 1025
    goto :goto_9

    .line 1026
    :pswitch_2b
    aget v5, v5, v2

    .line 1027
    .line 1028
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    check-cast v9, Ljava/util/List;

    .line 1033
    .line 1034
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->p(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1035
    .line 1036
    .line 1037
    goto/16 :goto_a

    .line 1038
    .line 1039
    :pswitch_2c
    aget v5, v5, v2

    .line 1040
    .line 1041
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v9

    .line 1045
    check-cast v9, Ljava/util/List;

    .line 1046
    .line 1047
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->m(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1048
    .line 1049
    .line 1050
    goto/16 :goto_a

    .line 1051
    .line 1052
    :pswitch_2d
    aget v5, v5, v2

    .line 1053
    .line 1054
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v9

    .line 1058
    check-cast v9, Ljava/util/List;

    .line 1059
    .line 1060
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->h(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1061
    .line 1062
    .line 1063
    goto/16 :goto_a

    .line 1064
    .line 1065
    :pswitch_2e
    aget v5, v5, v2

    .line 1066
    .line 1067
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v9

    .line 1071
    check-cast v9, Ljava/util/List;

    .line 1072
    .line 1073
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1074
    .line 1075
    .line 1076
    goto/16 :goto_a

    .line 1077
    .line 1078
    :pswitch_2f
    aget v5, v5, v2

    .line 1079
    .line 1080
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v9

    .line 1084
    check-cast v9, Ljava/util/List;

    .line 1085
    .line 1086
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->f(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_a

    .line 1090
    .line 1091
    :pswitch_30
    aget v5, v5, v2

    .line 1092
    .line 1093
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v9

    .line 1097
    check-cast v9, Ljava/util/List;

    .line 1098
    .line 1099
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->e(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1100
    .line 1101
    .line 1102
    goto/16 :goto_a

    .line 1103
    .line 1104
    :pswitch_31
    aget v5, v5, v2

    .line 1105
    .line 1106
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v9

    .line 1110
    check-cast v9, Ljava/util/List;

    .line 1111
    .line 1112
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->d(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1113
    .line 1114
    .line 1115
    goto/16 :goto_a

    .line 1116
    .line 1117
    :pswitch_32
    aget v5, v5, v2

    .line 1118
    .line 1119
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v9

    .line 1123
    check-cast v9, Ljava/util/List;

    .line 1124
    .line 1125
    invoke-static {v5, v9, v6, v8}, Lcom/google/android/gms/internal/measurement/T2;->c(ILjava/util/List;Lcom/google/android/gms/internal/measurement/F2;Z)V

    .line 1126
    .line 1127
    .line 1128
    goto/16 :goto_a

    .line 1129
    .line 1130
    :pswitch_33
    move v5, v13

    .line 1131
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v5

    .line 1135
    if-eqz v5, :cond_7

    .line 1136
    .line 1137
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v5

    .line 1141
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v9

    .line 1145
    invoke-virtual {v6, v12, v5, v9}, Lcom/google/android/gms/internal/measurement/F2;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 1146
    .line 1147
    .line 1148
    goto/16 :goto_a

    .line 1149
    .line 1150
    :pswitch_34
    move v5, v13

    .line 1151
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v5

    .line 1155
    if-eqz v5, :cond_7

    .line 1156
    .line 1157
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v9

    .line 1161
    add-long v13, v9, v9

    .line 1162
    .line 1163
    shr-long v9, v9, v16

    .line 1164
    .line 1165
    xor-long/2addr v9, v13

    .line 1166
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1169
    .line 1170
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 1171
    .line 1172
    .line 1173
    goto/16 :goto_a

    .line 1174
    .line 1175
    :pswitch_35
    move v5, v13

    .line 1176
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v5

    .line 1180
    if-eqz v5, :cond_7

    .line 1181
    .line 1182
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    add-int v5, v0, v0

    .line 1187
    .line 1188
    shr-int/lit8 v0, v0, 0x1f

    .line 1189
    .line 1190
    xor-int/2addr v0, v5

    .line 1191
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1194
    .line 1195
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->g0(II)V

    .line 1196
    .line 1197
    .line 1198
    goto/16 :goto_a

    .line 1199
    .line 1200
    :pswitch_36
    move v5, v13

    .line 1201
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v5

    .line 1205
    if-eqz v5, :cond_7

    .line 1206
    .line 1207
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1208
    .line 1209
    .line 1210
    move-result-wide v9

    .line 1211
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1214
    .line 1215
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 1216
    .line 1217
    .line 1218
    goto/16 :goto_a

    .line 1219
    .line 1220
    :pswitch_37
    move v5, v13

    .line 1221
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1222
    .line 1223
    .line 1224
    move-result v5

    .line 1225
    if-eqz v5, :cond_7

    .line 1226
    .line 1227
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1234
    .line 1235
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 1236
    .line 1237
    .line 1238
    goto/16 :goto_a

    .line 1239
    .line 1240
    :pswitch_38
    move v5, v13

    .line 1241
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v5

    .line 1245
    if-eqz v5, :cond_7

    .line 1246
    .line 1247
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1248
    .line 1249
    .line 1250
    move-result v0

    .line 1251
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1252
    .line 1253
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1254
    .line 1255
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->f0(II)V

    .line 1256
    .line 1257
    .line 1258
    goto/16 :goto_a

    .line 1259
    .line 1260
    :pswitch_39
    move v5, v13

    .line 1261
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v5

    .line 1265
    if-eqz v5, :cond_7

    .line 1266
    .line 1267
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1274
    .line 1275
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->g0(II)V

    .line 1276
    .line 1277
    .line 1278
    goto/16 :goto_a

    .line 1279
    .line 1280
    :pswitch_3a
    move v5, v13

    .line 1281
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v5

    .line 1285
    if-eqz v5, :cond_7

    .line 1286
    .line 1287
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    check-cast v0, Lcom/google/android/gms/internal/measurement/f2;

    .line 1292
    .line 1293
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1296
    .line 1297
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 1298
    .line 1299
    .line 1300
    goto/16 :goto_a

    .line 1301
    .line 1302
    :pswitch_3b
    move v5, v13

    .line 1303
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    if-eqz v5, :cond_7

    .line 1308
    .line 1309
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v5

    .line 1313
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v9

    .line 1317
    invoke-virtual {v6, v12, v5, v9}, Lcom/google/android/gms/internal/measurement/F2;->d(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;)V

    .line 1318
    .line 1319
    .line 1320
    goto/16 :goto_a

    .line 1321
    .line 1322
    :pswitch_3c
    move v5, v13

    .line 1323
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v5

    .line 1327
    if-eqz v5, :cond_7

    .line 1328
    .line 1329
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    instance-of v5, v0, Ljava/lang/String;

    .line 1334
    .line 1335
    if-eqz v5, :cond_6

    .line 1336
    .line 1337
    check-cast v0, Ljava/lang/String;

    .line 1338
    .line 1339
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1342
    .line 1343
    shl-int/lit8 v9, v12, 0x3

    .line 1344
    .line 1345
    or-int/2addr v9, v15

    .line 1346
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/g2;->t0(Ljava/lang/String;)V

    .line 1350
    .line 1351
    .line 1352
    goto/16 :goto_a

    .line 1353
    .line 1354
    :cond_6
    check-cast v0, Lcom/google/android/gms/internal/measurement/f2;

    .line 1355
    .line 1356
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1359
    .line 1360
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->k0(ILcom/google/android/gms/internal/measurement/f2;)V

    .line 1361
    .line 1362
    .line 1363
    goto/16 :goto_a

    .line 1364
    .line 1365
    :pswitch_3d
    move v5, v13

    .line 1366
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    if-eqz v5, :cond_7

    .line 1371
    .line 1372
    sget-object v0, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 1373
    .line 1374
    invoke-virtual {v0, v9, v10, v1}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v0

    .line 1378
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1381
    .line 1382
    shl-int/lit8 v9, v12, 0x3

    .line 1383
    .line 1384
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/g2;->o0(I)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/g2;->m0(B)V

    .line 1388
    .line 1389
    .line 1390
    goto/16 :goto_a

    .line 1391
    .line 1392
    :pswitch_3e
    move v5, v13

    .line 1393
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1394
    .line 1395
    .line 1396
    move-result v5

    .line 1397
    if-eqz v5, :cond_7

    .line 1398
    .line 1399
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1406
    .line 1407
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 1408
    .line 1409
    .line 1410
    goto/16 :goto_a

    .line 1411
    .line 1412
    :pswitch_3f
    move v5, v13

    .line 1413
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v5

    .line 1417
    if-eqz v5, :cond_7

    .line 1418
    .line 1419
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1420
    .line 1421
    .line 1422
    move-result-wide v9

    .line 1423
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1426
    .line 1427
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 1428
    .line 1429
    .line 1430
    goto/16 :goto_a

    .line 1431
    .line 1432
    :pswitch_40
    move v5, v13

    .line 1433
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v5

    .line 1437
    if-eqz v5, :cond_7

    .line 1438
    .line 1439
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1440
    .line 1441
    .line 1442
    move-result v0

    .line 1443
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1444
    .line 1445
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1446
    .line 1447
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->f0(II)V

    .line 1448
    .line 1449
    .line 1450
    goto :goto_a

    .line 1451
    :pswitch_41
    move v5, v13

    .line 1452
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v5

    .line 1456
    if-eqz v5, :cond_7

    .line 1457
    .line 1458
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1459
    .line 1460
    .line 1461
    move-result-wide v9

    .line 1462
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1463
    .line 1464
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1465
    .line 1466
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 1467
    .line 1468
    .line 1469
    goto :goto_a

    .line 1470
    :pswitch_42
    move v5, v13

    .line 1471
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v5

    .line 1475
    if-eqz v5, :cond_7

    .line 1476
    .line 1477
    invoke-virtual {v7, v1, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1478
    .line 1479
    .line 1480
    move-result-wide v9

    .line 1481
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1482
    .line 1483
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1484
    .line 1485
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->i0(IJ)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_a

    .line 1489
    :pswitch_43
    move v5, v13

    .line 1490
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v5

    .line 1494
    if-eqz v5, :cond_7

    .line 1495
    .line 1496
    sget-object v0, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 1497
    .line 1498
    invoke-virtual {v0, v9, v10, v1}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 1499
    .line 1500
    .line 1501
    move-result v0

    .line 1502
    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v5, Lcom/google/android/gms/internal/measurement/g2;

    .line 1505
    .line 1506
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1507
    .line 1508
    .line 1509
    move-result v0

    .line 1510
    invoke-virtual {v5, v12, v0}, Lcom/google/android/gms/internal/measurement/g2;->h0(II)V

    .line 1511
    .line 1512
    .line 1513
    goto :goto_a

    .line 1514
    :pswitch_44
    move v5, v13

    .line 1515
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v5

    .line 1519
    if-eqz v5, :cond_7

    .line 1520
    .line 1521
    sget-object v0, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 1522
    .line 1523
    invoke-virtual {v0, v9, v10, v1}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 1524
    .line 1525
    .line 1526
    move-result-wide v9

    .line 1527
    iget-object v0, v6, Lcom/google/android/gms/internal/measurement/F2;->q:Ljava/lang/Object;

    .line 1528
    .line 1529
    check-cast v0, Lcom/google/android/gms/internal/measurement/g2;

    .line 1530
    .line 1531
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1532
    .line 1533
    .line 1534
    move-result-wide v9

    .line 1535
    invoke-virtual {v0, v12, v9, v10}, Lcom/google/android/gms/internal/measurement/g2;->j0(IJ)V

    .line 1536
    .line 1537
    .line 1538
    :cond_7
    :goto_a
    add-int/lit8 v2, v2, 0x3

    .line 1539
    .line 1540
    const v9, 0xfffff

    .line 1541
    .line 1542
    .line 1543
    move-object/from16 v0, p0

    .line 1544
    .line 1545
    goto/16 :goto_0

    .line 1546
    .line 1547
    :cond_8
    move-object v0, v1

    .line 1548
    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    .line 1549
    .line 1550
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 1551
    .line 1552
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/Y2;->b(Lcom/google/android/gms/internal/measurement/F2;)V

    .line 1553
    .line 1554
    .line 1555
    return-void

    .line 1556
    nop

    .line 1557
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lcom/google/android/gms/internal/measurement/q2;)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v0, v3, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v3

    .line 16
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aget v2, v2, v0

    .line 21
    .line 22
    int-to-long v4, v4

    .line 23
    const/16 v6, 0x4d5

    .line 24
    .line 25
    const/16 v7, 0x4cf

    .line 26
    .line 27
    const/16 v8, 0x25

    .line 28
    .line 29
    const/16 v9, 0x20

    .line 30
    .line 31
    packed-switch v3, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_0
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    mul-int/lit8 v1, v1, 0x35

    .line 43
    .line 44
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_1
    add-int/2addr v2, v1

    .line 53
    move v1, v2

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x35

    .line 63
    .line 64
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    :goto_2
    ushr-long v4, v2, v9

    .line 71
    .line 72
    xor-long/2addr v2, v4

    .line 73
    long-to-int v2, v2

    .line 74
    add-int/2addr v1, v2

    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :pswitch_2
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    mul-int/lit8 v1, v1, 0x35

    .line 84
    .line 85
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    goto :goto_1

    .line 90
    :pswitch_3
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    mul-int/lit8 v1, v1, 0x35

    .line 97
    .line 98
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :pswitch_4
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x35

    .line 112
    .line 113
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_1

    .line 118
    :pswitch_5
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    mul-int/lit8 v1, v1, 0x35

    .line 125
    .line 126
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    goto :goto_1

    .line 131
    :pswitch_6
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    mul-int/lit8 v1, v1, 0x35

    .line 138
    .line 139
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    goto :goto_1

    .line 144
    :pswitch_7
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_2

    .line 149
    .line 150
    mul-int/lit8 v1, v1, 0x35

    .line 151
    .line 152
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_2

    .line 166
    .line 167
    mul-int/lit8 v1, v1, 0x35

    .line 168
    .line 169
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    goto :goto_1

    .line 178
    :pswitch_9
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_2

    .line 183
    .line 184
    mul-int/lit8 v1, v1, 0x35

    .line 185
    .line 186
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :pswitch_a
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_2

    .line 203
    .line 204
    mul-int/lit8 v1, v1, 0x35

    .line 205
    .line 206
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    sget-object v3, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 217
    .line 218
    if-eqz v2, :cond_0

    .line 219
    .line 220
    :goto_3
    move v6, v7

    .line 221
    :cond_0
    add-int/2addr v6, v1

    .line 222
    move v1, v6

    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :pswitch_b
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_2

    .line 230
    .line 231
    mul-int/lit8 v1, v1, 0x35

    .line 232
    .line 233
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :pswitch_c
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_2

    .line 244
    .line 245
    mul-int/lit8 v1, v1, 0x35

    .line 246
    .line 247
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 248
    .line 249
    .line 250
    move-result-wide v2

    .line 251
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :pswitch_d
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_2

    .line 260
    .line 261
    mul-int/lit8 v1, v1, 0x35

    .line 262
    .line 263
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_e
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_2

    .line 274
    .line 275
    mul-int/lit8 v1, v1, 0x35

    .line 276
    .line 277
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :pswitch_f
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_2

    .line 290
    .line 291
    mul-int/lit8 v1, v1, 0x35

    .line 292
    .line 293
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :pswitch_10
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_2

    .line 306
    .line 307
    mul-int/lit8 v1, v1, 0x35

    .line 308
    .line 309
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ljava/lang/Float;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :pswitch_11
    invoke-virtual {p0, v2, v0, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_2

    .line 330
    .line 331
    mul-int/lit8 v1, v1, 0x35

    .line 332
    .line 333
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ljava/lang/Double;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 344
    .line 345
    .line 346
    move-result-wide v2

    .line 347
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :pswitch_12
    mul-int/lit8 v1, v1, 0x35

    .line 352
    .line 353
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :pswitch_13
    mul-int/lit8 v1, v1, 0x35

    .line 364
    .line 365
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_14
    mul-int/lit8 v1, v1, 0x35

    .line 376
    .line 377
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-eqz v2, :cond_1

    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    :cond_1
    :goto_4
    add-int/2addr v1, v8

    .line 388
    goto/16 :goto_5

    .line 389
    .line 390
    :pswitch_15
    mul-int/lit8 v1, v1, 0x35

    .line 391
    .line 392
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 393
    .line 394
    .line 395
    move-result-wide v2

    .line 396
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :pswitch_16
    mul-int/lit8 v1, v1, 0x35

    .line 401
    .line 402
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :pswitch_17
    mul-int/lit8 v1, v1, 0x35

    .line 409
    .line 410
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v2

    .line 414
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :pswitch_18
    mul-int/lit8 v1, v1, 0x35

    .line 419
    .line 420
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_19
    mul-int/lit8 v1, v1, 0x35

    .line 427
    .line 428
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_1a
    mul-int/lit8 v1, v1, 0x35

    .line 435
    .line 436
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :pswitch_1b
    mul-int/lit8 v1, v1, 0x35

    .line 443
    .line 444
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_1c
    mul-int/lit8 v1, v1, 0x35

    .line 455
    .line 456
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    if-eqz v2, :cond_1

    .line 461
    .line 462
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    goto :goto_4

    .line 467
    :pswitch_1d
    mul-int/lit8 v1, v1, 0x35

    .line 468
    .line 469
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    check-cast v2, Ljava/lang/String;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    goto/16 :goto_1

    .line 480
    .line 481
    :pswitch_1e
    mul-int/lit8 v1, v1, 0x35

    .line 482
    .line 483
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 484
    .line 485
    invoke-virtual {v2, v4, v5, p1}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    sget-object v3, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 490
    .line 491
    if-eqz v2, :cond_0

    .line 492
    .line 493
    goto/16 :goto_3

    .line 494
    .line 495
    :pswitch_1f
    mul-int/lit8 v1, v1, 0x35

    .line 496
    .line 497
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    goto/16 :goto_1

    .line 502
    .line 503
    :pswitch_20
    mul-int/lit8 v1, v1, 0x35

    .line 504
    .line 505
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 506
    .line 507
    .line 508
    move-result-wide v2

    .line 509
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 510
    .line 511
    goto/16 :goto_2

    .line 512
    .line 513
    :pswitch_21
    mul-int/lit8 v1, v1, 0x35

    .line 514
    .line 515
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    goto/16 :goto_1

    .line 520
    .line 521
    :pswitch_22
    mul-int/lit8 v1, v1, 0x35

    .line 522
    .line 523
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 524
    .line 525
    .line 526
    move-result-wide v2

    .line 527
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 528
    .line 529
    goto/16 :goto_2

    .line 530
    .line 531
    :pswitch_23
    mul-int/lit8 v1, v1, 0x35

    .line 532
    .line 533
    invoke-static {v4, v5, p1}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 534
    .line 535
    .line 536
    move-result-wide v2

    .line 537
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 538
    .line 539
    goto/16 :goto_2

    .line 540
    .line 541
    :pswitch_24
    mul-int/lit8 v1, v1, 0x35

    .line 542
    .line 543
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 544
    .line 545
    invoke-virtual {v2, v4, v5, p1}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    goto/16 :goto_1

    .line 554
    .line 555
    :pswitch_25
    mul-int/lit8 v1, v1, 0x35

    .line 556
    .line 557
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 558
    .line 559
    invoke-virtual {v2, v4, v5, p1}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 560
    .line 561
    .line 562
    move-result-wide v2

    .line 563
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 564
    .line 565
    .line 566
    move-result-wide v2

    .line 567
    sget-object v4, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    .line 568
    .line 569
    goto/16 :goto_2

    .line 570
    .line 571
    :cond_2
    :goto_5
    add-int/lit8 v0, v0, 0x3

    .line 572
    .line 573
    goto/16 :goto_0

    .line 574
    .line 575
    :cond_3
    mul-int/lit8 v1, v1, 0x35

    .line 576
    .line 577
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 578
    .line 579
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/Y2;->hashCode()I

    .line 580
    .line 581
    .line 582
    move-result p1

    .line 583
    add-int/2addr p1, v1

    .line 584
    return p1

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
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
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcom/google/android/gms/internal/measurement/Y1;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v6, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 6
    .line 7
    const v8, 0xfffff

    .line 8
    .line 9
    .line 10
    move v3, v8

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 15
    .line 16
    array-length v10, v5

    .line 17
    if-ge v2, v10, :cond_1a

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    aget v12, v5, v2

    .line 28
    .line 29
    add-int/lit8 v13, v2, 0x2

    .line 30
    .line 31
    aget v5, v5, v13

    .line 32
    .line 33
    and-int v13, v5, v8

    .line 34
    .line 35
    const/16 v14, 0x11

    .line 36
    .line 37
    const/4 v15, 0x1

    .line 38
    if-gt v11, v14, :cond_2

    .line 39
    .line 40
    if-eq v13, v3, :cond_1

    .line 41
    .line 42
    if-ne v13, v8, :cond_0

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    int-to-long v3, v13

    .line 47
    invoke-virtual {v6, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    move v4, v3

    .line 52
    :goto_1
    move v3, v13

    .line 53
    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    .line 54
    .line 55
    shl-int v5, v15, v5

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 v5, 0x0

    .line 59
    :goto_2
    and-int/2addr v10, v8

    .line 60
    sget-object v13, Lcom/google/android/gms/internal/measurement/l2;->r:Lcom/google/android/gms/internal/measurement/l2;

    .line 61
    .line 62
    iget v13, v13, Lcom/google/android/gms/internal/measurement/l2;->q:I

    .line 63
    .line 64
    if-lt v11, v13, :cond_3

    .line 65
    .line 66
    sget-object v13, Lcom/google/android/gms/internal/measurement/l2;->s:Lcom/google/android/gms/internal/measurement/l2;

    .line 67
    .line 68
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    :cond_3
    int-to-long v13, v10

    .line 72
    const/16 v10, 0x3f

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    const/16 v8, 0x8

    .line 76
    .line 77
    packed-switch v11, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_16

    .line 81
    .line 82
    :pswitch_0
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_19

    .line 87
    .line 88
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    shl-int/lit8 v8, v12, 0x3

    .line 99
    .line 100
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    add-int/2addr v8, v8

    .line 105
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    :goto_3
    add-int/2addr v5, v8

    .line 110
    :goto_4
    add-int/2addr v9, v5

    .line 111
    goto/16 :goto_16

    .line 112
    .line 113
    :pswitch_1
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_19

    .line 118
    .line 119
    shl-int/lit8 v5, v12, 0x3

    .line 120
    .line 121
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v7

    .line 125
    add-long v11, v7, v7

    .line 126
    .line 127
    shr-long/2addr v7, v10

    .line 128
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    xor-long/2addr v7, v11

    .line 133
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    :goto_5
    add-int/2addr v7, v5

    .line 138
    add-int/2addr v9, v7

    .line 139
    goto/16 :goto_16

    .line 140
    .line 141
    :pswitch_2
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_19

    .line 146
    .line 147
    shl-int/lit8 v5, v12, 0x3

    .line 148
    .line 149
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    add-int v8, v7, v7

    .line 154
    .line 155
    shr-int/lit8 v7, v7, 0x1f

    .line 156
    .line 157
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    xor-int/2addr v7, v8

    .line 162
    invoke-static {v7, v5, v9}, LC0/S;->f(III)I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    goto/16 :goto_16

    .line 167
    .line 168
    :pswitch_3
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_19

    .line 173
    .line 174
    shl-int/lit8 v5, v12, 0x3

    .line 175
    .line 176
    invoke-static {v5, v8, v9}, LC0/S;->f(III)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    goto/16 :goto_16

    .line 181
    .line 182
    :pswitch_4
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_19

    .line 187
    .line 188
    shl-int/lit8 v5, v12, 0x3

    .line 189
    .line 190
    invoke-static {v5, v7, v9}, LC0/S;->f(III)I

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    goto/16 :goto_16

    .line 195
    .line 196
    :pswitch_5
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_19

    .line 201
    .line 202
    shl-int/lit8 v5, v12, 0x3

    .line 203
    .line 204
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    int-to-long v7, v7

    .line 209
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    goto :goto_5

    .line 218
    :pswitch_6
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_19

    .line 223
    .line 224
    shl-int/lit8 v5, v12, 0x3

    .line 225
    .line 226
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    invoke-static {v7, v5, v9}, LC0/S;->f(III)I

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    goto/16 :goto_16

    .line 239
    .line 240
    :pswitch_7
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_19

    .line 245
    .line 246
    shl-int/lit8 v5, v12, 0x3

    .line 247
    .line 248
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    check-cast v7, Lcom/google/android/gms/internal/measurement/f2;

    .line 253
    .line 254
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    invoke-static {v7, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    goto/16 :goto_16

    .line 267
    .line 268
    :pswitch_8
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_19

    .line 273
    .line 274
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 283
    .line 284
    shl-int/lit8 v8, v12, 0x3

    .line 285
    .line 286
    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    .line 287
    .line 288
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    invoke-static {v5, v5, v8, v9}, LC0/S;->g(IIII)I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    goto/16 :goto_16

    .line 301
    .line 302
    :pswitch_9
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_19

    .line 307
    .line 308
    shl-int/lit8 v5, v12, 0x3

    .line 309
    .line 310
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    instance-of v8, v7, Lcom/google/android/gms/internal/measurement/f2;

    .line 315
    .line 316
    if-eqz v8, :cond_4

    .line 317
    .line 318
    check-cast v7, Lcom/google/android/gms/internal/measurement/f2;

    .line 319
    .line 320
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    invoke-static {v7, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    goto/16 :goto_16

    .line 333
    .line 334
    :cond_4
    check-cast v7, Ljava/lang/String;

    .line 335
    .line 336
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->d0(Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    goto/16 :goto_5

    .line 345
    .line 346
    :pswitch_a
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    if-eqz v5, :cond_19

    .line 351
    .line 352
    shl-int/lit8 v5, v12, 0x3

    .line 353
    .line 354
    invoke-static {v5, v15, v9}, LC0/S;->f(III)I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    goto/16 :goto_16

    .line 359
    .line 360
    :pswitch_b
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_19

    .line 365
    .line 366
    shl-int/lit8 v5, v12, 0x3

    .line 367
    .line 368
    invoke-static {v5, v7, v9}, LC0/S;->f(III)I

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    goto/16 :goto_16

    .line 373
    .line 374
    :pswitch_c
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_19

    .line 379
    .line 380
    shl-int/lit8 v5, v12, 0x3

    .line 381
    .line 382
    invoke-static {v5, v8, v9}, LC0/S;->f(III)I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    goto/16 :goto_16

    .line 387
    .line 388
    :pswitch_d
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eqz v5, :cond_19

    .line 393
    .line 394
    shl-int/lit8 v5, v12, 0x3

    .line 395
    .line 396
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->j(JLjava/lang/Object;)I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    int-to-long v7, v7

    .line 401
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    goto/16 :goto_5

    .line 410
    .line 411
    :pswitch_e
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-eqz v5, :cond_19

    .line 416
    .line 417
    shl-int/lit8 v5, v12, 0x3

    .line 418
    .line 419
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 420
    .line 421
    .line 422
    move-result-wide v7

    .line 423
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    goto/16 :goto_5

    .line 432
    .line 433
    :pswitch_f
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    if-eqz v5, :cond_19

    .line 438
    .line 439
    shl-int/lit8 v5, v12, 0x3

    .line 440
    .line 441
    invoke-static {v13, v14, v1}, Lcom/google/android/gms/internal/measurement/L2;->k(JLjava/lang/Object;)J

    .line 442
    .line 443
    .line 444
    move-result-wide v7

    .line 445
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    goto/16 :goto_5

    .line 454
    .line 455
    :pswitch_10
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    if-eqz v5, :cond_19

    .line 460
    .line 461
    shl-int/lit8 v5, v12, 0x3

    .line 462
    .line 463
    invoke-static {v5, v7, v9}, LC0/S;->f(III)I

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    goto/16 :goto_16

    .line 468
    .line 469
    :pswitch_11
    invoke-virtual {v0, v12, v2, v1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_19

    .line 474
    .line 475
    shl-int/lit8 v5, v12, 0x3

    .line 476
    .line 477
    invoke-static {v5, v8, v9}, LC0/S;->f(III)I

    .line 478
    .line 479
    .line 480
    move-result v9

    .line 481
    goto/16 :goto_16

    .line 482
    .line 483
    :pswitch_12
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    div-int/lit8 v7, v2, 0x3

    .line 488
    .line 489
    iget-object v8, v0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 490
    .line 491
    add-int/2addr v7, v7

    .line 492
    aget-object v7, v8, v7

    .line 493
    .line 494
    check-cast v5, Lcom/google/android/gms/internal/measurement/H2;

    .line 495
    .line 496
    check-cast v7, Lcom/google/android/gms/internal/measurement/G2;

    .line 497
    .line 498
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    if-eqz v8, :cond_5

    .line 503
    .line 504
    :goto_6
    const/4 v8, 0x0

    .line 505
    goto :goto_8

    .line 506
    :cond_5
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/H2;->entrySet()Ljava/util/Set;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    const/4 v8, 0x0

    .line 515
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    if-eqz v10, :cond_6

    .line 520
    .line 521
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    check-cast v10, Ljava/util/Map$Entry;

    .line 526
    .line 527
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    iget-object v13, v7, Lcom/google/android/gms/internal/measurement/G2;->a:Lcom/google/android/gms/internal/measurement/t;

    .line 536
    .line 537
    shl-int/lit8 v14, v12, 0x3

    .line 538
    .line 539
    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 540
    .line 541
    .line 542
    move-result v14

    .line 543
    invoke-static {v13, v11, v10}, Lcom/google/android/gms/internal/measurement/G2;->b(Lcom/google/android/gms/internal/measurement/t;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    invoke-static {v10, v10, v14, v8}, LC0/S;->g(IIII)I

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    goto :goto_7

    .line 552
    :cond_6
    :goto_8
    add-int/2addr v9, v8

    .line 553
    goto/16 :goto_16

    .line 554
    .line 555
    :pswitch_13
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    check-cast v5, Ljava/util/List;

    .line 560
    .line 561
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 566
    .line 567
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-nez v8, :cond_7

    .line 572
    .line 573
    const/4 v11, 0x0

    .line 574
    goto :goto_a

    .line 575
    :cond_7
    const/4 v10, 0x0

    .line 576
    const/4 v11, 0x0

    .line 577
    :goto_9
    if-ge v10, v8, :cond_8

    .line 578
    .line 579
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v13

    .line 583
    check-cast v13, Lcom/google/android/gms/internal/measurement/Y1;

    .line 584
    .line 585
    shl-int/lit8 v14, v12, 0x3

    .line 586
    .line 587
    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 588
    .line 589
    .line 590
    move-result v14

    .line 591
    add-int/2addr v14, v14

    .line 592
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 593
    .line 594
    .line 595
    move-result v13

    .line 596
    add-int/2addr v13, v14

    .line 597
    add-int/2addr v11, v13

    .line 598
    add-int/lit8 v10, v10, 0x1

    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_8
    :goto_a
    add-int/2addr v9, v11

    .line 602
    goto/16 :goto_16

    .line 603
    .line 604
    :pswitch_14
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    check-cast v5, Ljava/util/List;

    .line 609
    .line 610
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->s(Ljava/util/List;)I

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    if-lez v5, :cond_19

    .line 615
    .line 616
    shl-int/lit8 v7, v12, 0x3

    .line 617
    .line 618
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 623
    .line 624
    .line 625
    move-result v9

    .line 626
    goto/16 :goto_16

    .line 627
    .line 628
    :pswitch_15
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    check-cast v5, Ljava/util/List;

    .line 633
    .line 634
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->w(Ljava/util/List;)I

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    if-lez v5, :cond_19

    .line 639
    .line 640
    shl-int/lit8 v7, v12, 0x3

    .line 641
    .line 642
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 643
    .line 644
    .line 645
    move-result v7

    .line 646
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 647
    .line 648
    .line 649
    move-result v9

    .line 650
    goto/16 :goto_16

    .line 651
    .line 652
    :pswitch_16
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    check-cast v5, Ljava/util/List;

    .line 657
    .line 658
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 659
    .line 660
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 661
    .line 662
    .line 663
    move-result v5

    .line 664
    mul-int/2addr v5, v8

    .line 665
    if-lez v5, :cond_19

    .line 666
    .line 667
    shl-int/lit8 v7, v12, 0x3

    .line 668
    .line 669
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    goto/16 :goto_16

    .line 678
    .line 679
    :pswitch_17
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    check-cast v5, Ljava/util/List;

    .line 684
    .line 685
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 686
    .line 687
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    mul-int/2addr v5, v7

    .line 692
    if-lez v5, :cond_19

    .line 693
    .line 694
    shl-int/lit8 v7, v12, 0x3

    .line 695
    .line 696
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 701
    .line 702
    .line 703
    move-result v9

    .line 704
    goto/16 :goto_16

    .line 705
    .line 706
    :pswitch_18
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    check-cast v5, Ljava/util/List;

    .line 711
    .line 712
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->t(Ljava/util/List;)I

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-lez v5, :cond_19

    .line 717
    .line 718
    shl-int/lit8 v7, v12, 0x3

    .line 719
    .line 720
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    goto/16 :goto_16

    .line 729
    .line 730
    :pswitch_19
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    check-cast v5, Ljava/util/List;

    .line 735
    .line 736
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->v(Ljava/util/List;)I

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    if-lez v5, :cond_19

    .line 741
    .line 742
    shl-int/lit8 v7, v12, 0x3

    .line 743
    .line 744
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 745
    .line 746
    .line 747
    move-result v7

    .line 748
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 749
    .line 750
    .line 751
    move-result v9

    .line 752
    goto/16 :goto_16

    .line 753
    .line 754
    :pswitch_1a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    check-cast v5, Ljava/util/List;

    .line 759
    .line 760
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 761
    .line 762
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 763
    .line 764
    .line 765
    move-result v5

    .line 766
    if-lez v5, :cond_19

    .line 767
    .line 768
    shl-int/lit8 v7, v12, 0x3

    .line 769
    .line 770
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 771
    .line 772
    .line 773
    move-result v7

    .line 774
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 775
    .line 776
    .line 777
    move-result v9

    .line 778
    goto/16 :goto_16

    .line 779
    .line 780
    :pswitch_1b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    check-cast v5, Ljava/util/List;

    .line 785
    .line 786
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 787
    .line 788
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v5

    .line 792
    mul-int/2addr v5, v7

    .line 793
    if-lez v5, :cond_19

    .line 794
    .line 795
    shl-int/lit8 v7, v12, 0x3

    .line 796
    .line 797
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 802
    .line 803
    .line 804
    move-result v9

    .line 805
    goto/16 :goto_16

    .line 806
    .line 807
    :pswitch_1c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    check-cast v5, Ljava/util/List;

    .line 812
    .line 813
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 814
    .line 815
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    mul-int/2addr v5, v8

    .line 820
    if-lez v5, :cond_19

    .line 821
    .line 822
    shl-int/lit8 v7, v12, 0x3

    .line 823
    .line 824
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 825
    .line 826
    .line 827
    move-result v7

    .line 828
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 829
    .line 830
    .line 831
    move-result v9

    .line 832
    goto/16 :goto_16

    .line 833
    .line 834
    :pswitch_1d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v5

    .line 838
    check-cast v5, Ljava/util/List;

    .line 839
    .line 840
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->u(Ljava/util/List;)I

    .line 841
    .line 842
    .line 843
    move-result v5

    .line 844
    if-lez v5, :cond_19

    .line 845
    .line 846
    shl-int/lit8 v7, v12, 0x3

    .line 847
    .line 848
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 849
    .line 850
    .line 851
    move-result v7

    .line 852
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 853
    .line 854
    .line 855
    move-result v9

    .line 856
    goto/16 :goto_16

    .line 857
    .line 858
    :pswitch_1e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    check-cast v5, Ljava/util/List;

    .line 863
    .line 864
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->r(Ljava/util/List;)I

    .line 865
    .line 866
    .line 867
    move-result v5

    .line 868
    if-lez v5, :cond_19

    .line 869
    .line 870
    shl-int/lit8 v7, v12, 0x3

    .line 871
    .line 872
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 873
    .line 874
    .line 875
    move-result v7

    .line 876
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 877
    .line 878
    .line 879
    move-result v9

    .line 880
    goto/16 :goto_16

    .line 881
    .line 882
    :pswitch_1f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    check-cast v5, Ljava/util/List;

    .line 887
    .line 888
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->q(Ljava/util/List;)I

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-lez v5, :cond_19

    .line 893
    .line 894
    shl-int/lit8 v7, v12, 0x3

    .line 895
    .line 896
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 901
    .line 902
    .line 903
    move-result v9

    .line 904
    goto/16 :goto_16

    .line 905
    .line 906
    :pswitch_20
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v5

    .line 910
    check-cast v5, Ljava/util/List;

    .line 911
    .line 912
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 913
    .line 914
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 915
    .line 916
    .line 917
    move-result v5

    .line 918
    mul-int/2addr v5, v7

    .line 919
    if-lez v5, :cond_19

    .line 920
    .line 921
    shl-int/lit8 v7, v12, 0x3

    .line 922
    .line 923
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 924
    .line 925
    .line 926
    move-result v7

    .line 927
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 928
    .line 929
    .line 930
    move-result v9

    .line 931
    goto/16 :goto_16

    .line 932
    .line 933
    :pswitch_21
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v5

    .line 937
    check-cast v5, Ljava/util/List;

    .line 938
    .line 939
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 940
    .line 941
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 942
    .line 943
    .line 944
    move-result v5

    .line 945
    mul-int/2addr v5, v8

    .line 946
    if-lez v5, :cond_19

    .line 947
    .line 948
    shl-int/lit8 v7, v12, 0x3

    .line 949
    .line 950
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 951
    .line 952
    .line 953
    move-result v7

    .line 954
    invoke-static {v5, v7, v5, v9}, LC0/S;->g(IIII)I

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    goto/16 :goto_16

    .line 959
    .line 960
    :pswitch_22
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v5

    .line 964
    check-cast v5, Ljava/util/List;

    .line 965
    .line 966
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 967
    .line 968
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 969
    .line 970
    .line 971
    move-result v7

    .line 972
    if-nez v7, :cond_9

    .line 973
    .line 974
    goto/16 :goto_6

    .line 975
    .line 976
    :cond_9
    shl-int/lit8 v8, v12, 0x3

    .line 977
    .line 978
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->s(Ljava/util/List;)I

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 983
    .line 984
    .line 985
    move-result v8

    .line 986
    :goto_b
    mul-int/2addr v8, v7

    .line 987
    add-int/2addr v8, v5

    .line 988
    goto/16 :goto_8

    .line 989
    .line 990
    :pswitch_23
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v5

    .line 994
    check-cast v5, Ljava/util/List;

    .line 995
    .line 996
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 997
    .line 998
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 999
    .line 1000
    .line 1001
    move-result v7

    .line 1002
    if-nez v7, :cond_a

    .line 1003
    .line 1004
    goto/16 :goto_6

    .line 1005
    .line 1006
    :cond_a
    shl-int/lit8 v8, v12, 0x3

    .line 1007
    .line 1008
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->w(Ljava/util/List;)I

    .line 1009
    .line 1010
    .line 1011
    move-result v5

    .line 1012
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1013
    .line 1014
    .line 1015
    move-result v8

    .line 1016
    goto :goto_b

    .line 1017
    :pswitch_24
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    check-cast v5, Ljava/util/List;

    .line 1022
    .line 1023
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->y(ILjava/util/List;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v5

    .line 1027
    goto/16 :goto_4

    .line 1028
    .line 1029
    :pswitch_25
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v5

    .line 1033
    check-cast v5, Ljava/util/List;

    .line 1034
    .line 1035
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->x(ILjava/util/List;)I

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    goto/16 :goto_4

    .line 1040
    .line 1041
    :pswitch_26
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v5

    .line 1045
    check-cast v5, Ljava/util/List;

    .line 1046
    .line 1047
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1048
    .line 1049
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1050
    .line 1051
    .line 1052
    move-result v7

    .line 1053
    if-nez v7, :cond_b

    .line 1054
    .line 1055
    goto/16 :goto_6

    .line 1056
    .line 1057
    :cond_b
    shl-int/lit8 v8, v12, 0x3

    .line 1058
    .line 1059
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->t(Ljava/util/List;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v5

    .line 1063
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1064
    .line 1065
    .line 1066
    move-result v8

    .line 1067
    goto :goto_b

    .line 1068
    :pswitch_27
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v5

    .line 1072
    check-cast v5, Ljava/util/List;

    .line 1073
    .line 1074
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1075
    .line 1076
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1077
    .line 1078
    .line 1079
    move-result v7

    .line 1080
    if-nez v7, :cond_c

    .line 1081
    .line 1082
    goto/16 :goto_6

    .line 1083
    .line 1084
    :cond_c
    shl-int/lit8 v8, v12, 0x3

    .line 1085
    .line 1086
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->v(Ljava/util/List;)I

    .line 1087
    .line 1088
    .line 1089
    move-result v5

    .line 1090
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1091
    .line 1092
    .line 1093
    move-result v8

    .line 1094
    goto :goto_b

    .line 1095
    :pswitch_28
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v5

    .line 1099
    check-cast v5, Ljava/util/List;

    .line 1100
    .line 1101
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1102
    .line 1103
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1104
    .line 1105
    .line 1106
    move-result v7

    .line 1107
    if-nez v7, :cond_d

    .line 1108
    .line 1109
    goto/16 :goto_6

    .line 1110
    .line 1111
    :cond_d
    shl-int/lit8 v8, v12, 0x3

    .line 1112
    .line 1113
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v8

    .line 1117
    mul-int/2addr v8, v7

    .line 1118
    const/4 v7, 0x0

    .line 1119
    :goto_c
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1120
    .line 1121
    .line 1122
    move-result v10

    .line 1123
    if-ge v7, v10, :cond_6

    .line 1124
    .line 1125
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v10

    .line 1129
    check-cast v10, Lcom/google/android/gms/internal/measurement/f2;

    .line 1130
    .line 1131
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 1132
    .line 1133
    .line 1134
    move-result v10

    .line 1135
    invoke-static {v10, v10, v8}, LC0/S;->f(III)I

    .line 1136
    .line 1137
    .line 1138
    move-result v8

    .line 1139
    add-int/lit8 v7, v7, 0x1

    .line 1140
    .line 1141
    goto :goto_c

    .line 1142
    :pswitch_29
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v5

    .line 1146
    check-cast v5, Ljava/util/List;

    .line 1147
    .line 1148
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v7

    .line 1152
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1153
    .line 1154
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1155
    .line 1156
    .line 1157
    move-result v8

    .line 1158
    if-nez v8, :cond_e

    .line 1159
    .line 1160
    const/4 v10, 0x0

    .line 1161
    goto :goto_e

    .line 1162
    :cond_e
    shl-int/lit8 v10, v12, 0x3

    .line 1163
    .line 1164
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1165
    .line 1166
    .line 1167
    move-result v10

    .line 1168
    mul-int/2addr v10, v8

    .line 1169
    const/4 v11, 0x0

    .line 1170
    :goto_d
    if-ge v11, v8, :cond_f

    .line 1171
    .line 1172
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v12

    .line 1176
    check-cast v12, Lcom/google/android/gms/internal/measurement/Y1;

    .line 1177
    .line 1178
    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 1179
    .line 1180
    .line 1181
    move-result v12

    .line 1182
    invoke-static {v12, v12, v10}, LC0/S;->f(III)I

    .line 1183
    .line 1184
    .line 1185
    move-result v10

    .line 1186
    add-int/lit8 v11, v11, 0x1

    .line 1187
    .line 1188
    goto :goto_d

    .line 1189
    :cond_f
    :goto_e
    add-int/2addr v9, v10

    .line 1190
    goto/16 :goto_16

    .line 1191
    .line 1192
    :pswitch_2a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v5

    .line 1196
    check-cast v5, Ljava/util/List;

    .line 1197
    .line 1198
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1199
    .line 1200
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1201
    .line 1202
    .line 1203
    move-result v7

    .line 1204
    if-nez v7, :cond_10

    .line 1205
    .line 1206
    goto/16 :goto_6

    .line 1207
    .line 1208
    :cond_10
    shl-int/lit8 v8, v12, 0x3

    .line 1209
    .line 1210
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1211
    .line 1212
    .line 1213
    move-result v8

    .line 1214
    mul-int/2addr v8, v7

    .line 1215
    instance-of v10, v5, Lcom/google/android/gms/internal/measurement/B2;

    .line 1216
    .line 1217
    if-eqz v10, :cond_12

    .line 1218
    .line 1219
    check-cast v5, Lcom/google/android/gms/internal/measurement/B2;

    .line 1220
    .line 1221
    const/4 v10, 0x0

    .line 1222
    :goto_f
    if-ge v10, v7, :cond_6

    .line 1223
    .line 1224
    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/B2;->zzc()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v11

    .line 1228
    instance-of v12, v11, Lcom/google/android/gms/internal/measurement/f2;

    .line 1229
    .line 1230
    if-eqz v12, :cond_11

    .line 1231
    .line 1232
    check-cast v11, Lcom/google/android/gms/internal/measurement/f2;

    .line 1233
    .line 1234
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 1235
    .line 1236
    .line 1237
    move-result v11

    .line 1238
    invoke-static {v11, v11, v8}, LC0/S;->f(III)I

    .line 1239
    .line 1240
    .line 1241
    move-result v8

    .line 1242
    goto :goto_10

    .line 1243
    :cond_11
    check-cast v11, Ljava/lang/String;

    .line 1244
    .line 1245
    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/g2;->d0(Ljava/lang/String;)I

    .line 1246
    .line 1247
    .line 1248
    move-result v11

    .line 1249
    add-int/2addr v11, v8

    .line 1250
    move v8, v11

    .line 1251
    :goto_10
    add-int/lit8 v10, v10, 0x1

    .line 1252
    .line 1253
    goto :goto_f

    .line 1254
    :cond_12
    const/4 v10, 0x0

    .line 1255
    :goto_11
    if-ge v10, v7, :cond_6

    .line 1256
    .line 1257
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v11

    .line 1261
    instance-of v12, v11, Lcom/google/android/gms/internal/measurement/f2;

    .line 1262
    .line 1263
    if-eqz v12, :cond_13

    .line 1264
    .line 1265
    check-cast v11, Lcom/google/android/gms/internal/measurement/f2;

    .line 1266
    .line 1267
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 1268
    .line 1269
    .line 1270
    move-result v11

    .line 1271
    invoke-static {v11, v11, v8}, LC0/S;->f(III)I

    .line 1272
    .line 1273
    .line 1274
    move-result v8

    .line 1275
    goto :goto_12

    .line 1276
    :cond_13
    check-cast v11, Ljava/lang/String;

    .line 1277
    .line 1278
    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/g2;->d0(Ljava/lang/String;)I

    .line 1279
    .line 1280
    .line 1281
    move-result v11

    .line 1282
    add-int/2addr v11, v8

    .line 1283
    move v8, v11

    .line 1284
    :goto_12
    add-int/lit8 v10, v10, 0x1

    .line 1285
    .line 1286
    goto :goto_11

    .line 1287
    :pswitch_2b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v5

    .line 1291
    check-cast v5, Ljava/util/List;

    .line 1292
    .line 1293
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1294
    .line 1295
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1296
    .line 1297
    .line 1298
    move-result v5

    .line 1299
    if-nez v5, :cond_14

    .line 1300
    .line 1301
    :goto_13
    const/4 v7, 0x0

    .line 1302
    goto :goto_14

    .line 1303
    :cond_14
    shl-int/lit8 v7, v12, 0x3

    .line 1304
    .line 1305
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1306
    .line 1307
    .line 1308
    move-result v7

    .line 1309
    add-int/2addr v7, v15

    .line 1310
    mul-int/2addr v7, v5

    .line 1311
    :goto_14
    add-int/2addr v9, v7

    .line 1312
    goto/16 :goto_16

    .line 1313
    .line 1314
    :pswitch_2c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v5

    .line 1318
    check-cast v5, Ljava/util/List;

    .line 1319
    .line 1320
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->x(ILjava/util/List;)I

    .line 1321
    .line 1322
    .line 1323
    move-result v5

    .line 1324
    goto/16 :goto_4

    .line 1325
    .line 1326
    :pswitch_2d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v5

    .line 1330
    check-cast v5, Ljava/util/List;

    .line 1331
    .line 1332
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->y(ILjava/util/List;)I

    .line 1333
    .line 1334
    .line 1335
    move-result v5

    .line 1336
    goto/16 :goto_4

    .line 1337
    .line 1338
    :pswitch_2e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v5

    .line 1342
    check-cast v5, Ljava/util/List;

    .line 1343
    .line 1344
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1345
    .line 1346
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1347
    .line 1348
    .line 1349
    move-result v7

    .line 1350
    if-nez v7, :cond_15

    .line 1351
    .line 1352
    goto/16 :goto_6

    .line 1353
    .line 1354
    :cond_15
    shl-int/lit8 v8, v12, 0x3

    .line 1355
    .line 1356
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->u(Ljava/util/List;)I

    .line 1357
    .line 1358
    .line 1359
    move-result v5

    .line 1360
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1361
    .line 1362
    .line 1363
    move-result v8

    .line 1364
    goto/16 :goto_b

    .line 1365
    .line 1366
    :pswitch_2f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v5

    .line 1370
    check-cast v5, Ljava/util/List;

    .line 1371
    .line 1372
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1373
    .line 1374
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1375
    .line 1376
    .line 1377
    move-result v7

    .line 1378
    if-nez v7, :cond_16

    .line 1379
    .line 1380
    goto/16 :goto_6

    .line 1381
    .line 1382
    :cond_16
    shl-int/lit8 v8, v12, 0x3

    .line 1383
    .line 1384
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->r(Ljava/util/List;)I

    .line 1385
    .line 1386
    .line 1387
    move-result v5

    .line 1388
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1389
    .line 1390
    .line 1391
    move-result v8

    .line 1392
    goto/16 :goto_b

    .line 1393
    .line 1394
    :pswitch_30
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    check-cast v5, Ljava/util/List;

    .line 1399
    .line 1400
    sget-object v7, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1401
    .line 1402
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1403
    .line 1404
    .line 1405
    move-result v7

    .line 1406
    if-nez v7, :cond_17

    .line 1407
    .line 1408
    goto :goto_13

    .line 1409
    :cond_17
    shl-int/lit8 v7, v12, 0x3

    .line 1410
    .line 1411
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/T2;->q(Ljava/util/List;)I

    .line 1412
    .line 1413
    .line 1414
    move-result v8

    .line 1415
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1416
    .line 1417
    .line 1418
    move-result v5

    .line 1419
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1420
    .line 1421
    .line 1422
    move-result v7

    .line 1423
    mul-int/2addr v7, v5

    .line 1424
    add-int/2addr v7, v8

    .line 1425
    goto :goto_14

    .line 1426
    :pswitch_31
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v5

    .line 1430
    check-cast v5, Ljava/util/List;

    .line 1431
    .line 1432
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->x(ILjava/util/List;)I

    .line 1433
    .line 1434
    .line 1435
    move-result v5

    .line 1436
    goto/16 :goto_4

    .line 1437
    .line 1438
    :pswitch_32
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    check-cast v5, Ljava/util/List;

    .line 1443
    .line 1444
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/measurement/T2;->y(ILjava/util/List;)I

    .line 1445
    .line 1446
    .line 1447
    move-result v5

    .line 1448
    goto/16 :goto_4

    .line 1449
    .line 1450
    :pswitch_33
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v5

    .line 1454
    if-eqz v5, :cond_19

    .line 1455
    .line 1456
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v5

    .line 1460
    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    .line 1461
    .line 1462
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v7

    .line 1466
    shl-int/lit8 v8, v12, 0x3

    .line 1467
    .line 1468
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1469
    .line 1470
    .line 1471
    move-result v8

    .line 1472
    add-int/2addr v8, v8

    .line 1473
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 1474
    .line 1475
    .line 1476
    move-result v5

    .line 1477
    goto/16 :goto_3

    .line 1478
    .line 1479
    :pswitch_34
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v5

    .line 1483
    if-eqz v5, :cond_19

    .line 1484
    .line 1485
    shl-int/lit8 v0, v12, 0x3

    .line 1486
    .line 1487
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1488
    .line 1489
    .line 1490
    move-result-wide v7

    .line 1491
    add-long v11, v7, v7

    .line 1492
    .line 1493
    shr-long/2addr v7, v10

    .line 1494
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    xor-long/2addr v7, v11

    .line 1499
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 1500
    .line 1501
    .line 1502
    move-result v5

    .line 1503
    :goto_15
    add-int/2addr v5, v0

    .line 1504
    goto/16 :goto_4

    .line 1505
    .line 1506
    :pswitch_35
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v5

    .line 1510
    if-eqz v5, :cond_19

    .line 1511
    .line 1512
    shl-int/lit8 v0, v12, 0x3

    .line 1513
    .line 1514
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1515
    .line 1516
    .line 1517
    move-result v5

    .line 1518
    add-int v7, v5, v5

    .line 1519
    .line 1520
    shr-int/lit8 v5, v5, 0x1f

    .line 1521
    .line 1522
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1523
    .line 1524
    .line 1525
    move-result v0

    .line 1526
    xor-int/2addr v5, v7

    .line 1527
    invoke-static {v5, v0, v9}, LC0/S;->f(III)I

    .line 1528
    .line 1529
    .line 1530
    move-result v9

    .line 1531
    goto/16 :goto_16

    .line 1532
    .line 1533
    :pswitch_36
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v5

    .line 1537
    if-eqz v5, :cond_19

    .line 1538
    .line 1539
    shl-int/lit8 v0, v12, 0x3

    .line 1540
    .line 1541
    invoke-static {v0, v8, v9}, LC0/S;->f(III)I

    .line 1542
    .line 1543
    .line 1544
    move-result v9

    .line 1545
    goto/16 :goto_16

    .line 1546
    .line 1547
    :pswitch_37
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1548
    .line 1549
    .line 1550
    move-result v5

    .line 1551
    if-eqz v5, :cond_19

    .line 1552
    .line 1553
    shl-int/lit8 v0, v12, 0x3

    .line 1554
    .line 1555
    invoke-static {v0, v7, v9}, LC0/S;->f(III)I

    .line 1556
    .line 1557
    .line 1558
    move-result v9

    .line 1559
    goto/16 :goto_16

    .line 1560
    .line 1561
    :pswitch_38
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1562
    .line 1563
    .line 1564
    move-result v5

    .line 1565
    if-eqz v5, :cond_19

    .line 1566
    .line 1567
    shl-int/lit8 v0, v12, 0x3

    .line 1568
    .line 1569
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1570
    .line 1571
    .line 1572
    move-result v5

    .line 1573
    int-to-long v7, v5

    .line 1574
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1575
    .line 1576
    .line 1577
    move-result v0

    .line 1578
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 1579
    .line 1580
    .line 1581
    move-result v5

    .line 1582
    goto :goto_15

    .line 1583
    :pswitch_39
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1584
    .line 1585
    .line 1586
    move-result v5

    .line 1587
    if-eqz v5, :cond_19

    .line 1588
    .line 1589
    shl-int/lit8 v0, v12, 0x3

    .line 1590
    .line 1591
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1592
    .line 1593
    .line 1594
    move-result v5

    .line 1595
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1596
    .line 1597
    .line 1598
    move-result v0

    .line 1599
    invoke-static {v5, v0, v9}, LC0/S;->f(III)I

    .line 1600
    .line 1601
    .line 1602
    move-result v9

    .line 1603
    goto/16 :goto_16

    .line 1604
    .line 1605
    :pswitch_3a
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v5

    .line 1609
    if-eqz v5, :cond_19

    .line 1610
    .line 1611
    shl-int/lit8 v0, v12, 0x3

    .line 1612
    .line 1613
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v5

    .line 1617
    check-cast v5, Lcom/google/android/gms/internal/measurement/f2;

    .line 1618
    .line 1619
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1620
    .line 1621
    .line 1622
    move-result v0

    .line 1623
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 1624
    .line 1625
    .line 1626
    move-result v5

    .line 1627
    invoke-static {v5, v5, v0, v9}, LC0/S;->g(IIII)I

    .line 1628
    .line 1629
    .line 1630
    move-result v9

    .line 1631
    goto/16 :goto_16

    .line 1632
    .line 1633
    :pswitch_3b
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v5

    .line 1637
    if-eqz v5, :cond_19

    .line 1638
    .line 1639
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v5

    .line 1643
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v7

    .line 1647
    sget-object v8, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    .line 1648
    .line 1649
    shl-int/lit8 v8, v12, 0x3

    .line 1650
    .line 1651
    check-cast v5, Lcom/google/android/gms/internal/measurement/Y1;

    .line 1652
    .line 1653
    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1654
    .line 1655
    .line 1656
    move-result v8

    .line 1657
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/Y1;->b(Lcom/google/android/gms/internal/measurement/S2;)I

    .line 1658
    .line 1659
    .line 1660
    move-result v5

    .line 1661
    invoke-static {v5, v5, v8, v9}, LC0/S;->g(IIII)I

    .line 1662
    .line 1663
    .line 1664
    move-result v9

    .line 1665
    goto/16 :goto_16

    .line 1666
    .line 1667
    :pswitch_3c
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1668
    .line 1669
    .line 1670
    move-result v5

    .line 1671
    if-eqz v5, :cond_19

    .line 1672
    .line 1673
    shl-int/lit8 v0, v12, 0x3

    .line 1674
    .line 1675
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v5

    .line 1679
    instance-of v7, v5, Lcom/google/android/gms/internal/measurement/f2;

    .line 1680
    .line 1681
    if-eqz v7, :cond_18

    .line 1682
    .line 1683
    check-cast v5, Lcom/google/android/gms/internal/measurement/f2;

    .line 1684
    .line 1685
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1686
    .line 1687
    .line 1688
    move-result v0

    .line 1689
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f2;->h()I

    .line 1690
    .line 1691
    .line 1692
    move-result v5

    .line 1693
    invoke-static {v5, v5, v0, v9}, LC0/S;->g(IIII)I

    .line 1694
    .line 1695
    .line 1696
    move-result v9

    .line 1697
    goto/16 :goto_16

    .line 1698
    .line 1699
    :cond_18
    check-cast v5, Ljava/lang/String;

    .line 1700
    .line 1701
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1702
    .line 1703
    .line 1704
    move-result v0

    .line 1705
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/g2;->d0(Ljava/lang/String;)I

    .line 1706
    .line 1707
    .line 1708
    move-result v5

    .line 1709
    goto/16 :goto_15

    .line 1710
    .line 1711
    :pswitch_3d
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v5

    .line 1715
    if-eqz v5, :cond_19

    .line 1716
    .line 1717
    shl-int/lit8 v0, v12, 0x3

    .line 1718
    .line 1719
    invoke-static {v0, v15, v9}, LC0/S;->f(III)I

    .line 1720
    .line 1721
    .line 1722
    move-result v9

    .line 1723
    goto/16 :goto_16

    .line 1724
    .line 1725
    :pswitch_3e
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v5

    .line 1729
    if-eqz v5, :cond_19

    .line 1730
    .line 1731
    shl-int/lit8 v0, v12, 0x3

    .line 1732
    .line 1733
    invoke-static {v0, v7, v9}, LC0/S;->f(III)I

    .line 1734
    .line 1735
    .line 1736
    move-result v9

    .line 1737
    goto :goto_16

    .line 1738
    :pswitch_3f
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v5

    .line 1742
    if-eqz v5, :cond_19

    .line 1743
    .line 1744
    shl-int/lit8 v0, v12, 0x3

    .line 1745
    .line 1746
    invoke-static {v0, v8, v9}, LC0/S;->f(III)I

    .line 1747
    .line 1748
    .line 1749
    move-result v9

    .line 1750
    goto :goto_16

    .line 1751
    :pswitch_40
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v5

    .line 1755
    if-eqz v5, :cond_19

    .line 1756
    .line 1757
    shl-int/lit8 v0, v12, 0x3

    .line 1758
    .line 1759
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1760
    .line 1761
    .line 1762
    move-result v5

    .line 1763
    int-to-long v7, v5

    .line 1764
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1765
    .line 1766
    .line 1767
    move-result v0

    .line 1768
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 1769
    .line 1770
    .line 1771
    move-result v5

    .line 1772
    goto/16 :goto_15

    .line 1773
    .line 1774
    :pswitch_41
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v5

    .line 1778
    if-eqz v5, :cond_19

    .line 1779
    .line 1780
    shl-int/lit8 v0, v12, 0x3

    .line 1781
    .line 1782
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1783
    .line 1784
    .line 1785
    move-result-wide v7

    .line 1786
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1787
    .line 1788
    .line 1789
    move-result v0

    .line 1790
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 1791
    .line 1792
    .line 1793
    move-result v5

    .line 1794
    goto/16 :goto_15

    .line 1795
    .line 1796
    :pswitch_42
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1797
    .line 1798
    .line 1799
    move-result v5

    .line 1800
    if-eqz v5, :cond_19

    .line 1801
    .line 1802
    shl-int/lit8 v0, v12, 0x3

    .line 1803
    .line 1804
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1805
    .line 1806
    .line 1807
    move-result-wide v7

    .line 1808
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/g2;->u0(I)I

    .line 1809
    .line 1810
    .line 1811
    move-result v0

    .line 1812
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/g2;->c0(J)I

    .line 1813
    .line 1814
    .line 1815
    move-result v5

    .line 1816
    goto/16 :goto_15

    .line 1817
    .line 1818
    :pswitch_43
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v5

    .line 1822
    if-eqz v5, :cond_19

    .line 1823
    .line 1824
    shl-int/lit8 v0, v12, 0x3

    .line 1825
    .line 1826
    invoke-static {v0, v7, v9}, LC0/S;->f(III)I

    .line 1827
    .line 1828
    .line 1829
    move-result v9

    .line 1830
    goto :goto_16

    .line 1831
    :pswitch_44
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v5

    .line 1835
    if-eqz v5, :cond_19

    .line 1836
    .line 1837
    shl-int/lit8 v0, v12, 0x3

    .line 1838
    .line 1839
    invoke-static {v0, v8, v9}, LC0/S;->f(III)I

    .line 1840
    .line 1841
    .line 1842
    move-result v9

    .line 1843
    :cond_19
    :goto_16
    add-int/lit8 v2, v2, 0x3

    .line 1844
    .line 1845
    move-object/from16 v0, p0

    .line 1846
    .line 1847
    move-object/from16 v1, p1

    .line 1848
    .line 1849
    const v8, 0xfffff

    .line 1850
    .line 1851
    .line 1852
    goto/16 :goto_0

    .line 1853
    .line 1854
    :cond_1a
    move-object/from16 v0, p1

    .line 1855
    .line 1856
    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    .line 1857
    .line 1858
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    .line 1859
    .line 1860
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y2;->c()I

    .line 1861
    .line 1862
    .line 1863
    move-result v0

    .line 1864
    add-int/2addr v0, v9

    .line 1865
    return v0

    .line 1866
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v6, 0x0

    .line 2
    const v7, 0xfffff

    .line 3
    .line 4
    .line 5
    move v3, v6

    .line 6
    move v8, v3

    .line 7
    move v2, v7

    .line 8
    :goto_0
    iget v4, p0, Lcom/google/android/gms/internal/measurement/L2;->g:I

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-ge v8, v4, :cond_c

    .line 12
    .line 13
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/L2;->f:[I

    .line 14
    .line 15
    aget v4, v4, v8

    .line 16
    .line 17
    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 18
    .line 19
    aget v10, v9, v4

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 22
    .line 23
    .line 24
    move-result v11

    .line 25
    add-int/lit8 v12, v4, 0x2

    .line 26
    .line 27
    aget v9, v9, v12

    .line 28
    .line 29
    and-int v12, v9, v7

    .line 30
    .line 31
    ushr-int/lit8 v9, v9, 0x14

    .line 32
    .line 33
    shl-int/2addr v5, v9

    .line 34
    if-eq v12, v2, :cond_1

    .line 35
    .line 36
    if-eq v12, v7, :cond_0

    .line 37
    .line 38
    int-to-long v2, v12

    .line 39
    sget-object v9, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 40
    .line 41
    invoke-virtual {v9, p1, v2, v3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :cond_0
    move v2, v4

    .line 46
    move v4, v3

    .line 47
    move v3, v12

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v13, v3

    .line 50
    move v3, v2

    .line 51
    move v2, v4

    .line 52
    move v4, v13

    .line 53
    :goto_1
    const/high16 v9, 0x10000000

    .line 54
    .line 55
    and-int/2addr v9, v11

    .line 56
    if-eqz v9, :cond_2

    .line 57
    .line 58
    move-object v0, p0

    .line 59
    move-object v1, p1

    .line 60
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_a

    .line 65
    .line 66
    :cond_2
    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/16 v12, 0x9

    .line 71
    .line 72
    if-eq v9, v12, :cond_9

    .line 73
    .line 74
    const/16 v12, 0x11

    .line 75
    .line 76
    if-eq v9, v12, :cond_9

    .line 77
    .line 78
    const/16 v5, 0x1b

    .line 79
    .line 80
    if-eq v9, v5, :cond_7

    .line 81
    .line 82
    const/16 v5, 0x3c

    .line 83
    .line 84
    if-eq v9, v5, :cond_6

    .line 85
    .line 86
    const/16 v5, 0x44

    .line 87
    .line 88
    if-eq v9, v5, :cond_6

    .line 89
    .line 90
    const/16 v5, 0x31

    .line 91
    .line 92
    if-eq v9, v5, :cond_7

    .line 93
    .line 94
    const/16 v5, 0x32

    .line 95
    .line 96
    if-eq v9, v5, :cond_3

    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_3
    and-int v5, v11, v7

    .line 101
    .line 102
    int-to-long v9, v5

    .line 103
    invoke-static {v9, v10, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lcom/google/android/gms/internal/measurement/H2;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v9, :cond_b

    .line 114
    .line 115
    div-int/lit8 v2, v2, 0x3

    .line 116
    .line 117
    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 118
    .line 119
    add-int/2addr v2, v2

    .line 120
    aget-object v2, v9, v2

    .line 121
    .line 122
    check-cast v2, Lcom/google/android/gms/internal/measurement/G2;

    .line 123
    .line 124
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/G2;->a:Lcom/google/android/gms/internal/measurement/t;

    .line 125
    .line 126
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Lcom/google/android/gms/internal/measurement/g3;

    .line 129
    .line 130
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/g3;->q:Lcom/google/android/gms/internal/measurement/h3;

    .line 131
    .line 132
    sget-object v9, Lcom/google/android/gms/internal/measurement/h3;->y:Lcom/google/android/gms/internal/measurement/h3;

    .line 133
    .line 134
    if-ne v2, v9, :cond_b

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/4 v5, 0x0

    .line 145
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_b

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    if-nez v5, :cond_5

    .line 156
    .line 157
    sget-object v5, Lcom/google/android/gms/internal/measurement/P2;->c:Lcom/google/android/gms/internal/measurement/P2;

    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/measurement/P2;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/S2;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    :cond_5
    invoke-interface {v5, v9}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-nez v9, :cond_4

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    invoke-virtual {p0, v10, v2, p1}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_b

    .line 179
    .line 180
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    and-int v5, v11, v7

    .line 185
    .line 186
    int-to-long v9, v5

    .line 187
    invoke-static {v9, v10, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_b

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    and-int v5, v11, v7

    .line 199
    .line 200
    int-to-long v9, v5

    .line 201
    invoke-static {v9, v10, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-nez v9, :cond_b

    .line 212
    .line 213
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    move v9, v6

    .line 218
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-ge v9, v10, :cond_b

    .line 223
    .line 224
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-interface {v2, v10}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    if-nez v10, :cond_8

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_9
    move-object v0, p0

    .line 239
    move-object v1, p1

    .line 240
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/L2;->m(Ljava/lang/Object;IIII)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_b

    .line 245
    .line 246
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    and-int v5, v11, v7

    .line 251
    .line 252
    int-to-long v9, v5

    .line 253
    invoke-static {v9, v10, p1}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/measurement/S2;->h(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-nez v2, :cond_b

    .line 262
    .line 263
    :cond_a
    :goto_3
    return v6

    .line 264
    :cond_b
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 265
    .line 266
    move v2, v3

    .line 267
    move v3, v4

    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_c
    return v5
.end method

.method public final l(Lcom/google/android/gms/internal/measurement/q2;Lcom/google/android/gms/internal/measurement/q2;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

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

.method public final m(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final n(ILjava/lang/Object;)Z
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    and-int v0, p1, v1

    .line 26
    .line 27
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-long v0, v0

    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    packed-switch p1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :pswitch_1
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    cmp-long p1, p1, v2

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :pswitch_2
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :pswitch_3
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    cmp-long p1, p1, v2

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :pswitch_4
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :pswitch_5
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :pswitch_6
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/f2;

    .line 104
    .line 105
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/f2;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_3

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :pswitch_8
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :pswitch_9
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    instance-of p2, p1, Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p2, :cond_0

    .line 132
    .line 133
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_3

    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :cond_0
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/f2;

    .line 144
    .line 145
    if-eqz p2, :cond_1

    .line 146
    .line 147
    sget-object p2, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/f2;

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/f2;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_3

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_a
    sget-object p1, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 163
    .line 164
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/c3;->b(JLjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    return p1

    .line 169
    :pswitch_b
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_3

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_c
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 177
    .line 178
    .line 179
    move-result-wide p1

    .line 180
    cmp-long p1, p1, v2

    .line 181
    .line 182
    if-eqz p1, :cond_3

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :pswitch_d
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :pswitch_e
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 193
    .line 194
    .line 195
    move-result-wide p1

    .line 196
    cmp-long p1, p1, v2

    .line 197
    .line 198
    if-eqz p1, :cond_3

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :pswitch_f
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->h(JLjava/lang/Object;)J

    .line 202
    .line 203
    .line 204
    move-result-wide p1

    .line 205
    cmp-long p1, p1, v2

    .line 206
    .line 207
    if-eqz p1, :cond_3

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :pswitch_10
    sget-object p1, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 211
    .line 212
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/c3;->d(JLjava/lang/Object;)F

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    .line 224
    .line 225
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/c3;->f(JLjava/lang/Object;)D

    .line 226
    .line 227
    .line 228
    move-result-wide p1

    .line 229
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 230
    .line 231
    .line 232
    move-result-wide p1

    .line 233
    cmp-long p1, p1, v2

    .line 234
    .line 235
    if-eqz p1, :cond_3

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    .line 239
    .line 240
    shl-int p1, v5, p1

    .line 241
    .line 242
    invoke-static {v2, v3, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    and-int/2addr p1, p2

    .line 247
    if-eqz p1, :cond_3

    .line 248
    .line 249
    :goto_0
    return v5

    .line 250
    :cond_3
    const/4 p1, 0x0

    .line 251
    return p1

    .line 252
    nop

    .line 253
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

.method public final o(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, p1

    .line 11
    int-to-long v0, v0

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    .line 21
    .line 22
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    shl-int p1, v3, p1

    .line 28
    .line 29
    or-int/2addr p1, v2

    .line 30
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final p(IILjava/lang/Object;)Z
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

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
    invoke-static {v0, v1, p3}, Lcom/google/android/gms/internal/measurement/d3;->f(JLjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-ne p2, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final q(II)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    div-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    :goto_0
    if-gt p2, v1, :cond_2

    .line 9
    .line 10
    add-int v3, v1, p2

    .line 11
    .line 12
    ushr-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    mul-int/lit8 v4, v3, 0x3

    .line 15
    .line 16
    aget v5, v0, v4

    .line 17
    .line 18
    if-ne p1, v5, :cond_0

    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    if-ge p1, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v3, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return v2
.end method

.method public final s(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/b2;)I
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    .line 1
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_99

    .line 2
    sget-object v2, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    move/from16 v5, p3

    const/4 v8, -0x1

    const/4 v9, 0x0

    const v10, 0xfffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    const v16, 0xfffff

    :goto_1
    iget-object v13, v1, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    iget-object v12, v1, Lcom/google/android/gms/internal/measurement/L2;->i:Lcom/google/android/gms/internal/measurement/o2;

    sget-object v11, Lcom/google/android/gms/internal/measurement/Y2;->f:Lcom/google/android/gms/internal/measurement/Y2;

    move/from16 p3, v9

    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    move-object/from16 v19, v9

    const-string v9, "Failed to parse the message."

    move-object/from16 v20, v12

    const/16 v21, 0x0

    const/16 v22, 0x3

    if-ge v5, v6, :cond_8d

    add-int/lit8 v15, v5, 0x1

    .line 3
    aget-byte v5, v4, v5

    if-gez v5, :cond_0

    .line 4
    invoke-static {v5, v4, v15, v7}, Lcom/google/android/gms/internal/measurement/P1;->j0(I[BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v15

    iget v5, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    :cond_0
    move/from16 v37, v15

    move v15, v5

    move/from16 v5, v37

    ushr-int/lit8 v12, v15, 0x3

    iget v4, v1, Lcom/google/android/gms/internal/measurement/L2;->d:I

    move/from16 v24, v5

    iget v5, v1, Lcom/google/android/gms/internal/measurement/L2;->c:I

    if-le v12, v8, :cond_2

    div-int/lit8 v8, p3, 0x3

    if-lt v12, v5, :cond_1

    if-gt v12, v4, :cond_1

    .line 5
    invoke-virtual {v1, v12, v8}, Lcom/google/android/gms/internal/measurement/L2;->q(II)I

    move-result v4

    goto :goto_2

    :cond_1
    const/4 v4, -0x1

    :goto_2
    move v5, v4

    const/4 v4, 0x0

    :goto_3
    const/4 v8, -0x1

    goto :goto_4

    :cond_2
    if-lt v12, v5, :cond_3

    if-gt v12, v4, :cond_3

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v1, v12, v4}, Lcom/google/android/gms/internal/measurement/L2;->q(II)I

    move-result v5

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    const/4 v5, -0x1

    goto :goto_3

    :goto_4
    if-ne v5, v8, :cond_4

    move-object v0, v2

    move/from16 v18, v4

    move-object/from16 v32, v9

    move v1, v10

    move-object/from16 v17, v13

    move v9, v15

    move-object v15, v3

    move/from16 v10, v18

    move-object v3, v7

    move/from16 v4, v24

    move-object/from16 v7, p2

    move/from16 v24, v8

    move-object v8, v11

    :goto_5
    move/from16 v11, p5

    goto/16 :goto_53

    :cond_4
    and-int/lit8 v4, v15, 0x7

    add-int/lit8 v17, v5, 0x1

    .line 7
    aget v8, v19, v17

    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/L2;->E(I)I

    move-result v6

    and-int v7, v8, v16

    move/from16 v25, v12

    move-object/from16 v17, v13

    int-to-long v12, v7

    const/high16 v26, 0x20000000

    const-wide/16 v27, 0x0

    const-string v7, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    move-wide/from16 v31, v12

    const-string v12, ""

    const/16 v13, 0x11

    const/16 v33, 0x1

    if-gt v6, v13, :cond_16

    add-int/lit8 v13, v5, 0x2

    .line 8
    aget v13, v19, v13

    ushr-int/lit8 v29, v13, 0x14

    shl-int v29, v33, v29

    and-int v13, v13, v16

    if-eq v13, v10, :cond_7

    move/from16 v0, v16

    if-eq v10, v0, :cond_5

    int-to-long v0, v10

    .line 9
    invoke-virtual {v2, v3, v0, v1, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v0, 0xfffff

    :cond_5
    if-ne v13, v0, :cond_6

    const/4 v0, 0x0

    goto :goto_6

    :cond_6
    int-to-long v0, v13

    .line 10
    invoke-virtual {v2, v3, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    :goto_6
    move v14, v0

    goto :goto_7

    :cond_7
    move v13, v10

    :goto_7
    packed-switch v6, :pswitch_data_0

    move/from16 v0, v22

    if-ne v4, v0, :cond_8

    or-int v14, v14, v29

    move-object/from16 v1, p0

    .line 11
    invoke-virtual {v1, v5, v3}, Lcom/google/android/gms/internal/measurement/L2;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v0, v25, 0x3

    or-int/lit8 v9, v0, 0x4

    move v0, v5

    .line 12
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v5

    move-object/from16 v6, p2

    move/from16 v8, p4

    move-object/from16 v10, p6

    move/from16 v7, v24

    const/16 v18, 0x0

    const/16 v24, -0x1

    .line 13
    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/measurement/P1;->r0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    move-object v12, v10

    move-object v10, v6

    .line 14
    invoke-virtual {v1, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/L2;->A(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    move/from16 v6, p4

    move v9, v0

    :goto_9
    move-object v4, v10

    move-object v7, v12

    :goto_a
    move v10, v13

    move/from16 v8, v25

    goto/16 :goto_0

    :cond_8
    move v0, v5

    move/from16 v5, v24

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v1, p0

    move-object v12, v2

    move-object v2, v3

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v31, v15

    move-object/from16 v13, p2

    move-object/from16 v15, p6

    goto/16 :goto_15

    :pswitch_0
    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-object/from16 v12, p6

    move v0, v5

    move/from16 v5, v24

    const/16 v18, 0x0

    const/16 v24, -0x1

    if-nez v4, :cond_9

    or-int v14, v14, v29

    .line 15
    invoke-static {v10, v5, v12}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v8

    iget-wide v4, v12, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 16
    invoke-static {v4, v5}, Ll6/d;->H(J)J

    move-result-wide v6

    move-wide/from16 v4, v31

    .line 17
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v37, v3

    move-object v3, v2

    move-object/from16 v2, v37

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move/from16 v6, p4

    move v9, v0

    move v5, v8

    goto :goto_9

    :cond_9
    move-object/from16 v37, v3

    move-object v3, v2

    move-object/from16 v2, v37

    :cond_a
    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v31, v15

    move-object v13, v10

    move-object v15, v12

    move-object v12, v3

    goto/16 :goto_15

    :pswitch_1
    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-object/from16 v12, p6

    move v0, v5

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    if-nez v4, :cond_a

    or-int v14, v14, v29

    .line 18
    invoke-static {v10, v5, v12}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget v4, v12, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 19
    invoke-static {v4}, Ll6/d;->G(I)I

    move-result v4

    .line 20
    invoke-virtual {v3, v2, v6, v7, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_b
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    goto/16 :goto_8

    :pswitch_2
    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-object/from16 v12, p6

    move v0, v5

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    if-nez v4, :cond_a

    .line 21
    invoke-static {v10, v5, v12}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget v4, v12, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->y(I)Lcom/google/android/gms/internal/measurement/t2;

    move-result-object v9

    const/high16 v17, -0x80000000

    and-int v8, v8, v17

    if-eqz v8, :cond_d

    if-eqz v9, :cond_d

    invoke-interface {v9, v4}, Lcom/google/android/gms/internal/measurement/t2;->a(I)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_c

    .line 23
    :cond_b
    move-object v6, v2

    check-cast v6, Lcom/google/android/gms/internal/measurement/q2;

    iget-object v7, v6, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    if-ne v7, v11, :cond_c

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v7

    .line 24
    iput-object v7, v6, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_c
    int-to-long v8, v4

    .line 25
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v15, v4}, Lcom/google/android/gms/internal/measurement/Y2;->d(ILjava/lang/Object;)V

    goto :goto_b

    :cond_d
    :goto_c
    or-int v14, v14, v29

    .line 26
    invoke-virtual {v3, v2, v6, v7, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_b

    :pswitch_3
    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-object/from16 v12, p6

    move v0, v5

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/4 v8, 0x2

    const/16 v18, 0x0

    const/16 v24, -0x1

    if-ne v4, v8, :cond_a

    or-int v14, v14, v29

    .line 27
    invoke-static {v10, v5, v12}, Lcom/google/android/gms/internal/measurement/P1;->p0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget-object v4, v12, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 28
    invoke-virtual {v3, v2, v6, v7, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_b

    :pswitch_4
    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-object/from16 v12, p6

    move v0, v5

    move/from16 v5, v24

    const/4 v8, 0x2

    const/16 v18, 0x0

    const/16 v24, -0x1

    if-ne v4, v8, :cond_e

    or-int v14, v14, v29

    move-object v4, v2

    .line 29
    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/measurement/L2;->z(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v3

    .line 30
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v3

    move-object v7, v10

    move-object v10, v4

    move-object v4, v7

    move-object v7, v12

    move-object v12, v6

    move/from16 v6, p4

    .line 31
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/P1;->q0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    move-object v3, v4

    move-object v4, v2

    move-object v2, v3

    move-object v3, v7

    .line 32
    invoke-virtual {v1, v0, v10, v4}, Lcom/google/android/gms/internal/measurement/L2;->A(ILjava/lang/Object;Ljava/lang/Object;)V

    move v9, v0

    move-object v4, v2

    move-object v3, v10

    move-object v2, v12

    goto/16 :goto_a

    :cond_e
    move-object/from16 v37, v10

    move-object v10, v2

    move-object/from16 v2, v37

    move-object/from16 v37, v12

    move-object v12, v3

    move-object/from16 v3, v37

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v31, v15

    move-object v13, v2

    move-object v15, v3

    :goto_d
    move-object v2, v10

    goto/16 :goto_15

    :pswitch_5
    move-object/from16 v1, p0

    move-object v6, v2

    move-object v10, v3

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v13, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move/from16 v31, v15

    const/4 v15, 0x2

    if-ne v4, v15, :cond_12

    and-int v4, v8, v26

    if-eqz v4, :cond_f

    or-int v4, v30, v29

    .line 33
    invoke-static {v2, v5, v3}, Lcom/google/android/gms/internal/measurement/P1;->o0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    move v7, v4

    goto :goto_f

    .line 34
    :cond_f
    invoke-static {v2, v5, v3}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v5, v3, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v5, :cond_11

    or-int v7, v30, v29

    if-nez v5, :cond_10

    .line 35
    iput-object v12, v3, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    :goto_e
    move v5, v4

    goto :goto_f

    :cond_10
    new-instance v8, Ljava/lang/String;

    .line 36
    sget-object v9, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v8, v2, v4, v5, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v8, v3, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    add-int/2addr v4, v5

    goto :goto_e

    .line 37
    :goto_f
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 38
    invoke-virtual {v6, v10, v13, v14, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v9, v0

    move-object v4, v2

    move-object v2, v6

    move v14, v7

    move/from16 v8, v25

    move/from16 v15, v31

    const v16, 0xfffff

    move/from16 v6, p4

    move-object v7, v3

    move-object v3, v10

    :goto_10
    move/from16 v10, p3

    goto/16 :goto_1

    .line 39
    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 40
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    throw v0

    :cond_12
    move-object v13, v2

    move-object v15, v3

    move-object v12, v6

    goto :goto_d

    :pswitch_6
    move-object/from16 v1, p0

    move-object v6, v2

    move-object v10, v3

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v13, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move/from16 v31, v15

    if-nez v4, :cond_12

    or-int v4, v30, v29

    .line 42
    invoke-static {v2, v5, v3}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget-wide v7, v3, Lcom/google/android/gms/internal/measurement/b2;->b:J

    cmp-long v7, v7, v27

    if-eqz v7, :cond_13

    move/from16 v7, v33

    goto :goto_11

    :cond_13
    move/from16 v7, v18

    .line 43
    :goto_11
    sget-object v8, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    invoke-virtual {v8, v10, v13, v14, v7}, Lcom/google/android/gms/internal/measurement/c3;->c(Ljava/lang/Object;JZ)V

    move v9, v0

    move-object v7, v3

    move v14, v4

    move-object v3, v10

    move/from16 v8, v25

    move/from16 v15, v31

    const v16, 0xfffff

    move/from16 v10, p3

    move-object v4, v2

    move-object v2, v6

    :goto_12
    move/from16 v6, p4

    goto/16 :goto_1

    :pswitch_7
    move-object/from16 v1, p0

    move-object v6, v2

    move-object v10, v3

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v13, v31

    const/4 v7, 0x5

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move/from16 v31, v15

    if-ne v4, v7, :cond_12

    add-int/lit8 v4, v5, 0x4

    or-int v7, v30, v29

    .line 44
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v5

    invoke-virtual {v6, v10, v13, v14, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v9, v0

    move v5, v4

    move v14, v7

    move/from16 v8, v25

    move/from16 v15, v31

    const v16, 0xfffff

    move-object v4, v2

    move-object v7, v3

    move-object v2, v6

    move-object v3, v10

    move/from16 v10, p3

    goto :goto_12

    :pswitch_8
    move-object/from16 v1, p0

    move-object v6, v2

    move-object v10, v3

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v13, v31

    move/from16 v7, v33

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p6

    move/from16 v31, v15

    if-ne v4, v7, :cond_12

    add-int/lit8 v8, v5, 0x8

    or-int v9, v30, v29

    move-object v12, v6

    .line 45
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v6

    move-object v15, v3

    move-object v3, v10

    move-wide v4, v13

    move-object v13, v2

    move-object v2, v12

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v10, p3

    move/from16 v6, p4

    move v5, v8

    move v14, v9

    move-object v4, v13

    move-object v7, v15

    move/from16 v8, v25

    move/from16 v15, v31

    const v16, 0xfffff

    move v9, v0

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v1, p0

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v13, p2

    move/from16 v31, v15

    move-object/from16 v15, p6

    if-nez v4, :cond_14

    or-int v14, v30, v29

    .line 46
    invoke-static {v13, v5, v15}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget v4, v15, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 47
    invoke-virtual {v2, v3, v6, v7, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move/from16 v10, p3

    move/from16 v6, p4

    move v9, v0

    :goto_13
    move-object v4, v13

    move-object v7, v15

    move/from16 v8, v25

    move/from16 v15, v31

    goto/16 :goto_0

    :cond_14
    move-object v12, v2

    :cond_15
    move-object v2, v3

    goto/16 :goto_15

    :pswitch_a
    move-object/from16 v1, p0

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v13, p2

    move/from16 v31, v15

    move-object/from16 v15, p6

    if-nez v4, :cond_14

    or-int v14, v30, v29

    .line 48
    invoke-static {v13, v5, v15}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v8

    move-wide v4, v6

    iget-wide v6, v15, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 49
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v10, p3

    move/from16 v6, p4

    move v9, v0

    move v5, v8

    goto :goto_13

    :pswitch_b
    move-object/from16 v1, p0

    move-object v12, v2

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v6, v31

    const/4 v2, 0x5

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v13, p2

    move/from16 v31, v15

    move-object/from16 v15, p6

    if-ne v4, v2, :cond_15

    add-int/lit8 v2, v5, 0x4

    or-int v14, v30, v29

    .line 50
    invoke-static {v5, v13}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 51
    sget-object v5, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    invoke-virtual {v5, v3, v6, v7, v4}, Lcom/google/android/gms/internal/measurement/c3;->e(Ljava/lang/Object;JF)V

    move/from16 v10, p3

    move/from16 v6, p4

    move v9, v0

    move v5, v2

    :goto_14
    move-object v2, v12

    goto :goto_13

    :pswitch_c
    move-object/from16 v1, p0

    move-object v12, v2

    move v0, v5

    move/from16 p3, v13

    move/from16 v30, v14

    move/from16 v5, v24

    move-wide/from16 v6, v31

    move/from16 v2, v33

    const/16 v18, 0x0

    const/16 v24, -0x1

    move-object/from16 v13, p2

    move/from16 v31, v15

    move-object/from16 v15, p6

    if-ne v4, v2, :cond_15

    add-int/lit8 v8, v5, 0x8

    or-int v14, v30, v29

    .line 52
    invoke-static {v5, v13}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    .line 53
    sget-object v2, Lcom/google/android/gms/internal/measurement/d3;->c:Lcom/google/android/gms/internal/measurement/c3;

    move-wide/from16 v37, v6

    move-wide v6, v4

    move-wide/from16 v4, v37

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/c3;->g(Ljava/lang/Object;JD)V

    move/from16 v10, p3

    move/from16 v6, p4

    move v9, v0

    move v5, v8

    goto :goto_14

    :goto_15
    move/from16 v1, p3

    move v10, v0

    move v4, v5

    move-object/from16 v32, v9

    move-object v8, v11

    move-object v0, v12

    move-object v7, v13

    move-object v3, v15

    move/from16 v12, v25

    move/from16 v14, v30

    move/from16 v9, v31

    move/from16 v11, p5

    move-object v15, v2

    goto/16 :goto_53

    :cond_16
    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move v0, v5

    move/from16 v29, v14

    move-wide/from16 v13, v31

    const/16 v18, 0x0

    move/from16 v31, v15

    move/from16 v32, v24

    const/16 v24, -0x1

    move-object/from16 v15, p6

    const/16 v5, 0x1b

    move/from16 p3, v10

    if-ne v6, v5, :cond_1a

    const/4 v5, 0x2

    if-ne v4, v5, :cond_19

    .line 54
    invoke-virtual {v3, v2, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/w2;

    .line 55
    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/internal/measurement/Z1;

    .line 56
    iget-boolean v5, v5, Lcom/google/android/gms/internal/measurement/Z1;->q:Z

    if-nez v5, :cond_18

    .line 57
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_17

    const/16 v10, 0xa

    goto :goto_16

    :cond_17
    add-int v10, v5, v5

    .line 58
    :goto_16
    invoke-interface {v4, v10}, Lcom/google/android/gms/internal/measurement/w2;->K(I)Lcom/google/android/gms/internal/measurement/w2;

    move-result-object v4

    .line 59
    invoke-virtual {v3, v2, v13, v14, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_18
    move-object v7, v4

    .line 60
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v2

    move-object/from16 v4, p2

    move/from16 v6, p4

    move-object v12, v3

    move-object v8, v15

    move/from16 v3, v31

    move/from16 v5, v32

    move-object/from16 v15, p1

    .line 61
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/P1;->u0(Lcom/google/android/gms/internal/measurement/S2;I[BIILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    move v2, v3

    move/from16 v10, p3

    move-object/from16 v7, p6

    move v9, v0

    move-object v3, v15

    move/from16 v8, v25

    move/from16 v14, v29

    const v16, 0xfffff

    move v15, v2

    move-object v2, v12

    goto/16 :goto_1

    :cond_19
    move-object v15, v2

    move-object/from16 v5, p2

    move-object/from16 v4, p6

    move v10, v0

    move-object v0, v3

    move-object/from16 v34, v11

    move/from16 v8, v32

    move-object v11, v9

    move/from16 v9, v31

    :goto_17
    move/from16 v7, p4

    goto/16 :goto_46

    :cond_1a
    move-object v15, v2

    move/from16 v2, v31

    move/from16 v5, v32

    const/16 v10, 0x31

    move/from16 v32, v2

    const-string v2, "Protocol message had invalid UTF-8."

    move/from16 v34, v5

    const-string v5, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    if-gt v6, v10, :cond_72

    move-object v10, v9

    int-to-long v8, v8

    .line 62
    invoke-virtual {v3, v15, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v26

    move-wide/from16 v35, v8

    move-object/from16 v8, v26

    check-cast v8, Lcom/google/android/gms/internal/measurement/w2;

    .line 63
    move-object v9, v8

    check-cast v9, Lcom/google/android/gms/internal/measurement/Z1;

    .line 64
    iget-boolean v9, v9, Lcom/google/android/gms/internal/measurement/Z1;->q:Z

    if-nez v9, :cond_1b

    .line 65
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    add-int/2addr v9, v9

    .line 66
    invoke-interface {v8, v9}, Lcom/google/android/gms/internal/measurement/w2;->K(I)Lcom/google/android/gms/internal/measurement/w2;

    move-result-object v8

    .line 67
    invoke-virtual {v3, v15, v13, v14, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1b
    move-object v9, v8

    packed-switch v6, :pswitch_data_1

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1e

    and-int/lit8 v2, v32, -0x8

    or-int/lit8 v7, v2, 0x4

    move-object v12, v3

    .line 68
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v3

    .line 69
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    move-result-object v2

    move-object/from16 v4, p2

    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object v13, v12

    move/from16 v12, v32

    move/from16 v5, v34

    .line 70
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/P1;->r0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v14

    move-object/from16 v37, v8

    move-object v8, v2

    move v2, v7

    move-object/from16 v7, v37

    .line 71
    invoke-interface {v3, v8}, Lcom/google/android/gms/internal/measurement/S2;->a(Ljava/lang/Object;)V

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 72
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_18
    if-ge v14, v6, :cond_1d

    move/from16 v32, v5

    .line 73
    invoke-static {v4, v14, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget v8, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v12, v8, :cond_1c

    move v7, v2

    .line 74
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    move-result-object v2

    move-object/from16 v8, p6

    .line 75
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/P1;->r0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v14

    move-object v5, v2

    move-object v2, v4

    move-object v4, v3

    move v3, v7

    move-object v7, v8

    .line 76
    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/measurement/S2;->a(Ljava/lang/Object;)V

    iput-object v5, v7, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 77
    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v5, v4

    move-object v4, v2

    move v2, v3

    move-object v3, v5

    move/from16 v5, v32

    goto :goto_18

    :cond_1c
    move/from16 v8, v32

    :goto_19
    move-object v2, v4

    goto :goto_1a

    :cond_1d
    move v8, v5

    goto :goto_19

    :goto_1a
    move-object v3, v2

    move v2, v8

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v9, v12

    move-object/from16 v26, v13

    move v5, v14

    move v10, v0

    move-object v11, v7

    :goto_1b
    move v7, v6

    goto/16 :goto_40

    :cond_1e
    move/from16 v7, p4

    move-object/from16 v26, v3

    move/from16 v9, v32

    move/from16 v2, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move-object/from16 v11, p6

    move v10, v0

    goto/16 :goto_3f

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    move-object v13, v3

    move/from16 v12, v32

    move/from16 v8, v34

    const/4 v3, 0x2

    if-ne v4, v3, :cond_22

    .line 78
    check-cast v9, Lcom/google/android/gms/internal/measurement/D2;

    .line 79
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v4, v3

    :goto_1c
    if-ge v3, v4, :cond_1f

    .line 80
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move-object/from16 v26, v13

    iget-wide v13, v7, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 81
    invoke-static {v13, v14}, Ll6/d;->H(J)J

    move-result-wide v13

    invoke-virtual {v9, v13, v14}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    move-object/from16 v13, v26

    goto :goto_1c

    :cond_1f
    move-object/from16 v26, v13

    if-ne v3, v4, :cond_21

    :cond_20
    :goto_1d
    move v5, v3

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v9, v12

    move v10, v0

    move-object v3, v2

    move-object v11, v7

    move v2, v8

    goto :goto_1b

    .line 82
    :cond_21
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 83
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    throw v0

    :cond_22
    move-object/from16 v26, v13

    if-nez v4, :cond_23

    .line 85
    check-cast v9, Lcom/google/android/gms/internal/measurement/D2;

    .line 86
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget-wide v4, v7, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 87
    invoke-static {v4, v5}, Ll6/d;->H(J)J

    move-result-wide v4

    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    :goto_1e
    if-ge v3, v6, :cond_20

    .line 88
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v5, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v12, v5, :cond_20

    .line 89
    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget-wide v4, v7, Lcom/google/android/gms/internal/measurement/b2;->b:J

    invoke-static {v4, v5}, Ll6/d;->H(J)J

    move-result-wide v4

    .line 90
    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    goto :goto_1e

    :cond_23
    move-object v3, v2

    move v2, v8

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v9, v12

    move v10, v0

    move-object v11, v7

    :goto_1f
    move v7, v6

    goto/16 :goto_3f

    :pswitch_e
    move-object/from16 v2, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    move-object/from16 v26, v3

    move/from16 v12, v32

    move/from16 v8, v34

    const/4 v3, 0x2

    if-ne v4, v3, :cond_26

    .line 91
    check-cast v9, Lcom/google/android/gms/internal/measurement/r2;

    .line 92
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v4, v3

    :goto_20
    if-ge v3, v4, :cond_24

    .line 93
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v13, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 94
    invoke-static {v13}, Ll6/d;->G(I)I

    move-result v13

    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    goto :goto_20

    :cond_24
    if-ne v3, v4, :cond_25

    goto :goto_1d

    .line 95
    :cond_25
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 96
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 97
    throw v0

    :cond_26
    if-nez v4, :cond_23

    .line 98
    check-cast v9, Lcom/google/android/gms/internal/measurement/r2;

    .line 99
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 100
    invoke-static {v4}, Ll6/d;->G(I)I

    move-result v4

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    :goto_21
    if-ge v3, v6, :cond_20

    .line 101
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v5, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v12, v5, :cond_20

    .line 102
    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    invoke-static {v4}, Ll6/d;->G(I)I

    move-result v4

    .line 103
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    goto :goto_21

    :pswitch_f
    move-object/from16 v2, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    move-object/from16 v26, v3

    move/from16 v12, v32

    move/from16 v8, v34

    const/4 v3, 0x2

    if-ne v4, v3, :cond_27

    .line 104
    invoke-static {v2, v8, v9, v7}, Lcom/google/android/gms/internal/measurement/P1;->t0([BILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move-object v13, v9

    move v9, v8

    move v8, v3

    move v3, v12

    :goto_22
    move-object v12, v7

    goto :goto_23

    :cond_27
    if-nez v4, :cond_33

    move-object v3, v2

    move v5, v6

    move v4, v8

    move-object v6, v9

    move v2, v12

    .line 105
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/P1;->s0(I[BIILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v8

    move-object v9, v3

    move v3, v2

    move-object v2, v9

    move v9, v4

    move-object v13, v6

    move v6, v5

    goto :goto_22

    .line 106
    :goto_23
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/L2;->y(I)Lcom/google/android/gms/internal/measurement/t2;

    move-result-object v4

    .line 107
    sget-object v5, Lcom/google/android/gms/internal/measurement/T2;->a:Lcom/google/android/gms/internal/measurement/o2;

    if-eqz v4, :cond_31

    if-eqz v13, :cond_2d

    .line 108
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    move/from16 v7, v18

    move v14, v7

    move-object/from16 v27, v21

    :goto_24
    if-ge v7, v5, :cond_2c

    .line 109
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v28

    move/from16 v30, v8

    move-object/from16 v8, v28

    check-cast v8, Ljava/lang/Integer;

    move-object/from16 v32, v10

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-interface {v4, v10}, Lcom/google/android/gms/internal/measurement/t2;->a(I)Z

    move-result v28

    if-eqz v28, :cond_29

    if-eq v7, v14, :cond_28

    .line 110
    invoke-interface {v13, v14, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_28
    add-int/lit8 v14, v14, 0x1

    move/from16 v34, v0

    move/from16 v28, v7

    goto :goto_27

    :cond_29
    if-nez v27, :cond_2b

    .line 111
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    move-object v8, v15

    check-cast v8, Lcom/google/android/gms/internal/measurement/q2;

    move/from16 v28, v7

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    if-ne v7, v11, :cond_2a

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v7

    .line 113
    iput-object v7, v8, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_2a
    move-object/from16 v27, v7

    :goto_25
    move/from16 v34, v0

    move-object/from16 v7, v27

    goto :goto_26

    :cond_2b
    move/from16 v28, v7

    goto :goto_25

    :goto_26
    int-to-long v0, v10

    shl-int/lit8 v8, v25, 0x3

    .line 114
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v8, v0}, Lcom/google/android/gms/internal/measurement/Y2;->d(ILjava/lang/Object;)V

    move-object/from16 v27, v7

    :goto_27
    add-int/lit8 v7, v28, 0x1

    move-object/from16 v1, p0

    move/from16 v8, v30

    move-object/from16 v10, v32

    move/from16 v0, v34

    goto :goto_24

    :cond_2c
    move/from16 v34, v0

    move/from16 v30, v8

    move-object/from16 v32, v10

    if-eq v14, v5, :cond_32

    .line 115
    invoke-interface {v13, v14, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_29

    :cond_2d
    move/from16 v34, v0

    move/from16 v30, v8

    move-object/from16 v32, v10

    .line 116
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v1, v21

    :cond_2e
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_32

    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/measurement/t2;->a(I)Z

    move-result v7

    if-nez v7, :cond_2e

    if-nez v1, :cond_30

    .line 118
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    move-object v1, v15

    check-cast v1, Lcom/google/android/gms/internal/measurement/q2;

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    if-ne v7, v11, :cond_2f

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v7

    .line 120
    iput-object v7, v1, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_2f
    move-object v1, v7

    :cond_30
    int-to-long v7, v5

    shl-int/lit8 v5, v25, 0x3

    .line 121
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Lcom/google/android/gms/internal/measurement/Y2;->d(ILjava/lang/Object;)V

    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_28

    :cond_31
    move/from16 v34, v0

    move/from16 v30, v8

    move-object/from16 v32, v10

    :cond_32
    :goto_29
    move v1, v3

    move-object v3, v2

    move v2, v9

    move v9, v1

    move-object/from16 v1, p0

    move v7, v6

    move/from16 v5, v30

    :goto_2a
    move/from16 v10, v34

    move-object/from16 v34, v11

    move-object v11, v12

    goto/16 :goto_40

    :cond_33
    move-object/from16 v32, v10

    move v3, v12

    move-object/from16 v1, p0

    move v10, v0

    move v9, v3

    move-object/from16 v34, v11

    move-object v3, v2

    move-object v11, v7

    move v2, v8

    goto/16 :goto_1f

    :pswitch_10
    move-object/from16 v2, p2

    move/from16 v6, p4

    move-object/from16 v12, p6

    move-object/from16 v26, v3

    move-object v13, v9

    move/from16 v3, v32

    move/from16 v9, v34

    const/4 v8, 0x2

    move/from16 v34, v0

    move-object/from16 v32, v10

    if-ne v4, v8, :cond_3b

    .line 123
    invoke-static {v2, v9, v12}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v1, v12, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v1, :cond_3a

    .line 124
    array-length v4, v2

    sub-int/2addr v4, v0

    if-gt v1, v4, :cond_39

    if-nez v1, :cond_34

    .line 125
    sget-object v1, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/f2;

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    .line 126
    :cond_34
    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/f2;->i([BII)Lcom/google/android/gms/internal/measurement/f2;

    move-result-object v4

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2b
    add-int/2addr v0, v1

    :goto_2c
    if-ge v0, v6, :cond_38

    .line 127
    invoke-static {v2, v0, v12}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v1

    iget v4, v12, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v3, v4, :cond_38

    .line 128
    invoke-static {v2, v1, v12}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v1, v12, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v1, :cond_37

    .line 129
    array-length v4, v2

    sub-int/2addr v4, v0

    if-gt v1, v4, :cond_36

    if-nez v1, :cond_35

    .line 130
    sget-object v1, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/f2;

    .line 131
    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    .line 132
    :cond_35
    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/f2;->i([BII)Lcom/google/android/gms/internal/measurement/f2;

    move-result-object v4

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    .line 133
    :cond_36
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 134
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 135
    throw v0

    .line 136
    :cond_37
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 137
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v0

    :cond_38
    move v1, v3

    move-object v3, v2

    move v2, v9

    move v9, v1

    move-object/from16 v1, p0

    move v5, v0

    move v7, v6

    goto :goto_2a

    .line 139
    :cond_39
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 140
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 141
    throw v0

    .line 142
    :cond_3a
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 143
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 144
    throw v0

    :cond_3b
    move v1, v3

    move-object v3, v2

    move v2, v9

    move v9, v1

    move-object/from16 v1, p0

    move v7, v6

    move/from16 v10, v34

    move-object/from16 v34, v11

    move-object v11, v12

    goto/16 :goto_3f

    :pswitch_11
    move-object/from16 v2, p2

    move/from16 v6, p4

    move-object/from16 v12, p6

    move-object/from16 v26, v3

    move-object v13, v9

    move/from16 v3, v32

    move/from16 v9, v34

    move/from16 v34, v0

    move-object/from16 v32, v10

    const/4 v0, 0x2

    if-ne v4, v0, :cond_3c

    move-object/from16 v1, p0

    move/from16 v10, v34

    .line 145
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v2

    move-object/from16 v4, p2

    move v5, v9

    move-object v8, v12

    move-object v7, v13

    .line 146
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/P1;->u0(Lcom/google/android/gms/internal/measurement/S2;I[BIILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    move v7, v5

    move v5, v2

    move v2, v7

    move v9, v3

    move-object v3, v4

    move v7, v6

    move-object/from16 v34, v11

    :goto_2d
    move-object v11, v8

    goto/16 :goto_40

    :cond_3c
    move-object/from16 v1, p0

    move v13, v9

    move/from16 v10, v34

    move v9, v3

    move-object v3, v2

    move v7, v6

    move-object/from16 v34, v11

    move-object v11, v12

    :goto_2e
    move v2, v13

    goto/16 :goto_3f

    :pswitch_12
    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v26, v3

    move-object v14, v9

    move/from16 v9, v32

    move/from16 v13, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_4b

    const-wide/32 v4, 0x20000000

    and-long v4, v35, v4

    cmp-long v0, v4, v27

    if-nez v0, :cond_42

    .line 147
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v2, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v2, :cond_41

    if-nez v2, :cond_3d

    .line 148
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30

    .line 149
    :cond_3d
    new-instance v4, Ljava/lang/String;

    .line 150
    sget-object v5, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v0, v2, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 151
    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2f
    add-int/2addr v0, v2

    :goto_30
    if-ge v0, v6, :cond_40

    .line 152
    invoke-static {v3, v0, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v9, v4, :cond_40

    .line 153
    invoke-static {v3, v2, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v2, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v2, :cond_3f

    if-nez v2, :cond_3e

    .line 154
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30

    :cond_3e
    new-instance v4, Ljava/lang/String;

    .line 155
    sget-object v5, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v0, v2, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 156
    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2f

    .line 157
    :cond_3f
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 158
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 159
    throw v0

    :cond_40
    move v5, v0

    move v7, v6

    move-object/from16 v34, v11

    move v2, v13

    goto :goto_2d

    .line 160
    :cond_41
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 161
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    throw v0

    .line 163
    :cond_42
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v4, :cond_4a

    if-nez v4, :cond_43

    .line 164
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v34, v11

    goto :goto_32

    :cond_43
    add-int v5, v0, v4

    .line 165
    invoke-static {v3, v0, v5}, Lcom/google/android/gms/internal/measurement/f3;->a([BII)Z

    move-result v27

    if-eqz v27, :cond_49

    move/from16 v27, v5

    .line 166
    new-instance v5, Ljava/lang/String;

    move-object/from16 v34, v11

    .line 167
    sget-object v11, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v5, v3, v0, v4, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 168
    invoke-interface {v14, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_31
    move/from16 v0, v27

    :goto_32
    if-ge v0, v6, :cond_47

    .line 169
    invoke-static {v3, v0, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v5, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v9, v5, :cond_47

    .line 170
    invoke-static {v3, v4, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v4, :cond_46

    if-nez v4, :cond_44

    .line 171
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_44
    add-int v5, v0, v4

    .line 172
    invoke-static {v3, v0, v5}, Lcom/google/android/gms/internal/measurement/f3;->a([BII)Z

    move-result v11

    if-eqz v11, :cond_45

    .line 173
    new-instance v11, Ljava/lang/String;

    move/from16 v27, v5

    .line 174
    sget-object v5, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v11, v3, v0, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 175
    invoke-interface {v14, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_31

    .line 176
    :cond_45
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 177
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 178
    throw v0

    .line 179
    :cond_46
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 180
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 181
    throw v0

    :cond_47
    :goto_33
    move v5, v0

    :cond_48
    :goto_34
    move v7, v6

    move-object v11, v8

    move v2, v13

    goto/16 :goto_40

    .line 182
    :cond_49
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 183
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 184
    throw v0

    .line 185
    :cond_4a
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 186
    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 187
    throw v0

    :cond_4b
    move-object/from16 v34, v11

    :cond_4c
    :goto_35
    move v7, v6

    move-object v11, v8

    goto/16 :goto_2e

    :pswitch_13
    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v26, v3

    move-object v14, v9

    move/from16 v9, v32

    move/from16 v13, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_50

    if-nez v14, :cond_4f

    .line 188
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v2, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v2, v0

    if-lt v0, v2, :cond_4e

    if-ne v0, v2, :cond_4d

    goto :goto_33

    .line 189
    :cond_4d
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 190
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 191
    throw v0

    .line 192
    :cond_4e
    invoke-static {v3, v0, v8}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 193
    throw v21

    .line 194
    :cond_4f
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_50
    if-eqz v4, :cond_51

    goto :goto_35

    :cond_51
    if-nez v14, :cond_52

    .line 195
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    .line 196
    throw v21

    .line 197
    :cond_52
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :pswitch_14
    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v26, v3

    move-object v14, v9

    move/from16 v9, v32

    move/from16 v13, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_59

    .line 198
    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/r2;

    .line 199
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int v7, v2, v4

    .line 200
    array-length v11, v3

    if-gt v7, v11, :cond_58

    .line 201
    iget v11, v0, Lcom/google/android/gms/internal/measurement/r2;->s:I

    .line 202
    div-int/lit8 v4, v4, 0x4

    add-int/2addr v4, v11

    .line 203
    iget-object v11, v0, Lcom/google/android/gms/internal/measurement/r2;->r:[I

    array-length v11, v11

    if-gt v4, v11, :cond_53

    goto :goto_37

    :cond_53
    if-eqz v11, :cond_55

    :goto_36
    if-ge v11, v4, :cond_54

    mul-int/lit8 v11, v11, 0x3

    const/16 v23, 0x2

    .line 204
    div-int/lit8 v11, v11, 0x2

    const/16 v33, 0x1

    add-int/lit8 v11, v11, 0x1

    const/16 v12, 0xa

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v11

    goto :goto_36

    .line 205
    :cond_54
    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/r2;->r:[I

    .line 206
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/gms/internal/measurement/r2;->r:[I

    goto :goto_37

    :cond_55
    const/16 v12, 0xa

    .line 207
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v4, v4, [I

    iput-object v4, v0, Lcom/google/android/gms/internal/measurement/r2;->r:[I

    :goto_37
    if-ge v2, v7, :cond_56

    .line 208
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    add-int/lit8 v2, v2, 0x4

    goto :goto_37

    :cond_56
    if-ne v2, v7, :cond_57

    :goto_38
    move v5, v2

    goto/16 :goto_34

    .line 209
    :cond_57
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 210
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 211
    throw v0

    .line 212
    :cond_58
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 213
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 214
    throw v0

    :cond_59
    const/4 v2, 0x5

    if-ne v4, v2, :cond_4c

    add-int/lit8 v5, v13, 0x4

    .line 215
    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/r2;

    .line 216
    invoke-static {v13, v3}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    :goto_39
    if-ge v5, v6, :cond_48

    .line 217
    invoke-static {v3, v5, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v9, v4, :cond_48

    .line 218
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/r2;->i(I)V

    add-int/lit8 v5, v2, 0x4

    goto :goto_39

    :pswitch_15
    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v26, v3

    move-object v14, v9

    move/from16 v9, v32

    move/from16 v13, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_60

    .line 219
    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/D2;

    .line 220
    invoke-static {v3, v13, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int v7, v2, v4

    .line 221
    array-length v11, v3

    if-gt v7, v11, :cond_5f

    .line 222
    iget v11, v0, Lcom/google/android/gms/internal/measurement/D2;->s:I

    .line 223
    div-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v11

    .line 224
    iget-object v11, v0, Lcom/google/android/gms/internal/measurement/D2;->r:[J

    array-length v11, v11

    if-gt v4, v11, :cond_5a

    goto :goto_3b

    :cond_5a
    if-eqz v11, :cond_5c

    :goto_3a
    if-ge v11, v4, :cond_5b

    mul-int/lit8 v11, v11, 0x3

    const/16 v23, 0x2

    .line 225
    div-int/lit8 v11, v11, 0x2

    const/16 v33, 0x1

    add-int/lit8 v11, v11, 0x1

    const/16 v12, 0xa

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v11

    goto :goto_3a

    .line 226
    :cond_5b
    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/D2;->r:[J

    .line 227
    invoke-static {v4, v11}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/gms/internal/measurement/D2;->r:[J

    goto :goto_3b

    :cond_5c
    const/16 v12, 0xa

    .line 228
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v4, v4, [J

    iput-object v4, v0, Lcom/google/android/gms/internal/measurement/D2;->r:[J

    :goto_3b
    if-ge v2, v7, :cond_5d

    .line 229
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    add-int/lit8 v2, v2, 0x8

    goto :goto_3b

    :cond_5d
    if-ne v2, v7, :cond_5e

    goto/16 :goto_38

    .line 230
    :cond_5e
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 231
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 232
    throw v0

    .line 233
    :cond_5f
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 234
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    throw v0

    :cond_60
    const/4 v2, 0x1

    if-ne v4, v2, :cond_4c

    add-int/lit8 v5, v13, 0x8

    .line 236
    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/D2;

    .line 237
    invoke-static {v13, v3}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    :goto_3c
    if-ge v5, v6, :cond_48

    .line 238
    invoke-static {v3, v5, v8}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v8, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v9, v4, :cond_48

    .line 239
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    add-int/lit8 v5, v2, 0x8

    goto :goto_3c

    :pswitch_16
    move/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v26, v3

    move-object v14, v9

    move/from16 v9, v32

    move/from16 v13, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_61

    .line 240
    invoke-static {v3, v13, v14, v8}, Lcom/google/android/gms/internal/measurement/P1;->t0([BILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    goto/16 :goto_38

    :cond_61
    if-nez v4, :cond_4c

    move v5, v6

    move-object v7, v8

    move v2, v9

    move v4, v13

    move-object v6, v14

    .line 241
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/P1;->s0(I[BIILcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v6

    move v2, v4

    move-object v11, v7

    move v7, v5

    move v5, v6

    goto/16 :goto_40

    :pswitch_17
    move/from16 v7, p4

    move-object/from16 v26, v3

    move-object v6, v9

    move/from16 v9, v32

    move/from16 v2, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move-object/from16 v11, p6

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_65

    .line 242
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/measurement/D2;

    .line 243
    invoke-static {v3, v2, v11}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v6, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v6, v4

    :goto_3d
    if-ge v4, v6, :cond_62

    .line 244
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget-wide v12, v11, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 245
    invoke-virtual {v0, v12, v13}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    goto :goto_3d

    :cond_62
    if-ne v4, v6, :cond_64

    :cond_63
    move v5, v4

    goto/16 :goto_40

    .line 246
    :cond_64
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 247
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 248
    throw v0

    :cond_65
    if-nez v4, :cond_6e

    .line 249
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/measurement/D2;

    .line 250
    invoke-static {v3, v2, v11}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget-wide v5, v11, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 251
    invoke-virtual {v0, v5, v6}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    :goto_3e
    if-ge v4, v7, :cond_63

    .line 252
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v5

    iget v6, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ne v9, v6, :cond_63

    .line 253
    invoke-static {v3, v5, v11}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget-wide v5, v11, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 254
    invoke-virtual {v0, v5, v6}, Lcom/google/android/gms/internal/measurement/D2;->i(J)V

    goto :goto_3e

    :pswitch_18
    move/from16 v7, p4

    move-object/from16 v26, v3

    move-object v6, v9

    move/from16 v9, v32

    move/from16 v2, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move-object/from16 v11, p6

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_68

    if-nez v6, :cond_67

    .line 255
    invoke-static {v3, v2, v11}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v2, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v0, v2

    .line 256
    array-length v2, v3

    if-le v0, v2, :cond_66

    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 257
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 258
    throw v0

    .line 259
    :cond_66
    throw v21

    .line 260
    :cond_67
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_68
    const/4 v0, 0x5

    if-eq v4, v0, :cond_69

    goto :goto_3f

    :cond_69
    if-nez v6, :cond_6a

    .line 261
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    throw v21

    .line 263
    :cond_6a
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :pswitch_19
    move/from16 v7, p4

    move-object/from16 v26, v3

    move-object v6, v9

    move/from16 v9, v32

    move/from16 v2, v34

    move-object/from16 v3, p2

    move-object/from16 v32, v10

    move-object/from16 v34, v11

    move-object/from16 v11, p6

    move v10, v0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_6d

    if-nez v6, :cond_6c

    .line 264
    invoke-static {v3, v2, v11}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v0

    iget v2, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    add-int/2addr v0, v2

    .line 265
    array-length v2, v3

    if-le v0, v2, :cond_6b

    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 266
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    throw v0

    .line 268
    :cond_6b
    throw v21

    .line 269
    :cond_6c
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_6d
    const/4 v0, 0x1

    if-eq v4, v0, :cond_70

    :cond_6e
    :goto_3f
    move v5, v2

    :goto_40
    if-eq v5, v2, :cond_6f

    move-object v4, v3

    move v6, v7

    move-object v7, v11

    move-object v3, v15

    move/from16 v8, v25

    move-object/from16 v2, v26

    move/from16 v14, v29

    const v16, 0xfffff

    move v15, v9

    move v9, v10

    goto/16 :goto_10

    :cond_6f
    move/from16 v1, p3

    move-object v7, v3

    move v4, v5

    move-object v3, v11

    move/from16 v12, v25

    move-object/from16 v0, v26

    :goto_41
    move/from16 v14, v29

    move-object/from16 v8, v34

    goto/16 :goto_5

    :cond_70
    if-nez v6, :cond_71

    .line 270
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 271
    throw v21

    .line 272
    :cond_71
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_72
    move/from16 v10, v32

    move-object/from16 v32, v9

    move v9, v10

    move v10, v0

    move-object v0, v3

    move/from16 v31, v8

    move/from16 v8, v34

    move-object/from16 v3, p2

    move-object/from16 v34, v11

    move-object/from16 v11, p6

    const/16 v7, 0x32

    if-ne v6, v7, :cond_7e

    const/4 v7, 0x2

    if-ne v4, v7, :cond_7d

    .line 273
    div-int/lit8 v2, v10, 0x3

    add-int/2addr v2, v2

    aget-object v2, v17, v2

    .line 274
    invoke-virtual {v0, v15, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    .line 275
    move-object v6, v4

    check-cast v6, Lcom/google/android/gms/internal/measurement/H2;

    .line 276
    iget-boolean v6, v6, Lcom/google/android/gms/internal/measurement/H2;->q:Z

    if-nez v6, :cond_73

    .line 277
    sget-object v6, Lcom/google/android/gms/internal/measurement/H2;->r:Lcom/google/android/gms/internal/measurement/H2;

    .line 278
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/H2;->a()Lcom/google/android/gms/internal/measurement/H2;

    move-result-object v6

    .line 279
    invoke-static {v6, v4}, Lcom/google/android/gms/internal/measurement/o2;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/H2;

    .line 280
    invoke-virtual {v0, v15, v13, v14, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v6

    .line 281
    :cond_73
    check-cast v2, Lcom/google/android/gms/internal/measurement/G2;

    .line 282
    iget-object v13, v2, Lcom/google/android/gms/internal/measurement/G2;->a:Lcom/google/android/gms/internal/measurement/t;

    .line 283
    move-object v14, v4

    check-cast v14, Lcom/google/android/gms/internal/measurement/H2;

    .line 284
    invoke-static {v3, v8, v11}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    iget v4, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-ltz v4, :cond_7c

    sub-int v6, p4, v2

    if-gt v4, v6, :cond_7c

    add-int/2addr v4, v2

    move-object v5, v12

    move-object v6, v5

    :goto_42
    if-ge v2, v4, :cond_79

    add-int/lit8 v7, v2, 0x1

    .line 285
    aget-byte v2, v3, v2

    if-gez v2, :cond_74

    .line 286
    invoke-static {v2, v3, v7, v11}, Lcom/google/android/gms/internal/measurement/P1;->j0(I[BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v7

    iget v2, v11, Lcom/google/android/gms/internal/measurement/b2;->a:I

    :cond_74
    ushr-int/lit8 v3, v2, 0x3

    move/from16 v26, v4

    and-int/lit8 v4, v2, 0x7

    move-object/from16 v27, v5

    const/4 v5, 0x1

    if-eq v3, v5, :cond_77

    const/4 v5, 0x2

    if-eq v3, v5, :cond_75

    move-object/from16 v5, p2

    move-object v3, v6

    move v6, v7

    move-object v4, v11

    move-object/from16 v35, v12

    move/from16 v12, v26

    move-object/from16 v11, v27

    :goto_43
    move/from16 v7, p4

    goto/16 :goto_45

    .line 287
    :cond_75
    iget-object v3, v13, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Lcom/google/android/gms/internal/measurement/g3;

    .line 288
    iget v3, v5, Lcom/google/android/gms/internal/measurement/g3;->r:I

    if-ne v4, v3, :cond_76

    .line 289
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v3, v7

    move-object v7, v11

    move-object/from16 v35, v12

    move/from16 v12, v26

    move-object/from16 v11, v27

    .line 290
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/L2;->r([BIILcom/google/android/gms/internal/measurement/g3;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget-object v6, v7, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    move v2, v3

    move-object v5, v11

    move v4, v12

    move-object/from16 v12, v35

    move-object/from16 v3, p2

    move-object v11, v7

    goto :goto_42

    :cond_76
    move v3, v7

    move-object v7, v11

    move-object/from16 v35, v12

    move/from16 v12, v26

    move-object/from16 v11, v27

    move-object v4, v6

    move v6, v3

    move-object v3, v4

    move-object/from16 v5, p2

    move-object v4, v7

    goto :goto_43

    :cond_77
    move v3, v7

    move-object v7, v11

    move-object/from16 v35, v12

    move/from16 v12, v26

    move-object/from16 v11, v27

    iget-object v5, v13, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/g3;

    move/from16 v26, v3

    .line 291
    iget v3, v5, Lcom/google/android/gms/internal/measurement/g3;->r:I

    if-ne v4, v3, :cond_78

    move-object v3, v6

    const/4 v6, 0x0

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object v11, v3

    move/from16 v3, v26

    .line 292
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/L2;->r([BIILcom/google/android/gms/internal/measurement/g3;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move-object v5, v7

    move v7, v4

    move-object v4, v5

    move-object v5, v2

    iget-object v2, v4, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    move-object v6, v5

    move-object v5, v2

    move v2, v3

    move-object v3, v6

    move-object v6, v11

    :goto_44
    move-object v11, v4

    move v4, v12

    move-object/from16 v12, v35

    goto/16 :goto_42

    :cond_78
    move-object/from16 v5, p2

    move-object v3, v6

    move-object v4, v7

    move/from16 v6, v26

    goto :goto_43

    .line 293
    :goto_45
    invoke-static {v2, v5, v6, v7, v4}, Lcom/google/android/gms/internal/measurement/P1;->w0(I[BIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v2

    move-object v6, v3

    move-object v3, v5

    move-object v5, v11

    goto :goto_44

    :cond_79
    move/from16 v7, p4

    move v12, v4

    move-object v4, v11

    move-object v11, v5

    move-object v5, v3

    move-object v3, v6

    if-ne v2, v12, :cond_7b

    .line 294
    invoke-virtual {v14, v11, v3}, Lcom/google/android/gms/internal/measurement/H2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v12, v8, :cond_7a

    move-object v2, v0

    move v6, v7

    move-object v3, v15

    move/from16 v8, v25

    move/from16 v14, v29

    const v16, 0xfffff

    move-object v7, v4

    move-object v4, v5

    move v15, v9

    move v9, v10

    move v5, v12

    goto/16 :goto_10

    :cond_7a
    move/from16 v1, p3

    move/from16 v11, p5

    move-object v3, v4

    move-object v7, v5

    move v4, v12

    move/from16 v12, v25

    move/from16 v14, v29

    move-object/from16 v8, v34

    goto/16 :goto_53

    .line 295
    :cond_7b
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    move-object/from16 v11, v32

    .line 296
    invoke-direct {v0, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 297
    throw v0

    .line 298
    :cond_7c
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 299
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 300
    throw v0

    :cond_7d
    move-object v5, v3

    move-object v4, v11

    move-object/from16 v11, v32

    goto/16 :goto_17

    :goto_46
    move/from16 v1, p3

    move-object v3, v4

    move-object v7, v5

    move v4, v8

    move-object/from16 v32, v11

    move/from16 v12, v25

    goto/16 :goto_41

    :cond_7e
    move/from16 v7, p4

    move-object v5, v3

    move-object/from16 v35, v12

    move-object/from16 v11, v32

    add-int/lit8 v3, v10, 0x2

    .line 301
    aget v3, v19, v3

    const v16, 0xfffff

    and-int v3, v3, v16

    move v12, v6

    int-to-long v5, v3

    packed-switch v12, :pswitch_data_2

    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    goto/16 :goto_51

    :pswitch_1a
    const/4 v6, 0x3

    if-ne v4, v6, :cond_7f

    and-int/lit8 v2, v9, -0x8

    or-int/lit8 v2, v2, 0x4

    move v7, v2

    move/from16 v12, v25

    .line 302
    invoke-virtual {v1, v12, v10, v15}, Lcom/google/android/gms/internal/measurement/L2;->B(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 303
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v3

    move-object/from16 v4, p2

    move/from16 v6, p4

    move v5, v8

    move-object/from16 v8, p6

    .line 304
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/P1;->r0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move-object v7, v4

    move-object v4, v2

    move-object v2, v7

    move-object v7, v8

    move v8, v5

    .line 305
    invoke-virtual {v1, v12, v10, v15, v4}, Lcom/google/android/gms/internal/measurement/L2;->C(IILjava/lang/Object;Ljava/lang/Object;)V

    :goto_47
    move v5, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v5

    move v5, v3

    :goto_48
    move-object v3, v7

    move-object/from16 v32, v11

    :goto_49
    move-object v7, v2

    goto/16 :goto_52

    :cond_7f
    move/from16 v12, v25

    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    goto/16 :goto_51

    :pswitch_1b
    move-object/from16 v2, p2

    move-object/from16 v7, p6

    move/from16 v12, v25

    if-nez v4, :cond_80

    .line 306
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move/from16 v25, v3

    iget-wide v3, v7, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 307
    invoke-static {v3, v4}, Ll6/d;->H(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v15, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 308
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_4a
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object v3, v7

    move-object/from16 v32, v11

    move/from16 v5, v25

    goto :goto_49

    :cond_80
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object v3, v7

    move-object/from16 v32, v11

    move-object v7, v2

    goto/16 :goto_51

    :pswitch_1c
    move-object/from16 v2, p2

    move-object/from16 v7, p6

    move/from16 v12, v25

    if-nez v4, :cond_80

    .line 309
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 310
    invoke-static {v4}, Ll6/d;->G(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v15, v13, v14, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 311
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_47

    :pswitch_1d
    move-object/from16 v2, p2

    move-object/from16 v7, p6

    move/from16 v12, v25

    if-nez v4, :cond_80

    .line 312
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    iget v4, v7, Lcom/google/android/gms/internal/measurement/b2;->a:I

    move/from16 v25, v3

    .line 313
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/L2;->y(I)Lcom/google/android/gms/internal/measurement/t2;

    move-result-object v3

    if-eqz v3, :cond_83

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/measurement/t2;->a(I)Z

    move-result v3

    if-eqz v3, :cond_81

    goto :goto_4b

    .line 314
    :cond_81
    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/q2;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    move-object/from16 v6, v34

    if-ne v5, v6, :cond_82

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v5

    .line 315
    iput-object v5, v3, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_82
    int-to-long v3, v4

    .line 316
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v5, v9, v3}, Lcom/google/android/gms/internal/measurement/Y2;->d(ILjava/lang/Object;)V

    move-object/from16 v34, v6

    goto :goto_4a

    .line 317
    :cond_83
    :goto_4b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v15, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 318
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4a

    :pswitch_1e
    move-object/from16 v2, p2

    move-object/from16 v7, p6

    move/from16 v12, v25

    const/4 v3, 0x2

    if-ne v4, v3, :cond_80

    .line 319
    invoke-static {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/P1;->p0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget-object v3, v7, Lcom/google/android/gms/internal/measurement/b2;->c:Ljava/lang/Object;

    .line 320
    invoke-virtual {v0, v15, v13, v14, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 321
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move v5, v4

    goto/16 :goto_48

    :pswitch_1f
    move-object/from16 v2, p2

    move-object/from16 v7, p6

    move/from16 v12, v25

    const/4 v3, 0x2

    if-ne v4, v3, :cond_84

    .line 322
    invoke-virtual {v1, v12, v10, v15}, Lcom/google/android/gms/internal/measurement/L2;->B(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v23, v3

    .line 323
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    move-result-object v3

    move-object/from16 v4, p2

    move/from16 v6, p4

    move v5, v8

    move-object/from16 v8, v34

    .line 324
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/P1;->q0(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/S2;[BIILcom/google/android/gms/internal/measurement/b2;)I

    move-result v3

    move-object v7, v4

    .line 325
    invoke-virtual {v1, v12, v10, v15, v2}, Lcom/google/android/gms/internal/measurement/L2;->C(IILjava/lang/Object;Ljava/lang/Object;)V

    move/from16 v34, v10

    move-object/from16 v32, v11

    move v10, v5

    move v5, v3

    move-object/from16 v3, p6

    goto/16 :goto_52

    :cond_84
    move-object v7, v2

    move v5, v8

    move-object/from16 v8, v34

    move-object/from16 v3, p6

    move/from16 v34, v10

    move-object/from16 v32, v11

    move v10, v5

    goto/16 :goto_51

    :pswitch_20
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    const/4 v11, 0x2

    if-ne v4, v11, :cond_89

    .line 326
    invoke-static {v7, v10, v3}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    iget v11, v3, Lcom/google/android/gms/internal/measurement/b2;->a:I

    if-nez v11, :cond_85

    move-object/from16 v1, v35

    .line 327
    invoke-virtual {v0, v15, v13, v14, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4d

    :cond_85
    and-int v1, v31, v26

    move/from16 v25, v1

    add-int v1, v4, v11

    if-eqz v25, :cond_87

    .line 328
    invoke-static {v7, v4, v1}, Lcom/google/android/gms/internal/measurement/f3;->a([BII)Z

    move-result v25

    if-eqz v25, :cond_86

    goto :goto_4c

    .line 329
    :cond_86
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 331
    throw v0

    .line 332
    :cond_87
    :goto_4c
    new-instance v2, Ljava/lang/String;

    move/from16 v25, v1

    .line 333
    sget-object v1, Lcom/google/android/gms/internal/measurement/x2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v7, v4, v11, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 334
    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v4, v25

    .line 335
    :goto_4d
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_4e
    move v5, v4

    goto/16 :goto_52

    :pswitch_21
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    if-nez v4, :cond_89

    .line 336
    invoke-static {v7, v10, v3}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v1

    move v4, v1

    iget-wide v1, v3, Lcom/google/android/gms/internal/measurement/b2;->b:J

    cmp-long v1, v1, v27

    if-eqz v1, :cond_88

    const/16 v33, 0x1

    goto :goto_4f

    :cond_88
    move/from16 v33, v18

    .line 337
    :goto_4f
    invoke-static/range {v33 .. v33}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v15, v13, v14, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 338
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4e

    :pswitch_22
    move v2, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v2

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    const/4 v2, 0x5

    if-ne v4, v2, :cond_89

    add-int/lit8 v1, v10, 0x4

    .line 339
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 340
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_50
    move v5, v1

    goto/16 :goto_52

    :pswitch_23
    move v2, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v2

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    const/4 v2, 0x1

    if-ne v4, v2, :cond_89

    add-int/lit8 v1, v10, 0x8

    .line 341
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 342
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_50

    :pswitch_24
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    if-nez v4, :cond_89

    .line 343
    invoke-static {v7, v10, v3}, Lcom/google/android/gms/internal/measurement/P1;->h0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v1

    iget v2, v3, Lcom/google/android/gms/internal/measurement/b2;->a:I

    .line 344
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 345
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_50

    :pswitch_25
    move v3, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v3

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    if-nez v4, :cond_89

    .line 346
    invoke-static {v7, v10, v3}, Lcom/google/android/gms/internal/measurement/P1;->l0([BILcom/google/android/gms/internal/measurement/b2;)I

    move-result v1

    move v4, v1

    iget-wide v1, v3, Lcom/google/android/gms/internal/measurement/b2;->b:J

    .line 347
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v15, v13, v14, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 348
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4e

    :pswitch_26
    move v2, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v2

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    const/4 v2, 0x5

    if-ne v4, v2, :cond_89

    add-int/lit8 v1, v10, 0x4

    .line 349
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/measurement/P1;->m0(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 350
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 351
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_50

    :pswitch_27
    move v2, v10

    move v10, v8

    move-object/from16 v8, v34

    move/from16 v34, v2

    move-object/from16 v7, p2

    move-object/from16 v3, p6

    move-object/from16 v32, v11

    move/from16 v12, v25

    const/4 v2, 0x1

    if-ne v4, v2, :cond_89

    add-int/lit8 v1, v10, 0x8

    .line 352
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/measurement/P1;->n0(I[B)J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v25

    .line 353
    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v15, v13, v14, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 354
    invoke-virtual {v0, v15, v5, v6, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_50

    :cond_89
    :goto_51
    move v5, v10

    :goto_52
    if-eq v5, v10, :cond_8a

    move-object/from16 v1, p0

    move/from16 v10, p3

    move/from16 v6, p4

    move-object v2, v0

    move-object v4, v7

    move v8, v12

    move/from16 v14, v29

    const v16, 0xfffff

    move-object v7, v3

    move-object v3, v15

    move v15, v9

    move/from16 v9, v34

    goto/16 :goto_1

    :cond_8a
    move/from16 v1, p3

    move/from16 v11, p5

    move v4, v5

    move/from16 v14, v29

    move/from16 v10, v34

    :goto_53
    if-ne v9, v11, :cond_8b

    if-eqz v11, :cond_8b

    move/from16 v6, p4

    move v10, v1

    move v5, v4

    move-object v3, v15

    move v15, v9

    :goto_54
    const v1, 0xfffff

    goto :goto_55

    .line 355
    :cond_8b
    move-object v2, v15

    check-cast v2, Lcom/google/android/gms/internal/measurement/q2;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    if-ne v5, v8, :cond_8c

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v5

    .line 356
    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_8c
    move-object v2, v7

    move-object v7, v3

    move-object v3, v2

    move-object v6, v5

    move v2, v9

    move/from16 v5, p4

    .line 357
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/P1;->v0(I[BIILcom/google/android/gms/internal/measurement/Y2;Lcom/google/android/gms/internal/measurement/b2;)I

    move-result v4

    move-object/from16 v7, p6

    move v6, v5

    move v9, v10

    move v8, v12

    move-object v3, v15

    const v16, 0xfffff

    move v10, v1

    move v15, v2

    move v5, v4

    move-object/from16 v1, p0

    move-object/from16 v4, p2

    move-object v2, v0

    goto/16 :goto_1

    :cond_8d
    move-object v0, v2

    move-object/from16 v32, v9

    move/from16 p3, v10

    move-object v8, v11

    move-object/from16 v17, v13

    move/from16 v29, v14

    move/from16 v11, p5

    goto :goto_54

    :goto_55
    if-eq v10, v1, :cond_8e

    int-to-long v1, v10

    .line 358
    invoke-virtual {v0, v3, v1, v2, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_8e
    move-object/from16 v1, p0

    iget v0, v1, Lcom/google/android/gms/internal/measurement/L2;->g:I

    move-object/from16 v2, v21

    :goto_56
    iget v4, v1, Lcom/google/android/gms/internal/measurement/L2;->h:I

    if-ge v0, v4, :cond_94

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/L2;->f:[I

    .line 359
    aget v4, v4, v0

    .line 360
    aget v7, v19, v4

    .line 361
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    move-result v9

    const v16, 0xfffff

    and-int v9, v9, v16

    int-to-long v9, v9

    .line 362
    invoke-static {v9, v10, v3}, Lcom/google/android/gms/internal/measurement/d3;->j(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_93

    .line 363
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/L2;->y(I)Lcom/google/android/gms/internal/measurement/t2;

    move-result-object v10

    if-eqz v10, :cond_93

    .line 364
    check-cast v9, Lcom/google/android/gms/internal/measurement/H2;

    .line 365
    div-int/lit8 v4, v4, 0x3

    add-int/2addr v4, v4

    aget-object v4, v17, v4

    .line 366
    check-cast v4, Lcom/google/android/gms/internal/measurement/G2;

    .line 367
    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/G2;->a:Lcom/google/android/gms/internal/measurement/t;

    .line 368
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/H2;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_57
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_93

    .line 369
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 370
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-interface {v10, v13}, Lcom/google/android/gms/internal/measurement/t2;->a(I)Z

    move-result v13

    if-nez v13, :cond_92

    if-nez v2, :cond_90

    .line 371
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    move-object v2, v3

    check-cast v2, Lcom/google/android/gms/internal/measurement/q2;

    iget-object v13, v2, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    if-ne v13, v8, :cond_8f

    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y2;->a()Lcom/google/android/gms/internal/measurement/Y2;

    move-result-object v13

    .line 373
    iput-object v13, v2, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_8f
    move-object v2, v13

    .line 374
    :cond_90
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4, v13, v14}, Lcom/google/android/gms/internal/measurement/G2;->b(Lcom/google/android/gms/internal/measurement/t;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v13

    .line 375
    sget-object v14, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/f2;

    .line 376
    new-array v14, v13, [B

    move/from16 v18, v0

    .line 377
    new-instance v0, Lcom/google/android/gms/internal/measurement/g2;

    invoke-direct {v0, v13, v14}, Lcom/google/android/gms/internal/measurement/g2;-><init>(I[B)V

    .line 378
    :try_start_0
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v0, v4, v1, v12}, Lcom/google/android/gms/internal/measurement/G2;->a(Lcom/google/android/gms/internal/measurement/g2;Lcom/google/android/gms/internal/measurement/t;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    iget v0, v0, Lcom/google/android/gms/internal/measurement/g2;->h:I

    sub-int/2addr v13, v0

    if-nez v13, :cond_91

    .line 380
    new-instance v0, Lcom/google/android/gms/internal/measurement/f2;

    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/measurement/f2;-><init>([B)V

    const/16 v22, 0x3

    shl-int/lit8 v1, v7, 0x3

    const/16 v23, 0x2

    or-int/lit8 v1, v1, 0x2

    .line 381
    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/measurement/Y2;->d(ILjava/lang/Object;)V

    .line 382
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    move-object/from16 v1, p0

    move/from16 v0, v18

    goto :goto_57

    .line 383
    :cond_91
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    .line 384
    new-instance v1, Ljava/lang/RuntimeException;

    .line 385
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_92
    const/16 v22, 0x3

    const/16 v23, 0x2

    move-object/from16 v1, p0

    goto/16 :goto_57

    :cond_93
    move/from16 v18, v0

    const/16 v22, 0x3

    const/16 v23, 0x2

    add-int/lit8 v0, v18, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_56

    :cond_94
    if-eqz v2, :cond_95

    .line 386
    move-object v0, v3

    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/q2;->zzc:Lcom/google/android/gms/internal/measurement/Y2;

    :cond_95
    if-nez v11, :cond_97

    if-ne v5, v6, :cond_96

    goto :goto_58

    :cond_96
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    move-object/from16 v10, v32

    .line 387
    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 388
    throw v0

    :cond_97
    move-object/from16 v10, v32

    if-gt v5, v6, :cond_98

    if-ne v15, v11, :cond_98

    :goto_58
    return v5

    :cond_98
    new-instance v0, Lcom/google/android/gms/internal/measurement/z2;

    .line 389
    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 390
    throw v0

    .line 391
    :cond_99
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 392
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Mutating immutable message: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

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

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method

.method public final v(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    sget-object v1, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 17
    .line 18
    int-to-long v2, v0

    .line 19
    invoke-virtual {v1, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p3, v4, v0}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p2, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->o(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p3, v4, p1}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p2, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v4

    .line 80
    :cond_3
    invoke-interface {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 87
    .line 88
    aget p1, v0, p1

    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    add-int/lit8 v0, v0, 0x26

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    add-int/2addr v0, v1

    .line 111
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 112
    .line 113
    .line 114
    const-string v0, "Source subfield "

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string p1, " is present but null: "

    .line 123
    .line 124
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p2
.end method

.method public final w(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->a:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p0, v1, p1, p3}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    sget-object v4, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 21
    .line 22
    int-to-long v5, v2

    .line 23
    invoke-virtual {v4, p3, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, v1, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->p(IILjava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-nez v7, :cond_2

    .line 38
    .line 39
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, p2, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {p3, v7, v2}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p2, v5, v6, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    add-int/lit8 p1, p1, 0x2

    .line 60
    .line 61
    aget p1, v0, p1

    .line 62
    .line 63
    and-int/2addr p1, v3

    .line 64
    int-to-long v2, p1

    .line 65
    invoke-static {v1, v2, v3, p2}, Lcom/google/android/gms/internal/measurement/d3;->g(IJLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {v4, p2, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    invoke-interface {p3}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p3, v0, p1}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, p2, v5, v6, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object p1, v0

    .line 90
    :cond_3
    invoke-interface {p3, p1, v2}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    aget p1, v0, p1

    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    add-int/lit8 v0, v0, 0x26

    .line 111
    .line 112
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    add-int/2addr v0, v1

    .line 119
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 120
    .line 121
    .line 122
    const-string v0, "Source subfield "

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p1, " is present but null: "

    .line 131
    .line 132
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p2
.end method

.method public final x(I)Lcom/google/android/gms/internal/measurement/S2;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    aget-object v1, v0, p1

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/gms/internal/measurement/S2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    sget-object v2, Lcom/google/android/gms/internal/measurement/P2;->c:Lcom/google/android/gms/internal/measurement/P2;

    .line 16
    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/P2;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/S2;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    aput-object v1, v0, p1

    .line 26
    .line 27
    return-object v1
.end method

.method public final y(I)Lcom/google/android/gms/internal/measurement/t2;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    check-cast p1, Lcom/google/android/gms/internal/measurement/t2;

    .line 11
    .line 12
    return-object p1
.end method

.method public final z(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->x(I)Lcom/google/android/gms/internal/measurement/S2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/L2;->D(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/L2;->n(ILjava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    int-to-long v1, v1

    .line 25
    sget-object p1, Lcom/google/android/gms/internal/measurement/L2;->k:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/L2;->i(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S2;->zza()Lcom/google/android/gms/internal/measurement/q2;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/S2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method public final zza()Lcom/google/android/gms/internal/measurement/q2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/L2;->e:Lcom/google/android/gms/internal/measurement/Y1;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/q2;->o(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/google/android/gms/internal/measurement/q2;

    .line 11
    .line 12
    return-object v0
.end method
