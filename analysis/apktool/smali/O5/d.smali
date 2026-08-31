.class public final LO5/d;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LO5/e;

.field public s:I


# direct methods
.method public constructor <init>(LO5/e;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/d;->r:LO5/e;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, LO5/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LO5/d;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LO5/d;->s:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    iget-object v0, p0, LO5/d;->r:LO5/e;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, LO5/e;->D(LO5/m;IJLs5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance v0, LO5/l;

    .line 27
    .line 28
    invoke-direct {v0, p1}, LO5/l;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
