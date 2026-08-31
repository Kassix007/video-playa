.class public final LP5/Q;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LP5/S;

.field public r:LP5/i;

.field public s:LP5/T;

.field public t:LM5/b0;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:LP5/S;

.field public x:I


# direct methods
.method public constructor <init>(LP5/S;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP5/Q;->w:LP5/S;

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
    iput-object p1, p0, LP5/Q;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP5/Q;->x:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP5/Q;->x:I

    .line 9
    .line 10
    iget-object p1, p0, LP5/Q;->w:LP5/S;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LP5/S;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 17
    .line 18
    return-object p1
.end method
