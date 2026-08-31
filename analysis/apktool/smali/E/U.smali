.class public final LE/U;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/A0;


# instance fields
.field public E:LB5/a;

.field public F:LE/P;

.field public G:Lw/d0;

.field public H:Z

.field public I:LI0/g;

.field public final J:LE/S;

.field public K:LE/S;


# direct methods
.method public constructor <init>(LB5/a;LE/P;Lw/d0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/U;->E:LB5/a;

    .line 5
    .line 6
    iput-object p2, p0, LE/U;->F:LE/P;

    .line 7
    .line 8
    iput-object p3, p0, LE/U;->G:Lw/d0;

    .line 9
    .line 10
    iput-boolean p4, p0, LE/U;->H:Z

    .line 11
    .line 12
    new-instance p1, LE/S;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, LE/S;-><init>(LE/U;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LE/U;->J:LE/S;

    .line 19
    .line 20
    invoke-virtual {p0}, LE/U;->x0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final A(LI0/i;)V
    .locals 7

    .line 1
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 2
    .line 3
    sget-object v0, LI0/p;->m:LI0/s;

    .line 4
    .line 5
    sget-object v1, LI0/r;->a:[LH5/k;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    aget-object v2, v1, v2

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, LI0/p;->I:LI0/s;

    .line 16
    .line 17
    iget-object v2, p0, LE/U;->J:LE/S;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LE/U;->G:Lw/d0;

    .line 23
    .line 24
    sget-object v2, Lw/d0;->q:Lw/d0;

    .line 25
    .line 26
    const-string v3, "scrollAxisRange"

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, LE/U;->I:LI0/g;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v2, LI0/p;->t:LI0/s;

    .line 36
    .line 37
    const/16 v3, 0xb

    .line 38
    .line 39
    aget-object v3, v1, v3

    .line 40
    .line 41
    invoke-virtual {v2, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v4

    .line 49
    :cond_1
    iget-object v0, p0, LE/U;->I:LI0/g;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    sget-object v2, LI0/p;->s:LI0/s;

    .line 54
    .line 55
    const/16 v3, 0xa

    .line 56
    .line 57
    aget-object v3, v1, v3

    .line 58
    .line 59
    invoke-virtual {v2, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-object v0, p0, LE/U;->K:LE/S;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v2, LI0/h;->f:LI0/s;

    .line 67
    .line 68
    new-instance v3, LI0/a;

    .line 69
    .line 70
    invoke-direct {v3, v4, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    new-instance v0, LE/Q;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v0, p0, v2}, LE/Q;-><init>(LE/U;I)V

    .line 80
    .line 81
    .line 82
    sget-object v2, LI0/h;->A:LI0/s;

    .line 83
    .line 84
    new-instance v3, LI0/a;

    .line 85
    .line 86
    new-instance v5, LB0/a;

    .line 87
    .line 88
    const/16 v6, 0xf

    .line 89
    .line 90
    invoke-direct {v5, v6, v0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v3, v4, v5}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v2, v3}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, LE/U;->F:LE/P;

    .line 100
    .line 101
    invoke-interface {v0}, LE/P;->c()LI0/b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v2, LI0/p;->f:LI0/s;

    .line 106
    .line 107
    const/16 v3, 0x15

    .line 108
    .line 109
    aget-object v1, v1, v3

    .line 110
    .line 111
    invoke-virtual {v2, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v4
.end method

.method public final m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final x0()V
    .locals 4

    .line 1
    new-instance v0, LI0/g;

    .line 2
    .line 3
    new-instance v1, LE/Q;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, LE/Q;-><init>(LE/U;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, LE/Q;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-direct {v2, p0, v3}, LE/Q;-><init>(LE/U;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LI0/g;-><init>(LE/Q;LE/Q;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LE/U;->I:LI0/g;

    .line 19
    .line 20
    iget-boolean v0, p0, LE/U;->H:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, LE/S;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, LE/S;-><init>(LE/U;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, LE/U;->K:LE/S;

    .line 33
    .line 34
    return-void
.end method
