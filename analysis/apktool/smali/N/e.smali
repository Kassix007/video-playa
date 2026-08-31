.class public final LN/e;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LN/f;

.field public r:Ljava/lang/Object;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LN/f;

.field public u:I


# direct methods
.method public constructor <init>(LN/f;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/e;->t:LN/f;

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
    iput-object p1, p0, LN/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LN/e;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LN/e;->u:I

    .line 9
    .line 10
    iget-object p1, p0, LN/e;->t:LN/f;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LN/f;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
