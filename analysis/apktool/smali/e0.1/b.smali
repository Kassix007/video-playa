.class public final Le0/b;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Le0/c;

.field public r:LO5/b;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Le0/c;

.field public u:I


# direct methods
.method public constructor <init>(Le0/c;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le0/b;->t:Le0/c;

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
    iput-object p1, p0, Le0/b;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Le0/b;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Le0/b;->u:I

    .line 9
    .line 10
    iget-object p1, p0, Le0/b;->t:Le0/c;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Le0/c;->d(Ls5/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
