.class public abstract Le2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final endVersion:I

.field public final startVersion:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Le2/b;->startVersion:I

    .line 5
    .line 6
    iput p2, p0, Le2/b;->endVersion:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract migrate(Lj2/a;)V
.end method
