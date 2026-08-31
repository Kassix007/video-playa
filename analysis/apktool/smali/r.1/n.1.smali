.class public final Lr/n;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:Lr/h;

.field public r:[Ljava/lang/Object;

.field public s:[J

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:J

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr/h;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/n;->A:Lr/h;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/h;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, Lr/n;

    .line 2
    .line 3
    iget-object v1, p0, Lr/n;->A:Lr/h;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lr/n;-><init>(Lr/h;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lr/n;->z:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI5/j;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lr/n;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lr/n;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lr/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr/n;->y:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    iget v1, v0, Lr/n;->w:I

    .line 14
    .line 15
    iget v5, v0, Lr/n;->v:I

    .line 16
    .line 17
    iget-wide v6, v0, Lr/n;->x:J

    .line 18
    .line 19
    iget v8, v0, Lr/n;->u:I

    .line 20
    .line 21
    iget v9, v0, Lr/n;->t:I

    .line 22
    .line 23
    iget-object v10, v0, Lr/n;->s:[J

    .line 24
    .line 25
    iget-object v11, v0, Lr/n;->r:[Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v12, v0, Lr/n;->z:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v12, LI5/j;

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lr/n;->z:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, LI5/j;

    .line 49
    .line 50
    iget-object v5, v0, Lr/n;->A:Lr/h;

    .line 51
    .line 52
    iget-object v5, v5, Lr/h;->r:Lr/G;

    .line 53
    .line 54
    iget-object v6, v5, Lr/G;->b:[Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v5, v5, Lr/G;->a:[J

    .line 57
    .line 58
    array-length v7, v5

    .line 59
    add-int/lit8 v7, v7, -0x2

    .line 60
    .line 61
    if-ltz v7, :cond_5

    .line 62
    .line 63
    move v8, v2

    .line 64
    :goto_0
    aget-wide v9, v5, v8

    .line 65
    .line 66
    not-long v11, v9

    .line 67
    const/4 v13, 0x7

    .line 68
    shl-long/2addr v11, v13

    .line 69
    and-long/2addr v11, v9

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v11, v13

    .line 76
    cmp-long v11, v11, v13

    .line 77
    .line 78
    if-eqz v11, :cond_4

    .line 79
    .line 80
    sub-int v11, v8, v7

    .line 81
    .line 82
    not-int v11, v11

    .line 83
    ushr-int/lit8 v11, v11, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v11, v11, 0x8

    .line 86
    .line 87
    move-object v12, v1

    .line 88
    move v1, v2

    .line 89
    move-wide/from16 v17, v9

    .line 90
    .line 91
    move-object v10, v5

    .line 92
    move v9, v7

    .line 93
    move v5, v11

    .line 94
    move-object v11, v6

    .line 95
    move-wide/from16 v6, v17

    .line 96
    .line 97
    :goto_1
    if-ge v1, v5, :cond_3

    .line 98
    .line 99
    const-wide/16 v13, 0xff

    .line 100
    .line 101
    and-long/2addr v13, v6

    .line 102
    const-wide/16 v15, 0x80

    .line 103
    .line 104
    cmp-long v13, v13, v15

    .line 105
    .line 106
    if-gez v13, :cond_2

    .line 107
    .line 108
    shl-int/lit8 v2, v8, 0x3

    .line 109
    .line 110
    add-int/2addr v2, v1

    .line 111
    aget-object v2, v11, v2

    .line 112
    .line 113
    iput-object v12, v0, Lr/n;->z:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v11, v0, Lr/n;->r:[Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v10, v0, Lr/n;->s:[J

    .line 118
    .line 119
    iput v9, v0, Lr/n;->t:I

    .line 120
    .line 121
    iput v8, v0, Lr/n;->u:I

    .line 122
    .line 123
    iput-wide v6, v0, Lr/n;->x:J

    .line 124
    .line 125
    iput v5, v0, Lr/n;->v:I

    .line 126
    .line 127
    iput v1, v0, Lr/n;->w:I

    .line 128
    .line 129
    iput v4, v0, Lr/n;->y:I

    .line 130
    .line 131
    invoke-virtual {v12, v2, v0}, LI5/j;->b(Ljava/lang/Object;Ls5/h;)V

    .line 132
    .line 133
    .line 134
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_2
    :goto_2
    shr-long/2addr v6, v3

    .line 138
    add-int/2addr v1, v4

    .line 139
    goto :goto_1

    .line 140
    :cond_3
    if-ne v5, v3, :cond_5

    .line 141
    .line 142
    move v7, v9

    .line 143
    move-object v5, v10

    .line 144
    move-object v6, v11

    .line 145
    move-object v1, v12

    .line 146
    :cond_4
    if-eq v8, v7, :cond_5

    .line 147
    .line 148
    add-int/lit8 v8, v8, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_5
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 152
    .line 153
    return-object v1
.end method
