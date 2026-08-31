.class public final Lp3/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Lp3/t;

.field public B:Ljava/util/ArrayList;

.field public C:Lp3/C;

.field public D:Ljava/lang/Integer;

.field public E:Ljava/lang/Boolean;

.field public F:LE/c0;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Ljava/lang/String;

.field public J:Ljava/lang/Boolean;

.field public K:Ljava/lang/Boolean;

.field public L:Lp3/b0;

.field public M:Ljava/lang/Float;

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;

.field public P:Lp3/b0;

.field public Q:Ljava/lang/Float;

.field public R:Lp3/b0;

.field public S:Ljava/lang/Float;

.field public T:I

.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:I

.field public Z:I

.field public a0:I

.field public b0:I

.field public c0:I

.field public q:J

.field public r:Lp3/b0;

.field public s:Ljava/lang/Float;

.field public t:Lp3/b0;

.field public u:Ljava/lang/Float;

.field public v:Lp3/C;

.field public w:Ljava/lang/Float;

.field public x:[Lp3/C;

.field public y:Lp3/C;

.field public z:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lp3/S;->q:J

    .line 7
    .line 8
    return-void
.end method

.method public static a()Lp3/S;
    .locals 8

    .line 1
    new-instance v0, Lp3/S;

    .line 2
    .line 3
    invoke-direct {v0}, Lp3/S;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, Lp3/S;->q:J

    .line 9
    .line 10
    sget-object v1, Lp3/t;->r:Lp3/t;

    .line 11
    .line 12
    iput-object v1, v0, Lp3/S;->r:Lp3/b0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput v2, v0, Lp3/S;->T:I

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iput-object v4, v0, Lp3/S;->s:Ljava/lang/Float;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iput-object v5, v0, Lp3/S;->t:Lp3/b0;

    .line 27
    .line 28
    iput-object v4, v0, Lp3/S;->u:Ljava/lang/Float;

    .line 29
    .line 30
    new-instance v6, Lp3/C;

    .line 31
    .line 32
    invoke-direct {v6, v3}, Lp3/C;-><init>(F)V

    .line 33
    .line 34
    .line 35
    iput-object v6, v0, Lp3/S;->v:Lp3/C;

    .line 36
    .line 37
    iput v2, v0, Lp3/S;->U:I

    .line 38
    .line 39
    iput v2, v0, Lp3/S;->V:I

    .line 40
    .line 41
    const/high16 v3, 0x40800000    # 4.0f

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, v0, Lp3/S;->w:Ljava/lang/Float;

    .line 48
    .line 49
    iput-object v5, v0, Lp3/S;->x:[Lp3/C;

    .line 50
    .line 51
    new-instance v3, Lp3/C;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v3, v6}, Lp3/C;-><init>(F)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Lp3/S;->y:Lp3/C;

    .line 58
    .line 59
    iput-object v4, v0, Lp3/S;->z:Ljava/lang/Float;

    .line 60
    .line 61
    iput-object v1, v0, Lp3/S;->A:Lp3/t;

    .line 62
    .line 63
    iput-object v5, v0, Lp3/S;->B:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v3, Lp3/C;

    .line 66
    .line 67
    const/high16 v6, 0x41400000    # 12.0f

    .line 68
    .line 69
    const/4 v7, 0x7

    .line 70
    invoke-direct {v3, v7, v6}, Lp3/C;-><init>(IF)V

    .line 71
    .line 72
    .line 73
    iput-object v3, v0, Lp3/S;->C:Lp3/C;

    .line 74
    .line 75
    const/16 v3, 0x190

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, v0, Lp3/S;->D:Ljava/lang/Integer;

    .line 82
    .line 83
    iput v2, v0, Lp3/S;->W:I

    .line 84
    .line 85
    iput v2, v0, Lp3/S;->X:I

    .line 86
    .line 87
    iput v2, v0, Lp3/S;->Y:I

    .line 88
    .line 89
    iput v2, v0, Lp3/S;->Z:I

    .line 90
    .line 91
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v3, v0, Lp3/S;->E:Ljava/lang/Boolean;

    .line 94
    .line 95
    iput-object v5, v0, Lp3/S;->F:LE/c0;

    .line 96
    .line 97
    iput-object v5, v0, Lp3/S;->G:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v5, v0, Lp3/S;->H:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v0, Lp3/S;->I:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v3, v0, Lp3/S;->J:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object v3, v0, Lp3/S;->K:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v1, v0, Lp3/S;->L:Lp3/b0;

    .line 108
    .line 109
    iput-object v4, v0, Lp3/S;->M:Ljava/lang/Float;

    .line 110
    .line 111
    iput-object v5, v0, Lp3/S;->N:Ljava/lang/String;

    .line 112
    .line 113
    iput v2, v0, Lp3/S;->a0:I

    .line 114
    .line 115
    iput-object v5, v0, Lp3/S;->O:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v5, v0, Lp3/S;->P:Lp3/b0;

    .line 118
    .line 119
    iput-object v4, v0, Lp3/S;->Q:Ljava/lang/Float;

    .line 120
    .line 121
    iput-object v5, v0, Lp3/S;->R:Lp3/b0;

    .line 122
    .line 123
    iput-object v4, v0, Lp3/S;->S:Ljava/lang/Float;

    .line 124
    .line 125
    iput v2, v0, Lp3/S;->b0:I

    .line 126
    .line 127
    iput v2, v0, Lp3/S;->c0:I

    .line 128
    .line 129
    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lp3/S;

    .line 6
    .line 7
    iget-object v1, p0, Lp3/S;->x:[Lp3/C;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, [Lp3/C;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, [Lp3/C;

    .line 16
    .line 17
    iput-object v1, v0, Lp3/S;->x:[Lp3/C;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
