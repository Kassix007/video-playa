.class public LS1/a;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# static fields
.field public static final c:LJ1/J;


# instance fields
.field public final b:Lr/S;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ1/J;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LJ1/J;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LS1/a;->c:LJ1/J;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr/S;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lr/S;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LS1/a;->b:Lr/S;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, LS1/a;->b:Lr/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/S;->f()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-gtz v1, :cond_1

    .line 9
    .line 10
    iget v1, v0, Lr/S;->t:I

    .line 11
    .line 12
    iget-object v3, v0, Lr/S;->s:[Ljava/lang/Object;

    .line 13
    .line 14
    move v4, v2

    .line 15
    :goto_0
    if-ge v4, v1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    aput-object v5, v3, v4

    .line 19
    .line 20
    add-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput v2, v0, Lr/S;->t:I

    .line 24
    .line 25
    iput-boolean v2, v0, Lr/S;->q:Z

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {v0, v2}, Lr/S;->g(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/ClassCastException;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw v0
.end method
