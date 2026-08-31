.class public final Lt/A;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:J

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JJLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lt/A;->q:I

    iput-object p1, p0, Lt/A;->t:Ljava/lang/Object;

    iput-wide p2, p0, Lt/A;->r:J

    iput-wide p4, p0, Lt/A;->s:J

    iput-object p6, p0, Lt/A;->u:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt/A;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LB0/N;

    .line 11
    .line 12
    invoke-virtual {v1}, LB0/N;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Lt/A;->t:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v2

    .line 18
    check-cast v4, Lj0/B;

    .line 19
    .line 20
    iget-object v2, v0, Lt/A;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ll0/c;

    .line 23
    .line 24
    const/16 v3, 0x68

    .line 25
    .line 26
    and-int/lit8 v5, v3, 0x2

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    const-wide/16 v5, 0x0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v5, v0, Lt/A;->r:J

    .line 34
    .line 35
    :goto_0
    and-int/lit8 v7, v3, 0x4

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    iget-object v7, v1, LB0/N;->q:Ll0/b;

    .line 40
    .line 41
    invoke-interface {v7}, Ll0/d;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    invoke-static {v7, v8, v5, v6}, Ll0/d;->k0(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-wide v7, v0, Lt/A;->s:J

    .line 51
    .line 52
    :goto_1
    and-int/lit8 v9, v3, 0x8

    .line 53
    .line 54
    if-eqz v9, :cond_2

    .line 55
    .line 56
    const/high16 v9, 0x3f800000    # 1.0f

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 v9, 0x0

    .line 60
    :goto_2
    and-int/lit8 v3, v3, 0x10

    .line 61
    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    sget-object v2, Ll0/f;->b:Ll0/f;

    .line 65
    .line 66
    :cond_3
    iget-object v3, v1, LB0/N;->q:Ll0/b;

    .line 67
    .line 68
    iget-object v1, v3, Ll0/b;->q:Ll0/a;

    .line 69
    .line 70
    iget-object v10, v1, Ll0/a;->c:Lj0/m;

    .line 71
    .line 72
    const/16 v1, 0x20

    .line 73
    .line 74
    shr-long v11, v5, v1

    .line 75
    .line 76
    long-to-int v11, v11

    .line 77
    move v12, v11

    .line 78
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    const-wide v13, 0xffffffffL

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    and-long/2addr v5, v13

    .line 88
    long-to-int v5, v5

    .line 89
    move v6, v12

    .line 90
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    move-wide v15, v13

    .line 99
    shr-long v13, v7, v1

    .line 100
    .line 101
    long-to-int v1, v13

    .line 102
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    add-float v13, v1, v6

    .line 107
    .line 108
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    and-long v5, v7, v15

    .line 113
    .line 114
    long-to-int v5, v5

    .line 115
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    add-float v14, v5, v1

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    move v6, v9

    .line 123
    const/4 v9, 0x1

    .line 124
    const/4 v8, 0x3

    .line 125
    move-object v5, v2

    .line 126
    invoke-virtual/range {v3 .. v9}, Ll0/b;->c(Lj0/B;Ll0/c;FLj0/j;II)LW1/d;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    invoke-interface/range {v10 .. v15}, Lj0/m;->j(FFFFLW1/d;)V

    .line 131
    .line 132
    .line 133
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 134
    .line 135
    return-object v1

    .line 136
    :pswitch_0
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Lz0/I;

    .line 139
    .line 140
    iget-object v2, v0, Lt/A;->t:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Lz0/J;

    .line 143
    .line 144
    iget-wide v3, v0, Lt/A;->r:J

    .line 145
    .line 146
    const/16 v5, 0x20

    .line 147
    .line 148
    shr-long v6, v3, v5

    .line 149
    .line 150
    long-to-int v6, v6

    .line 151
    iget-wide v7, v0, Lt/A;->s:J

    .line 152
    .line 153
    shr-long v9, v7, v5

    .line 154
    .line 155
    long-to-int v9, v9

    .line 156
    add-int/2addr v6, v9

    .line 157
    const-wide v9, 0xffffffffL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    and-long/2addr v3, v9

    .line 163
    long-to-int v3, v3

    .line 164
    and-long/2addr v7, v9

    .line 165
    long-to-int v4, v7

    .line 166
    add-int/2addr v3, v4

    .line 167
    iget-object v4, v0, Lt/A;->u:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v4, LA/J;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    int-to-long v6, v6

    .line 175
    shl-long v5, v6, v5

    .line 176
    .line 177
    int-to-long v7, v3

    .line 178
    and-long/2addr v7, v9

    .line 179
    or-long/2addr v5, v7

    .line 180
    invoke-static {v1, v2}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 181
    .line 182
    .line 183
    iget-wide v7, v2, Lz0/J;->u:J

    .line 184
    .line 185
    invoke-static {v5, v6, v7, v8}, LW0/i;->c(JJ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v5

    .line 189
    const/4 v1, 0x0

    .line 190
    invoke-virtual {v2, v5, v6, v1, v4}, Lz0/J;->U(JFLB5/c;)V

    .line 191
    .line 192
    .line 193
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 194
    .line 195
    return-object v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
