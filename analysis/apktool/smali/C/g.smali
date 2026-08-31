.class public final LC/g;
.super LE/C;
.source "SourceFile"


# instance fields
.field public final b:LE/Y;


# direct methods
.method public constructor <init>(LB5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE/Y;

    .line 5
    .line 6
    invoke-direct {v0}, LE/Y;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LC/g;->b:LE/Y;

    .line 10
    .line 11
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final k()LE/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LC/g;->b:LE/Y;

    .line 2
    .line 3
    return-object v0
.end method
