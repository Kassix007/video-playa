.class public final Lx2/k;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lx2/l;

.field public r:Lk3/a;

.field public s:Ljava/lang/Object;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lx2/l;

.field public v:I


# direct methods
.method public constructor <init>(Lx2/l;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/k;->u:Lx2/l;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lx2/k;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lx2/k;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lx2/k;->v:I

    .line 9
    .line 10
    iget-object p1, p0, Lx2/k;->u:Lx2/l;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lx2/l;->a(Lq5/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
