.class public final Lv2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld6/w;

.field public final b:LD2/n;

.field public final c:LU5/e;

.field public final d:Lv2/h;


# direct methods
.method public constructor <init>(Ld6/w;LD2/n;LU5/e;Lv2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv2/d;->a:Ld6/w;

    .line 5
    .line 6
    iput-object p2, p0, Lv2/d;->b:LD2/n;

    .line 7
    .line 8
    iput-object p3, p0, Lv2/d;->c:LU5/e;

    .line 9
    .line 10
    iput-object p4, p0, Lv2/d;->d:Lv2/h;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ls5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lv2/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lv2/c;

    .line 7
    .line 8
    iget v1, v0, Lv2/c;->u:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lv2/c;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lv2/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lv2/c;-><init>(Lv2/d;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lv2/c;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lv2/c;->u:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lv2/c;->q:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, LU5/e;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_5

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object v1, v0, Lv2/c;->r:LU5/e;

    .line 58
    .line 59
    iget-object v3, v0, Lv2/c;->q:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lv2/d;

    .line 62
    .line 63
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p0, v0, Lv2/c;->q:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object p1, p0, Lv2/d;->c:LU5/e;

    .line 74
    .line 75
    iput-object p1, v0, Lv2/c;->r:LU5/e;

    .line 76
    .line 77
    iput v3, v0, Lv2/c;->u:I

    .line 78
    .line 79
    move-object v1, p1

    .line 80
    check-cast v1, LU5/h;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, LU5/h;->a(Ls5/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v4, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v3, p0

    .line 90
    :goto_1
    :try_start_1
    new-instance v1, LI2/d;

    .line 91
    .line 92
    const/16 v5, 0x16

    .line 93
    .line 94
    invoke-direct {v1, v5, v3}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, v0, Lv2/c;->q:Ljava/lang/Object;

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    iput-object v3, v0, Lv2/c;->r:LU5/e;

    .line 101
    .line 102
    iput v2, v0, Lv2/c;->u:I

    .line 103
    .line 104
    sget-object v2, Lq5/i;->q:Lq5/i;

    .line 105
    .line 106
    new-instance v5, LM5/Z;

    .line 107
    .line 108
    invoke-direct {v5, v1, v3}, LM5/Z;-><init>(LB5/a;Lq5/c;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v5, v0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    if-ne v0, v4, :cond_5

    .line 116
    .line 117
    :goto_2
    return-object v4

    .line 118
    :cond_5
    move-object v6, v0

    .line 119
    move-object v0, p1

    .line 120
    move-object p1, v6

    .line 121
    :goto_3
    :try_start_2
    check-cast p1, Lv2/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    .line 123
    check-cast v0, LU5/h;

    .line 124
    .line 125
    invoke-virtual {v0}, LU5/h;->c()V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :goto_4
    move-object v6, v0

    .line 130
    move-object v0, p1

    .line 131
    move-object p1, v6

    .line 132
    goto :goto_5

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto :goto_4

    .line 135
    :goto_5
    check-cast v0, LU5/h;

    .line 136
    .line 137
    invoke-virtual {v0}, LU5/h;->c()V

    .line 138
    .line 139
    .line 140
    throw p1
.end method
